/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUD_SUPERADMIN;


import models.SuperAdmin;

public final class MENU_SUPERADMIN extends javax.swing.JFrame {
    public final SuperAdmin superadmin;


    public MENU_SUPERADMIN(SuperAdmin superadmin) {
        initComponents();
        this.superadmin = superadmin;
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
        TambahFilm = new javax.swing.JButton();
        HapusFilm = new javax.swing.JButton();
        UbahFilm = new javax.swing.JButton();
        LihatFilm = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(632, 308));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 44)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CGY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 50, 107, 60);

        TambahFilm.setText("Tambah Film");
        TambahFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahFilmActionPerformed(evt);
            }
        });
        jPanel1.add(TambahFilm);
        TambahFilm.setBounds(160, 120, 140, 50);

        HapusFilm.setText("Hapus Film");
        HapusFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusFilmActionPerformed(evt);
            }
        });
        jPanel1.add(HapusFilm);
        HapusFilm.setBounds(340, 123, 150, 50);

        UbahFilm.setText("Ubah Film");
        UbahFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahFilmActionPerformed(evt);
            }
        });
        jPanel1.add(UbahFilm);
        UbahFilm.setBounds(160, 190, 140, 50);

        LihatFilm.setText("Lihat Film");
        LihatFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatFilmActionPerformed(evt);
            }
        });
        jPanel1.add(LihatFilm);
        LihatFilm.setBounds(340, 190, 150, 50);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar);
        Keluar.setBounds(10, 20, 75, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTO/FOTO GUI/menu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahFilmActionPerformed
        this.setVisible(false);
        new TambahFilm(superadmin).setVisible(true);
    }//GEN-LAST:event_TambahFilmActionPerformed

    private void HapusFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusFilmActionPerformed
        this.setVisible(false);
        new HapusFilm().setVisible(true);
    }//GEN-LAST:event_HapusFilmActionPerformed

    private void UbahFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahFilmActionPerformed
        this.setVisible(false);
        new EditFilm().setVisible(true);
    }//GEN-LAST:event_UbahFilmActionPerformed

    private void LihatFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatFilmActionPerformed
        this.setVisible(false);
        new LihatFilm().setVisible(true);
    }//GEN-LAST:event_LihatFilmActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        this.dispose();
        System.exit(0);

    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_SUPERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_SUPERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_SUPERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_SUPERADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_SUPERADMIN(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusFilm;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton LihatFilm;
    private javax.swing.JButton TambahFilm;
    private javax.swing.JButton UbahFilm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
