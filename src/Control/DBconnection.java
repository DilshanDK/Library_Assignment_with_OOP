package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DBconnection {

    public static Connection connect() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            Class.forName("com.mysql.cj.jdbc.Driver");
//            JOptionPane.showMessageDialog(null, "Database connected!");

            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Not connected!"+e);
        }
        return null;
    }

    public PreparedStatement prepareStatement(String sqlLog) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
