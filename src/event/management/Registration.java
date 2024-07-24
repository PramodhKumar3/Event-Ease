package event.management;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    String type;

    public Registration() {
        initComponents();
        conn = Connect.connect();

    }

    public static boolean validateMobileNumber(String mobileNumber) {
        // Mobile number should be 10 digits and start with 6, 7, 8, or 9
        return mobileNumber.matches("[6-9]\\d{9}");
    }

    public static boolean validateEmail(String email) {
        // Email validation using regular expression
        String txtEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(txtEmail);
        return pattern.matcher(email).matches();
    }

    public static boolean validatePassword(String password) {
        // Password length should be less than 10 characters
        return password.length() < 10;
    }

    public static boolean validateName(String name) {
        // Name length should be less than 20 characters
        return name.length() < 20;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblconfirm = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblmobleno = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        pwdConfirmPassword = new javax.swing.JPasswordField();
        pwdPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblErrorMobileNo = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img10.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(645, 615));
        setResizable(false);
        getContentPane().setLayout(null);

        lblregister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblregister.setForeground(new java.awt.Color(255, 255, 255));
        lblregister.setText("REGISTER HERE");
        getContentPane().add(lblregister);
        lblregister.setBounds(210, 0, 163, 60);

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("PAASSWORD :");
        getContentPane().add(lblpassword);
        lblpassword.setBounds(30, 400, 193, 30);

        lblconfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblconfirm.setForeground(new java.awt.Color(255, 255, 255));
        lblconfirm.setText("CONFIRM PASSWORD :");
        getContentPane().add(lblconfirm);
        lblconfirm.setBounds(30, 470, 180, 30);

        btnsubmit.setBackground(new java.awt.Color(153, 153, 153));
        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit);
        btnsubmit.setBounds(170, 530, 130, 40);

        lblname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("NAME :");
        getContentPane().add(lblname);
        lblname.setBounds(40, 70, 193, 20);

        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 255, 255));
        lbladdress.setText("ADDRESS :");
        getContentPane().add(lbladdress);
        lbladdress.setBounds(40, 250, 100, 30);

        lblmobleno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmobleno.setForeground(new java.awt.Color(255, 255, 255));
        lblmobleno.setText("MOBLE NO. :");
        getContentPane().add(lblmobleno);
        lblmobleno.setBounds(40, 120, 193, 30);

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 255, 255));
        lblemail.setText("EMAIL ID :");
        getContentPane().add(lblemail);
        lblemail.setBounds(40, 180, 100, 30);

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(280, 60, 220, 30);

        txtMobileNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMobileNoMouseReleased(evt);
            }
        });
        txtMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNo);
        txtMobileNo.setBounds(280, 120, 220, 30);
        getContentPane().add(pwdConfirmPassword);
        pwdConfirmPassword.setBounds(280, 470, 219, 30);

        pwdPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(pwdPassword);
        pwdPassword.setBounds(280, 400, 219, 30);

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(280, 180, 219, 30);

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 250, 220, 86);

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(360, 530, 130, 40);

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(510, 20, 110, 30);

        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPasswordError.setText(" ");
        getContentPane().add(lblConfirmPasswordError);
        lblConfirmPasswordError.setBounds(280, 499, 220, 30);

        lblErrorName.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorName.setText(" ");
        getContentPane().add(lblErrorName);
        lblErrorName.setBounds(280, 96, 220, 20);

        lblErrorMobileNo.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorMobileNo.setText(" ");
        getContentPane().add(lblErrorMobileNo);
        lblErrorMobileNo.setBounds(280, 160, 220, 16);

        lblErrorEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorEmail.setText(" ");
        getContentPane().add(lblErrorEmail);
        lblErrorEmail.setBounds(280, 220, 220, 16);

        lblErrorAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorAddress.setText(" ");
        getContentPane().add(lblErrorAddress);
        lblErrorAddress.setBounds(280, 350, 220, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-210, -60, 860, 710);

        lblErrorPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorPassword.setText(" ");
        getContentPane().add(lblErrorPassword);
        lblErrorPassword.setBounds(280, 440, 220, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        //Validation during registration
        if (!validateName(txtname.getText())) {
            lblErrorName.setText("*Name length should be less than 20 characters");
        } else if (!validateMobileNumber(txtMobileNo.getText())) {
            lblErrorMobileNo.setText("*Invalid Mobile Number");
        } else if (!validateEmail(txtEmail.getText())) {
            lblErrorEmail.setText("*Invalid Email Address");
        } else if (txtAddress.getText().isEmpty()) {
            lblErrorAddress.setText("*Address Field cannot be Empty");
        } else if (!validatePassword(pwdPassword.getText())) {
            lblErrorPassword.setText("*Password length should be less than 10 characters");
        } else if (!pwdPassword.getText().equals(pwdConfirmPassword.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Password and Confirm Didn't Matched");
        } else {
            try {
                pst = conn.prepareStatement("INSERT INTO `registration`(`name`, `mobileno`, `emailid`, `address` , `password`, `confirmpassword`) VALUES (?,?,?,?,?,?)");
                pst.setString(1, txtname.getText());
                pst.setString(2, txtMobileNo.getText());
                pst.setString(3, txtEmail.getText());
                pst.setString(4, txtAddress.getText());
                pst.setString(5, pwdPassword.getText());
                pst.setString(6, pwdConfirmPassword.getText());

                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "registered");
                    Login ob = new Login();
                    ob.setVisible(true);
                    this.setVisible(false);
                }  
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     // }   
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtMobileNo.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        pwdPassword.setText("");
        pwdConfirmPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        home ob = new home();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMobileNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyReleased
   lblErrorMobileNo.setText("");
    }//GEN-LAST:event_txtMobileNoKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        lblErrorEmail.setText("");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        lblErrorAddress.setText("");
    }//GEN-LAST:event_txtAddressKeyReleased

    private void pwdPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdPasswordKeyReleased
        lblErrorPassword.setText("");
    }//GEN-LAST:event_pwdPasswordKeyReleased

    private void txtMobileNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyPressed
        String phoneNumber = txtMobileNo.getText();
        int length = phoneNumber.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length <= 10) {
                txtMobileNo.setEditable(true);
            } else {
                txtMobileNo.setEditable(false);
                if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
                    txtMobileNo.setText("valid number");
                } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    txtMobileNo.setEditable(true);
                } else {
                    txtMobileNo.setEditable(false);
                }
            }
        }
    }//GEN-LAST:event_txtMobileNoKeyPressed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        lblErrorName.setText("");
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtMobileNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMobileNoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNoMouseReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorMobileNo;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblmobleno;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregister;
    private javax.swing.JPasswordField pwdConfirmPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
