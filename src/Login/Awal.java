/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

/**
 *
 * @author ASUS
 */
public class Awal extends javax.swing.JFrame {

    public Awal() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ADMINBTN = new javax.swing.JButton();
        SUPERADMINBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CGY");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(632, 308));
        jPanel1.setLayout(null);

        ADMINBTN.setText("ADMIN");
        ADMINBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ADMINBTN);
        ADMINBTN.setBounds(180, 140, 276, 39);

        SUPERADMINBTN.setText("SUPER ADMIN");
        SUPERADMINBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUPERADMINBTNActionPerformed(evt);
            }
        });
        jPanel1.add(SUPERADMINBTN);
        SUPERADMINBTN.setBounds(180, 190, 276, 39);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CGY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 60, 130, 67);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTO/FOTO GUI/login.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUPERADMINBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUPERADMINBTNActionPerformed
        this.setVisible(false);
        new LOGIN_SUPERADMIN().setVisible(true);
        
    }//GEN-LAST:event_SUPERADMINBTNActionPerformed

    private void ADMINBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINBTNActionPerformed
        this.setVisible(false);
        new LOGIN_ADMIN().setVisible(true);
    }//GEN-LAST:event_ADMINBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMINBTN;
    private javax.swing.JButton SUPERADMINBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
