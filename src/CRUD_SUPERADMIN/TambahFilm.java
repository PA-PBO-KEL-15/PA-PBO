/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUD_SUPERADMIN;

import database.databases1;
import ORM.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet; 
import javax.swing.JOptionPane;
import models.SuperAdmin;

public final class TambahFilm extends javax.swing.JFrame {
    public SuperAdmin superadmin;

    public TambahFilm(SuperAdmin superadmin) {
        this.superadmin = superadmin;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Durasi_Film = new javax.swing.JTextField();
        Genre_Film = new javax.swing.JTextField();
        ID_Film = new javax.swing.JTextField();
        Judul_Film = new javax.swing.JTextField();
        Tambah_Film = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(632, 308));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CGY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 40, 130, 60);
        jPanel1.add(Durasi_Film);
        Durasi_Film.setBounds(240, 210, 220, 30);

        Genre_Film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Genre_FilmActionPerformed(evt);
            }
        });
        jPanel1.add(Genre_Film);
        Genre_Film.setBounds(240, 250, 220, 30);

        ID_Film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_FilmActionPerformed(evt);
            }
        });
        jPanel1.add(ID_Film);
        ID_Film.setBounds(240, 130, 220, 30);
        jPanel1.add(Judul_Film);
        Judul_Film.setBounds(240, 170, 220, 30);

        Tambah_Film.setText("Tambah");
        Tambah_Film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tambah_FilmActionPerformed(evt);
            }
        });
        jPanel1.add(Tambah_Film);
        Tambah_Film.setBounds(480, 250, 73, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Id Film :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 140, 50, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("  Judul :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 180, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText(" Genre :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 260, 50, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Durasi :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 220, 50, 20);

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kembali);
        Kembali.setBounds(10, 20, 80, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTO/FOTO GUI/CRUD.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 640, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tambah_FilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tambah_FilmActionPerformed
        String Id_Film = ID_Film.getText();
        String Judul = Judul_Film.getText();
        String Durasi = Durasi_Film.getText();
        String Genre = Genre_Film.getText();

        
        Connection conn = databases1.configDB();
        
        if (isIdSuperAdminValid(this.superadmin.Id_SuperAdmin, conn)) {
            Film film = new Film(Id_Film, Judul, Durasi, Genre, this.superadmin.Id_SuperAdmin);
            
            if (film.create()) {
                    JOptionPane.showMessageDialog(this, "Data film berhasil disimpan.");
                    resetInputFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menyimpan data film.");
                }
        } else {
            JOptionPane.showMessageDialog(this, "Id Super Admin tidak valid.");
        }    
    }//GEN-LAST:event_Tambah_FilmActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        this.setVisible(false);
        new MENU_SUPERADMIN(null).setVisible(true);
    }//GEN-LAST:event_KembaliActionPerformed

    private void ID_FilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_FilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_FilmActionPerformed

    private void Genre_FilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Genre_FilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Genre_FilmActionPerformed

    private boolean isIdSuperAdminValid(String idSuperAdmin, Connection conn) {
    try {
        String query = "SELECT * FROM superadmin WHERE Id_SuperAdmin = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, idSuperAdmin);
        ResultSet result = preparedStatement.executeQuery();
        
        return result.next();
    } catch (SQLException ex) {
        return false;
    }
}
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahFilm(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Durasi_Film;
    private javax.swing.JTextField Genre_Film;
    private javax.swing.JTextField ID_Film;
    private javax.swing.JTextField Judul_Film;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Tambah_Film;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void resetInputFields() {
    ID_Film.setText("");
    Judul_Film.setText("");
    Durasi_Film.setText("");
    Genre_Film.setText(""); 
    }
}
