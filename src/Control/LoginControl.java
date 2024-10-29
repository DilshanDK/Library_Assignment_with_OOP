package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import View.AdminFrame;
import View.LoginFrame;
import View.MemberFrame;

public class LoginControl {

    Connection conn = DBconnection.connect();
    private int mId;

    public void login(String username, String pass, LoginFrame lf) {

        String sqlLog = "SELECT * FROM members WHERE mStatus=0 And (mId = ? OR mName=?)  AND mPass = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sqlLog);
            stmt.setString(1, username);
            stmt.setString(2, username);
            stmt.setString(3, pass);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                mId = rs.getInt("mId");
                if ("u".equals(rs.getString("mType"))) {
                    lf.dispose();
                    new MemberFrame(mId).setVisible(true);

                } else {
                    lf.dispose();
                    new AdminFrame().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
}
