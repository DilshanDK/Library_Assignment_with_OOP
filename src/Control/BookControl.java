package Control;

import Model.Book;
import com.toedter.calendar.JYearChooser;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BookControl {

    Connection conn = DBconnection.connect();

    public void showOnTable(JTable bTable, String bSearch) {

        String query = "SELECT * FROM books  WHERE bStatus='0'";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Book Name");
            model.addColumn("Author");
            model.addColumn("Year Published");

            while (rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getInt("bId");  // Assuming 'id' is the primary key
                row[1] = rs.getString("bName");
                row[2] = rs.getString("bAuthor");
                row[3] = rs.getInt("bYearPublished");
                model.addRow(row);
            }
            bTable.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data:1" + e.getMessage());
        }
    }

    public void searchBook(String title, JTable bTable) {
        String query = "SELECT * FROM books WHERE bStatus='0' AND `bName` LIKE ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            // Add '%' wildcards around the title before setting it
            stmt.setString(1, "%" + title + "%");

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Book Name");
            model.addColumn("Author");
            model.addColumn("Year Published");

            while (rs.next()) {
                Object row[] = new Object[4];
                row[0] = rs.getInt("bId");
                row[1] = rs.getString("bName");
                row[2] = rs.getString("bAuthor");
                row[3] = rs.getInt("bYearPublished");

                model.addRow(row);
            }

            // Set the model to the JTable
            bTable.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }

    }

    public void searchBook(String title, String author, JTable bTable) {
        String query = "SELECT * FROM books WHERE bStatus='0' AND  `bName`  LIKE ? OR `bAuthor` LIKE ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + title + "%");
            stmt.setString(2, "%" + title + "%");
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("ID");
            model.addColumn("Book Name");
            model.addColumn("Author");
            model.addColumn("Year Published");

            while (rs.next()) {
                Object row[] = new Object[4];
                row[0] = rs.getInt("bId");  // Assuming 'id' is the primary key
                row[1] = rs.getString("bName");
                row[2] = rs.getString("bAuthor");
                row[3] = rs.getInt("bYearPublished");

                model.addRow(row);
            }

            // Set the model to the JTable
            bTable.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data:2 " + e.getMessage());
        }
    }

    public void addBook(Book b, JTable bTable, String bSearch) {
        String title = b.getTitle();
        String author = b.getAuthor();
        int year = b.getYear();

        if (!title.isEmpty() && !author.isEmpty()) {

            String sqlAddExiste = "SELECT * FROM `books` WHERE `bName`=? AND `bAuthor`=? AND `bYearPublished`=?;";
            try {
                PreparedStatement stmtc = conn.prepareStatement(sqlAddExiste);
                stmtc.setString(1, title);
                stmtc.setString(2, author);
                stmtc.setInt(3, year);
                ResultSet rowsAffected = stmtc.executeQuery();
                if (rowsAffected.next()) {
                    JOptionPane.showMessageDialog(null, "The Book is Existing!");
                } else {
                    String sqlAdd = "INSERT INTO `books`( `bName`, `bAuthor`, `bYearPublished`) VALUES (?,?,?)";
                    try {
                        PreparedStatement stmt = conn.prepareStatement(sqlAdd);
                        stmt.setString(1, title);
                        stmt.setString(2, author);
                        stmt.setInt(3, year);
                        int rowsAffecteda = stmt.executeUpdate();
                        if (rowsAffecteda > 0) {
                            JOptionPane.showMessageDialog(null, "Book added to Database");
                            showOnTable(bTable, bSearch);
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
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
        }
    }

    public void updateBookDetails(Book b, JTable bTable, String search, String btd[]) {
        String title = b.getTitle();
        String author = b.getAuthor();
        int year = b.getYear();

        String sqlUpdate = "UPDATE `books` SET `bName`=?, `bAuthor`=?, `bYearPublished`=? WHERE `bName`=? AND `bAuthor`=? AND `bYearPublished`=?;";

        try {
            PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
            stmtUpdate.setString(1, title); // New title
            stmtUpdate.setString(2, author); // New author
            stmtUpdate.setInt(3, year); // New year
            stmtUpdate.setString(4, btd[0]);
            stmtUpdate.setString(5, btd[1]);
            stmtUpdate.setInt(6, Integer.parseInt(btd[2]));

            int rowsAffected = stmtUpdate.executeUpdate();
            System.out.println(rowsAffected);
            if (0 == rowsAffected) {
                JOptionPane.showMessageDialog(null, "No changes were made to the book details.");
            } else {
                JOptionPane.showMessageDialog(null, "Book details updated successfully.");
                showOnTable(bTable, search); // Refresh table data if necessary
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating the book: " + e.getMessage());
        }

    }

    public void deleteBook(JTable bTable, String search, String td[]) {

        String sqlDelete = "UPDATE `books` SET `bStatus`='1' WHERE `bName` = ?  AND `bAuthor` = ?   AND `bYearPublished` = ?;";

        try {
            PreparedStatement stmtDelete = conn.prepareStatement(sqlDelete);
            stmtDelete.setString(1, td[0]);
            stmtDelete.setString(2, td[1]);
            stmtDelete.setInt(3, Integer.parseInt(td[2]));

            int rowsAffected = stmtDelete.executeUpdate();
            System.out.println(rowsAffected);
            if (0 == rowsAffected) {

            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Deleting the book: " + e.getMessage());
        }

    }

    public String[] getDataFromtable(JTable bTable) {
        int selectedRow = bTable.getSelectedRow();

        String td[] = new String[3];
        if (selectedRow != -1) { // Ensure a row is selected
            td[0] = bTable.getValueAt(selectedRow, 1).toString();
            td[1] = bTable.getValueAt(selectedRow, 2).toString();
            td[2] = bTable.getValueAt(selectedRow, 3).toString();
        }
        return td;
    }

    public void textFieldClear(JTextField txtBName, JTextField txtBAuthor, JYearChooser txtBYear) {
        txtBName.setText("");
        txtBAuthor.setText("");
        txtBYear.setYear(2024);
    }

}
