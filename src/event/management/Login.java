// Importing Packages
package event.management;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static String name, userID, address, phoneNo, email;

    public Login() {
        initComponents();
        conn = Connect.connect();
    }
//Function declaration for data setting in Profile page
    void setProfileData(String name, String userID, String address, String phoneNo, String email) {
        Login.name = name;
        Login.userID = userID;
        Login.address = address;
        Login.phoneNo = phoneNo;
        Login.email = email;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JLabel();
        lbluname = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        lblErrorUserName = new javax.swing.JLabel();
        lblErrorPassWord = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        login.setBackground(new java.awt.Color(204, 204, 255));
        login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("CUSTOMER LOGIN");
        getContentPane().add(login);
        login.setBounds(70, 40, 346, 33);

        lbluname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluname.setForeground(new java.awt.Color(255, 255, 255));
        lbluname.setText("USER NAME :");
        getContentPane().add(lbluname);
        lbluname.setBounds(90, 90, 110, 30);

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("PASSWORD :");
        getContentPane().add(lblpassword);
        lblpassword.setBounds(90, 150, 120, 20);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(220, 90, 190, 30);

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogin.setText("LOG IN");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(100, 220, 81, 24);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(210, 220, 76, 24);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(220, 150, 190, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(320, 220, 72, 24);

        lblErrorUserName.setForeground(new java.awt.Color(204, 0, 0));
        lblErrorUserName.setText(" ");
        getContentPane().add(lblErrorUserName);
        lblErrorUserName.setBounds(220, 120, 190, 16);

        lblErrorPassWord.setForeground(new java.awt.Color(204, 0, 0));
        lblErrorPassWord.setText(" ");
        getContentPane().add(lblErrorPassWord);
        lblErrorPassWord.setBounds(220, 180, 190, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-370, 0, 970, 330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked

        Connect obConnect = new Connect();
        String name, address, phoneNo = null, email = null;
        if (txtUsername == null || null == txtPassword) {
            JOptionPane.showMessageDialog(null, "empty field");
        } else {
            try {
                pst = conn.prepareStatement("select * from registration where name=? and password=?");
                pst.setString(1, txtUsername.getText());
                pst.setString(2, txtPassword.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    // Login successful, set profile data and open profile page
                    setProfileData(rs.getString("name"), rs.getString("userid"), rs.getString("address"), rs.getString("mobileno"), rs.getString("emailid"));
                    Profile ob = new Profile();
                    ob.setVisible(true);
                    this.setVisible(false);
                } else {
                    // Login failed, show error message
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }//GEN-LAST:event_btnloginMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        home ob = new home();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

   
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErrorPassWord;
    private javax.swing.JLabel lblErrorUserName;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbluname;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
