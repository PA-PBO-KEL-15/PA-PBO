/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUD_ADMIN;

import ORM.Penayangan;
import javax.swing.JOptionPane;


public final class TambahPenayangan extends javax.swing.JFrame {

    public TambahPenayangan() {
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
        Waktu_Penayangan = new javax.swing.JTextField();
        Film_Penayangan = new javax.swing.JTextField();
        IdAdmin = new javax.swing.JTextField();
        IdPenayangan = new javax.swing.JTextField();
        Studio_Penayangan = new javax.swing.JTextField();
        Tambah_Penayangan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tanggal_Penayangan = new com.toedter.calendar.JDateChooser();
        Kembali = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(632, 302));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CGY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 30, 123, 70);

        Waktu_Penayangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Waktu_PenayanganActionPerformed(evt);
            }
        });
        jPanel1.add(Waktu_Penayangan);
        Waktu_Penayangan.setBounds(240, 170, 241, 22);

        Film_Penayangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Film_PenayanganActionPerformed(evt);
            }
        });
        jPanel1.add(Film_Penayangan);
        Film_Penayangan.setBounds(240, 230, 241, 22);

        IdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdAdminActionPerformed(evt);
            }
        });
        jPanel1.add(IdAdmin);
        IdAdmin.setBounds(240, 200, 241, 22);

        IdPenayangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPenayanganActionPerformed(evt);
            }
        });
        jPanel1.add(IdPenayangan);
        IdPenayangan.setBounds(240, 110, 241, 22);

        Studio_Penayangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Studio_PenayanganActionPerformed(evt);
            }
        });
        jPanel1.add(Studio_Penayangan);
        Studio_Penayangan.setBounds(240, 260, 241, 22);

        Tambah_Penayangan.setText("Tambah");
        Tambah_Penayangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tambah_PenayanganActionPerformed(evt);
            }
        });
        jPanel1.add(Tambah_Penayangan);
        Tambah_Penayangan.setBounds(500, 260, 73, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Id Penayangan :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 110, 110, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Tanggal :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 140, 80, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Waktu :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 170, 70, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Id Admin :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 200, 80, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Id Film :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 230, 70, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("Studio :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 260, 70, 16);
        jPanel1.add(Tanggal_Penayangan);
        Tanggal_Penayangan.setBounds(240, 140, 241, 22);

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kembali);
        Kembali.setBounds(10, 10, 80, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTO/FOTO GUI/CRUD.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 640, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Film_PenayanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Film_PenayanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Film_PenayanganActionPerformed

    private void IdPenayanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdPenayanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdPenayanganActionPerformed

    private void IdAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdAdminActionPerformed

    private void Tambah_PenayanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tambah_PenayanganActionPerformed

        String idPenayangan = IdPenayangan.getText();
        java.util.Date tanggalPenayangan = Tanggal_Penayangan.getDate();
        String waktuPenayangan = Waktu_Penayangan.getText();
        String idAdmin = IdAdmin.getText();
        String idFilm = Film_Penayangan.getText();
        String studio = Studio_Penayangan.getText();

        if (idPenayangan.isEmpty() || tanggalPenayangan == null || waktuPenayangan == null
                || idAdmin.isEmpty() || idFilm.isEmpty() || studio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan isi semua kolom.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            java.sql.Date sqlDate = new java.sql.Date(tanggalPenayangan.getTime());

            Penayangan penayangan = new Penayangan(idPenayangan, sqlDate, waktuPenayangan, idAdmin, idFilm, studio);
            
            if (penayangan.tambahPenayangan()) {
                JOptionPane.showMessageDialog(this, "Data penayangan berhasil disimpan.");

                IdPenayangan.setText("");
                Tanggal_Penayangan.setDate(null);
                Waktu_Penayangan.setText("");
                IdAdmin.setText("");
                Film_Penayangan.setText("");
                Studio_Penayangan.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data penayangan.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Tambah_PenayanganActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        this.setVisible(false);
        new MENU_ADMIN().setVisible(true);
    }//GEN-LAST:event_KembaliActionPerformed

    private void Studio_PenayanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Studio_PenayanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Studio_PenayanganActionPerformed

    private void Waktu_PenayanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Waktu_PenayanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Waktu_PenayanganActionPerformed

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
            java.util.logging.Logger.getLogger(TambahPenayangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahPenayangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahPenayangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahPenayangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPenayangan().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Film_Penayangan;
    private javax.swing.JTextField IdAdmin;
    private javax.swing.JTextField IdPenayangan;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField Studio_Penayangan;
    private javax.swing.JButton Tambah_Penayangan;
    private com.toedter.calendar.JDateChooser Tanggal_Penayangan;
    private javax.swing.JTextField Waktu_Penayangan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class Time {

        public Time() {
        }
    }
}
