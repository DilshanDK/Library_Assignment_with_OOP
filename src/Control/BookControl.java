package Control;

import Model.Book;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookControl {

    Connection conn = DBconnection.connect();

    public void showOnTable(JTable bTable) {
        String query = "SELECT * FROM books";
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

            // Set the model to the JTable
            bTable.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }

    public void addBook(Book b, JTable bTable) {
        String title = b.getTitle();
        String author = b.getAuthor();
        int year = b.getYear();

        if (!title.isEmpty() && !author.isEmpty()) {
            String sqlAdd = "INSERT INTO `books`( `bName`, `bAuthor`, `bYearPublished`) VALUES (?,?,?)";
            try {
                PreparedStatement stmt = conn.prepareStatement(sqlAdd);
                stmt.setString(1, title);
                stmt.setString(2, author);
                stmt.setInt(3, year);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Book added to Database");
                } else {
                    JOptionPane.showMessageDialog(null, "No rows affected. Please try again.");
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
        }
        showOnTable(bTable);
    }

}
