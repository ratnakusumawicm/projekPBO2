/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolawaralaba;

/**
 *
 * @author user
 */
public class managerMember extends javax.swing.JFrame {

    /**
     * Creates new form managerMember
     */
    public managerMember() {
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

        jLabel1 = new javax.swing.JLabel();
        memberbtn = new javax.swing.JButton();
        produkbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengelolawaralaba/gambar/manager member.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 800));

        memberbtn.setText("jButton1");
        getContentPane().add(memberbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 30));

        produkbtn.setText("jButton2");
        produkbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkbtnMouseClicked(evt);
            }
        });
        produkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkbtnActionPerformed(evt);
            }
        });
        getContentPane().add(produkbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkbtnActionPerformed

    private void produkbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkbtnMouseClicked
        managerProduk memberbtn = new managerProduk();
        memberbtn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_produkbtnMouseClicked

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
            java.util.logging.Logger.getLogger(managerMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton memberbtn;
    private javax.swing.JButton produkbtn;
    // End of variables declaration//GEN-END:variables
}
