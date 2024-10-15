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

    public void login(String username, String pass, LoginFrame lf) {

        String sqlLog = "SELECT * FROM members WHERE mId = ? AND mPass = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sqlLog);
            stmt.setString(1, username);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                if ("u".equals(rs.getString("mType"))) {
                    lf.dispose();
                    new MemberFrame().setVisible(true);
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
