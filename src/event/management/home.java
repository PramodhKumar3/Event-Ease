package event.management;

import javax.swing.JFrame;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /*
    public ScaleImage() {
        initComponents();
        scaleImage();
    }
    public void scaleImage () {
        ImageIcon icon new ImageIcon("C:\\Users\\Authedic\\Pictures\\Saved Pictures\\ilmc3VGfn.jpg");
        //scaling image ti fic in jlable
        Image img icon.getImage();
        Image imgScale img.getScaledInstance (label.getWidth(), label.getHeight(), Image.SCALE SMOOTH):
        ImageIcon scaledicon new ImageIcon(imgScale);
        jLabel4.setIcon(scaledIcon);
    }
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        btnFeedback = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnadmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img10.jpeg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        btnFeedback.setBackground(new java.awt.Color(153, 153, 153));
        btnFeedback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFeedback.setText("FEEDBACK");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeedback);
        btnFeedback.setBounds(770, 70, 140, 40);

        btnRegistration.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistration.setText("REGISTRATION");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistration);
        btnRegistration.setBounds(90, 70, 170, 40);

        btncustomer.setBackground(new java.awt.Color(153, 153, 153));
        btncustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncustomer.setText("LOGIN");
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomer);
        btncustomer.setBounds(350, 70, 120, 40);

        jLabel2.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("We Make Your");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 190, 410, 100);

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Every Moment Special....");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 270, 520, 90);

        btnadmin.setBackground(new java.awt.Color(153, 153, 153));
        btnadmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadmin.setText("ADMIN");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        getContentPane().add(btnadmin);
        btnadmin.setBounds(560, 70, 130, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img10.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        Registration ob = new Registration();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
       Login ob = new Login();
       ob.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_btncustomerActionPerformed

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        // TODO add your handling code here:
        Admin ob=new Admin();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
     Feedback ob = new Feedback();
       ob.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnFeedbackActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btncustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
