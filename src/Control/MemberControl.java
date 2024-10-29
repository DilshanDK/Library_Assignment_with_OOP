package Control;

import Model.Member;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MemberControl {

    Connection conn = DBconnection.connect();

    public void addMember(Member m, JTable mTable, String mSearch) {
        String name = m.getMName();
        String conNo = m.getMConNo();
        int cardNo = m.getMCardNo();
        int expYear = m.getMExpYear();
        String type = m.getMType();

        String sqlAddExiste = "SELECT * FROM `members` WHERE `mName`=? AND `mContact`=? AND  `mType`=? ";

        try {
            PreparedStatement stmtc = conn.prepareStatement(sqlAddExiste);
            stmtc.setString(1, name);
            stmtc.setString(2, conNo);
            stmtc.setString(3, type);

            ResultSet rowsAffected = stmtc.executeQuery();
            if (rowsAffected.next()) {
                JOptionPane.showMessageDialog(null, "The Member is Existing!");
            } else {
                String sqlAdd = "INSERT INTO `members`( `mName`, `mContact`, `mType`,`mCardNo`,`mExpYear`) VALUES (?,?,?,?,?)";
                try {
                    PreparedStatement stmt = conn.prepareStatement(sqlAdd);
                    stmt.setString(1, name);
                    stmt.setString(2, conNo);
                    stmt.setString(3, type);
                    stmt.setInt(4, cardNo);
                    stmt.setInt(5, expYear);
                    int rowsAffecteda = stmt.executeUpdate();
                    if (rowsAffecteda > 0) {
                        JOptionPane.showMessageDialog(null, "Member added to Database");
                        showOnTable(mTable, mSearch);
                    } else {
                        JOptionPane.showMessageDialog(null, "No rows affected. Please try again.");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "error1 " + e);
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error2 " + e);
        }
    }

    public void updateMemberDetails(Member m, JTable mTable, String mSearch, String mtd[]) {
        String name = m.getMName();
        String conNo = m.getMConNo();
        String type = m.getMType();

        String sqlUpdate = "UPDATE `members` SET `mName`=?, `mContact`=?, `mType`=? WHERE `mName`=? AND `mContact`=? AND `mType`=?;";

        try {
            PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
            stmtUpdate.setString(1, name); // New title
            stmtUpdate.setString(2, conNo); // New author
            stmtUpdate.setString(3, type); // New year
            stmtUpdate.setString(4, mtd[0]);
            stmtUpdate.setString(5, mtd[1]);
            stmtUpdate.setString(6, mtd[2]);

            int rowsAffected = stmtUpdate.executeUpdate();
            if (0 == rowsAffected) {
                JOptionPane.showMessageDialog(null, "No changes were made to the member details.");
            } else {
                JOptionPane.showMessageDialog(null, "Member details updated successfully.");
                showOnTable(mTable, mSearch); // Refresh table data if necessary
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating the book: " + e.getMessage());
        }

    }

    public void showOnTable(JTable mTable, String mSearch) {

        String query = "SELECT mId,mName,mContact,mCardNo,mExpYear,mType FROM members  WHERE mStatus='0'";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Member Name");
            model.addColumn("Contact No");
            model.addColumn("Card Number");
            model.addColumn("Membership Expire Year");
            model.addColumn("Member Type");

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("mId");  // Assuming 'id' is the primary key
                row[1] = rs.getString("mName");
                row[2] = rs.getString("mContact");
                row[3] = rs.getInt("mCardNo");
                row[4] = rs.getInt("mExpYear");
                row[5] = "u".equals(rs.getString("mType")) ? "User" : "Admin";

                model.addRow(row);
            }
            mTable.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data:1" + e.getMessage());
        }
    }

    public void searchMember(String name, String id, JTable mTable) {
        String query = "SELECT * FROM members WHERE mStatus='0' AND  `mName`  LIKE ? OR `mId` LIKE ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + name + "%");
            stmt.setString(2, "%" + id + "%");
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Member Name");
            model.addColumn("Contact No");
            model.addColumn("Card Number");
            model.addColumn("Membership Expire Year");
            model.addColumn("Member Type");

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("mId");  // Assuming 'id' is the primary key
                row[1] = rs.getString("mName");
                row[2] = rs.getString("mContact");
                row[3] = rs.getInt("mCardNo");
                row[4] = rs.getInt("mExpYear");
                row[5] = "u".equals(rs.getString("mType")) ? "User" : "Admin";

                model.addRow(row);
            }

            // Set the model to the JTable
            mTable.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data:2 " + e.getMessage());
        }
    }

    public void deleteMember(JTable mTable, String mSearch, String mtd[]) {

        String sqlDelete = "UPDATE `members` SET `mStatus`='1' WHERE `mName` = ?  AND `mContact`=? AND `mType`=? ";

        try {
            PreparedStatement stmtDelete = conn.prepareStatement(sqlDelete);
            stmtDelete.setString(1, mtd[0]);
            stmtDelete.setString(2, mtd[1]);
            stmtDelete.setString(3, mtd[2]);

            int rowsAffected = stmtDelete.executeUpdate();
            if (0 == rowsAffected) {

            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Deleting the member: " + e.getMessage());
        }

    }

    public String[] getDataFromtable(JTable mTable) {
        int selectedRow = mTable.getSelectedRow();

        String mtd[] = new String[3];
        if (selectedRow != -1) { // Ensure a row is selected
            mtd[0] = mTable.getValueAt(selectedRow, 1).toString();
            mtd[1] = mTable.getValueAt(selectedRow, 2).toString();
            mtd[2] = "Admin".equals(mTable.getValueAt(selectedRow, 5).toString()) ? "a" : "u";
        }
        return mtd;
    }

    public void textFieldClear(JTextField txtMName, JTextField txtMConNo, JRadioButton checkAdmin, JRadioButton checkUser) {
        txtMName.setText("");
        txtMConNo.setText("");
        checkAdmin.setSelected(false);
        checkUser.setSelected(false);
    }

    public String[] displayDetails(int mId) {

        String query = "SELECT mId,mName,mContact,mCardNo,mExpYear,mType FROM members  WHERE mStatus='0' And mId=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, mId);
            ResultSet rs = stmt.executeQuery();

            String details[] = new String[5];

            while (rs.next()) {
                details[0] = rs.getString("mId");
                details[1] = rs.getString("mName");
                details[2] = rs.getString("mContact");
                details[3] = Integer.toString(rs.getInt("mCardNo"));
                details[4] = Integer.toString(rs.getInt("mExpYear"));
            }
            return details;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data:1" + e.getMessage());
        }
        return null;
    }

    public void updatePass(String pass, int mId) {
        if (!pass.isEmpty()) {
            if (pass.length() > 2 && pass.length() < 12) {
                String sqlUpdate = "UPDATE `members` SET `mPass`=? WHERE `mId`=? ;";

                try {
                    PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
                    stmtUpdate.setString(1, pass);
                    stmtUpdate.setInt(2, mId);
                    int rowsAffected = stmtUpdate.executeUpdate();

                    if (0 == rowsAffected) {
                        JOptionPane.showMessageDialog(null, "No changes were made to the member details.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Your Password updated successfully.");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error updating " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter 3-12 Charactor Password!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter Valid Password!");

        }

    }

}
