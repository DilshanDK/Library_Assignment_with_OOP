package Model;

import Control.DBconnection;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class MembershipCard {

    Connection conn = DBconnection.connect();

    private int currentYear;
    private int memberId;
    private int cardNumber;

    public MembershipCard() {
        this.currentYear = LocalDate.now().getYear();
        String sqlId = "SELECT mId FROM members ORDER BY mId DESC LIMIT 1";

        try {
            PreparedStatement stmt = conn.prepareStatement(sqlId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                this.memberId = rs.getInt("mId");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        this.cardNumber = memberId+9000;
        cardNumber++;
    }

    public int getExpYear() {
        return currentYear += 2;
    }
    
    public int getcardNumber() {
        return cardNumber;
    }

}
