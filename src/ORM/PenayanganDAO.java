/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ORM;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface PenayanganDAO {
    boolean tambahPenayangan(Penayangan penayangan);
    boolean updatePenayangan(Penayangan penayangan);
    boolean deletePenayangan(String idPenayangan, String filmId);
    DefaultTableModel readPenayangan();
    List<Penayangan> getAllPenayangan();
}
