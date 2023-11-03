/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ORM;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface FilmInterface {
    boolean create();
    DefaultTableModel read();
    boolean delete();
    boolean update();
}
