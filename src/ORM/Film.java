package ORM;

import database.databases1;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

final public class Film {
    final public String idFilm;
    final public String judul;
    final public String durasi;
    final public String genre;
    final public String superAdminId;
    
    public Film(String idFilm, String judul, String durasi, String genre, String superAdminId) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
        this.superAdminId = superAdminId;
    }
    
    final public boolean create() {
        final Connection conn = databases1.configDB();
        final String query = "INSERT INTO film (Id_Film, Judul, Durasi, Genre, SuperAdmin_Id_SuperAdmin) VALUES (?, ?, ?, ?, ?)";
            
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.idFilm);
            preparedStatement.setString(2, this.judul);
            preparedStatement.setString(3, this.durasi);
            preparedStatement.setString(4, this.genre);
            preparedStatement.setString(5, this.superAdminId);
                
            int rowsAffected = preparedStatement.executeUpdate();
                
            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        } 
    }

    final public DefaultTableModel read() {
        final Connection conn = databases1.configDB();
        final String query = "SELECT Id_Film, Judul, Durasi, Genre FROM film";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Film");
        model.addColumn("Judul");
        model.addColumn("Durasi");
        model.addColumn("Genre");

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                String idFilm = result.getString("Id_Film");
                String judul = result.getString("Judul");
                String durasi = result.getString("Durasi");
                String genre = result.getString("Genre");

                model.addRow(new Object[]{idFilm, judul, durasi, genre});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

        return model;
    }
    
    final public boolean delete() {
        final Connection conn = databases1.configDB();
        final String query = "DELETE FROM film WHERE Id_Film = ? AND Judul = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, idFilm);
            preparedStatement.setString(2, judul);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        }
    }
    
    final public boolean update() {
        final Connection conn = databases1.configDB();
        final String query = "UPDATE film SET Judul = ?, Durasi = ?, Genre = ? WHERE Id_Film = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.judul);
            preparedStatement.setString(2, this.durasi);
            preparedStatement.setString(3, this.genre);
            preparedStatement.setString(4, this.idFilm);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        }
    }
}
