/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package gui;

/**
 *
 * @author ACER
 */
public class form_Menu extends javax.swing.JFrame {

    /** Creates new form form_Menu */
    public form_Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_ahliwaris = new javax.swing.JButton();
        btn_dispensasiNikah = new javax.swing.JButton();
        btn_penduduk = new javax.swing.JButton();
        btn_pengaduan = new javax.swing.JButton();
        btn_pengajuan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PELAYANAN MASYARAKAT");

        btn_ahliwaris.setBackground(new java.awt.Color(0, 51, 102));
        btn_ahliwaris.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ahliwaris.setForeground(new java.awt.Color(255, 255, 255));
        btn_ahliwaris.setText("AHLI WARIS");
        btn_ahliwaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ahliwarisActionPerformed(evt);
            }
        });

        btn_dispensasiNikah.setBackground(new java.awt.Color(0, 51, 102));
        btn_dispensasiNikah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dispensasiNikah.setForeground(new java.awt.Color(255, 255, 255));
        btn_dispensasiNikah.setText("DISPENSASI NIKAH");
        btn_dispensasiNikah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dispensasiNikahActionPerformed(evt);
            }
        });

        btn_penduduk.setBackground(new java.awt.Color(0, 51, 102));
        btn_penduduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_penduduk.setForeground(new java.awt.Color(255, 255, 255));
        btn_penduduk.setText("PENDUDUK");
        btn_penduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pendudukActionPerformed(evt);
            }
        });

        btn_pengaduan.setBackground(new java.awt.Color(0, 51, 102));
        btn_pengaduan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_pengaduan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pengaduan.setText("PENGADUAN");
        btn_pengaduan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengaduanActionPerformed(evt);
            }
        });

        btn_pengajuan.setBackground(new java.awt.Color(0, 51, 102));
        btn_pengajuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_pengajuan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pengajuan.setText("PENGAJUAN");
        btn_pengajuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengajuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_pengaduan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_ahliwaris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_dispensasiNikah, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addComponent(btn_penduduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_pengajuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_ahliwaris, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_dispensasiNikah, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_penduduk, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pengaduan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ahliwarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ahliwarisActionPerformed
        new form_AhliWaris().setVisible(true);
    }//GEN-LAST:event_btn_ahliwarisActionPerformed

    private void btn_dispensasiNikahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dispensasiNikahActionPerformed
        new form_dispensasinikah().setVisible(true);
    }//GEN-LAST:event_btn_dispensasiNikahActionPerformed

    private void btn_pendudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pendudukActionPerformed
        new form_penduduk().setVisible(true);
    }//GEN-LAST:event_btn_pendudukActionPerformed

    private void btn_pengaduanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengaduanActionPerformed
        new form_pengaduan().setVisible(true);
    }//GEN-LAST:event_btn_pengaduanActionPerformed

    private void btn_pengajuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengajuanActionPerformed
        new form_pengajuan().setVisible(true);
    }//GEN-LAST:event_btn_pengajuanActionPerformed

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
            java.util.logging.Logger.getLogger(form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ahliwaris;
    private javax.swing.JButton btn_dispensasiNikah;
    private javax.swing.JButton btn_penduduk;
    private javax.swing.JButton btn_pengaduan;
    private javax.swing.JButton btn_pengajuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
