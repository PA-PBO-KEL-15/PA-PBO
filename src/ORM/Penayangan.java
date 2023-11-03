package ORM;

import database.databases1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

final public class Penayangan {
    public String idPenayangan;
    public Date tanggal;
    public String waktu;
    public String adminId;
    public String filmId;
    public String studio;

    public String getIdPenayangan() {
        return idPenayangan;
    }

    public void setIdPenayangan(String idPenayangan) {
        this.idPenayangan = idPenayangan;
    }


    final public static Penayangan getPenayanganById(String idPenayangan) {


        Penayangan penayangan = new Penayangan();
        penayangan.setIdPenayangan(idPenayangan);

        return penayangan;
    }

    public Penayangan(String idPenayangan, Date tanggal, String waktu, String adminId, String filmId, String studio) {
        this.idPenayangan = idPenayangan;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.adminId = adminId;
        this.filmId = filmId;
        this.studio = studio;
    }

    public Penayangan() {
    
    }
    
        final public DefaultTableModel readPenayangan() {
        Connection conn = databases1.configDB();
        String query = "SELECT Id_Penayangan, Tanggal, Waktu, Film_Id_Film, Studio_Nomor FROM penayangan";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Penayangan");
        model.addColumn("Tanggal");
        model.addColumn("Waktu");
        model.addColumn("Id Film");
        model.addColumn("Studio");

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                String idPenayangan = result.getString("Id_Penayangan");
                String tanggal = result.getString("Tanggal");
                String waktu = result.getString("Waktu");
                String idFilm = result.getString("Film_Id_Film");
                String studio = result.getString("Studio_Nomor");

                model.addRow(new Object[]{idPenayangan, tanggal, waktu, idFilm, studio});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

        return model;
    }

    final public boolean tambahPenayangan() {
        try {
            Connection conn = databases1.configDB();
            String query = "INSERT INTO Penayangan (Id_Penayangan, Tanggal, Waktu, Admin_Id_Admin, Film_Id_Film, Studio_Nomor) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, idPenayangan);
            preparedStatement.setDate(2, tanggal);
            preparedStatement.setString(3, waktu);
            preparedStatement.setString(4, adminId);
            preparedStatement.setString(5, filmId);
            preparedStatement.setString(6, studio);

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    final public boolean updatePenayangan() {
        try {
            Connection conn = databases1.configDB();
            String query = "UPDATE penayangan SET Tanggal = ?, Waktu = ? WHERE Id_Penayangan = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setDate(1, tanggal);
            preparedStatement.setString(2, waktu);
            preparedStatement.setString(3, idPenayangan);

            int rowsUpdated = preparedStatement.executeUpdate();

            return rowsUpdated > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;   
        }
    }

    final public boolean deletePenayangan() {
        try {
            Connection conn = databases1.configDB();
            String query = "DELETE FROM Penayangan WHERE Id_Penayangan = ? AND Film_Id_Film = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, idPenayangan);
            preparedStatement.setString(2, filmId);

            int rowsDeleted = preparedStatement.executeUpdate();

            return rowsDeleted > 0;
        } catch (SQLException e) {
            return false;
        }
    }


    final public static List<Penayangan> getAllPenayangan() {
        List<Penayangan> penayanganList = new ArrayList<>();
        try {
            Connection conn = databases1.configDB();
            String query = "SELECT * FROM Penayangan";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                Penayangan penayangan = new Penayangan(
                    result.getString("Id_Penayangan"),
                    result.getDate("Tanggal"),
                    result.getString("Waktu"),
                    result.getString("Admin_Id_Admin"),
                    result.getString("Film_Id_Film"),
                    result.getString("Studio_Nomor")
                );

                penayanganList.add(penayangan);
            }
        } catch (SQLException e) {

        }
        return penayanganList;
    }
}
