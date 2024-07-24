package event.management;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {   //it is the main Framme

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Admin() {
        initComponents();
        conn = Connect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbladminname = new javax.swing.JLabel();
        lbladminpassward = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbladminlogin = new javax.swing.JLabel();
        btnadminsubmit = new javax.swing.JButton();
        btnadmitback = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        pwdPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        lbladminname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladminname.setForeground(new java.awt.Color(255, 255, 255));
        lbladminname.setText("NAME:");
        getContentPane().add(lbladminname);
        lbladminname.setBounds(100, 80, 47, 17);

        lbladminpassward.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladminpassward.setForeground(new java.awt.Color(255, 255, 255));
        lbladminpassward.setText("PASSWORD:");
        getContentPane().add(lbladminpassward);
        lbladminpassward.setBounds(100, 140, 87, 17);
        getContentPane().add(txtName);
        txtName.setBounds(250, 70, 175, 30);

        lbladminlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbladminlogin.setForeground(new java.awt.Color(255, 255, 255));
        lbladminlogin.setText("ADMIN LOGIN HERE");
        getContentPane().add(lbladminlogin);
        lbladminlogin.setBounds(150, 20, 200, 29);

        btnadminsubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadminsubmit.setText("SUBMIT");
        btnadminsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnadminsubmit);
        btnadminsubmit.setBounds(30, 240, 120, 31);

        btnadmitback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadmitback.setText("BACK");
        btnadmitback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmitbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnadmitback);
        btnadmitback.setBounds(340, 240, 120, 31);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(179, 240, 120, 31);
        getContentPane().add(pwdPassword);
        pwdPassword.setBounds(250, 140, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-340, -240, 860, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminsubmitActionPerformed
        if (txtName == null || null == pwdPassword) {
            JOptionPane.showMessageDialog(null, "empty field");
        } else {
            try {
                pst = conn.prepareStatement("select * from login where username=? and password=?");
                pst.setString(1, txtName.getText());
                pst.setString(2, pwdPassword.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    AdminHome ob = new AdminHome();
                    ob.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "incorrect");
                }

            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }//GEN-LAST:event_btnadminsubmitActionPerformed

    private void btnadmitbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmitbackActionPerformed
        home ob = new home();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnadmitbackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        pwdPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnadminsubmit;
    private javax.swing.JButton btnadmitback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbladminlogin;
    private javax.swing.JLabel lbladminname;
    private javax.swing.JLabel lbladminpassward;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
