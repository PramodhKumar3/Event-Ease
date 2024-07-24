package event.management;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BookEvent extends javax.swing.JFrame {
        Connection conn = null;
    PreparedStatement pst = null;
    
    public BookEvent() {
        initComponents();
        conn = Connect.connect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblBookEvent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EventType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtVenueName = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        txtEquipment = new javax.swing.JTextField();
        txtGuest = new javax.swing.JTextField();
        txtVenueCost = new javax.swing.JTextField();
        txtFoodCost = new javax.swing.JTextField();
        txtEquipmentCost = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        lblErrorDate = new javax.swing.JLabel();
        lblErrorGuest = new javax.swing.JLabel();
        lblErrorTotal = new javax.swing.JLabel();
        lblErrorEvent = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 540));
        getContentPane().setLayout(null);

        lblBookEvent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBookEvent.setForeground(new java.awt.Color(255, 255, 255));
        lblBookEvent.setText("BOOK EVENT");
        getContentPane().add(lblBookEvent);
        lblBookEvent.setBounds(300, 10, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EVENT TYPE :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VENUE :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 140, 80, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EVENT DATE :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 110, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FOOD NAME :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 130, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EQUIPMENTS :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 300, 130, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NO. OF GUESTS : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 350, 160, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VENUE COST :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 220, 140, 17);

        EventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "BIRTH DAY", "MARRIAGE", "ENGAGEMENT", "SCHOOL FUNCTION ", "OFFICIAL MEATING" }));
        EventType.setToolTipText("");
        EventType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventTypeMouseClicked(evt);
            }
        });
        EventType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventTypeActionPerformed(evt);
            }
        });
        getContentPane().add(EventType);
        EventType.setBounds(150, 70, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FOOD COST :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 260, 110, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EQUIPMENT COST :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 310, 150, 14);

        txtVenueName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtVenueName);
        txtVenueName.setBounds(150, 130, 150, 30);

        txtFoodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFoodName);
        txtFoodName.setBounds(150, 230, 150, 30);

        txtEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipmentActionPerformed(evt);
            }
        });
        getContentPane().add(txtEquipment);
        txtEquipment.setBounds(150, 290, 150, 30);

        txtGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestActionPerformed(evt);
            }
        });
        txtGuest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGuestKeyReleased(evt);
            }
        });
        getContentPane().add(txtGuest);
        txtGuest.setBounds(150, 340, 150, 30);
        getContentPane().add(txtVenueCost);
        txtVenueCost.setBounds(530, 210, 130, 30);
        getContentPane().add(txtFoodCost);
        txtFoodCost.setBounds(530, 250, 130, 30);
        getContentPane().add(txtEquipmentCost);
        txtEquipmentCost.setBounds(530, 300, 130, 30);

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal);
        txtTotal.setBounds(530, 360, 130, 30);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(150, 440, 130, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 440, 110, 30);

        btnTotal.setText("Total :");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotal);
        btnTotal.setBounds(430, 360, 70, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CUSTOMER NAME:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 100, 140, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CUSTOMER ID :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(380, 150, 140, 20);
        getContentPane().add(txtCustomerName);
        txtCustomerName.setBounds(530, 100, 130, 30);
        getContentPane().add(txtCustomerId);
        txtCustomerId.setBounds(530, 150, 130, 30);

        lblErrorDate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblErrorDate);
        lblErrorDate.setBounds(150, 200, 110, 20);

        lblErrorGuest.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblErrorGuest);
        lblErrorGuest.setBounds(150, 370, 100, 20);

        lblErrorTotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblErrorTotal);
        lblErrorTotal.setBounds(530, 400, 140, 20);

        lblErrorEvent.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblErrorEvent);
        lblErrorEvent.setBounds(150, 100, 130, 20);
        getContentPane().add(jCalendar1);
        jCalendar1.setBounds(150, 180, 150, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Profile ob = null;
        try {
            ob = new Profile();
        } catch (SQLException ex) {
            Logger.getLogger(BookEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipmentActionPerformed

    private void txtGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestActionPerformed
       /* int cost = Integer.parseInt(CustomerFood.txtFoodCost.getText());
        int guest = Integer.parseInt(txtGuest.getText());
        int result = cost * guest;
        txtFoodCost.setText(Integer.toString(result));*/
    }//GEN-LAST:event_txtGuestActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        int venue = Integer.parseInt(txtVenueCost.getText());
        int food = Integer.parseInt(txtFoodCost.getText());
        int equipment = Integer.parseInt(txtEquipmentCost.getText());
        int total = venue + food + equipment;
        txtTotal.setText(Integer.toString(total));
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (EventType.getSelectedItem().toString().equals(" ")) {
             lblErrorEvent.setText("Select An Event");
        }
        if (jCalendar1.getDate().equals(" ")){
             lblErrorDate.setText("Select date");
        }
        if (txtGuest.getText().equals("")){
             lblErrorGuest.setText("Select An Event");
        }
         if (txtTotal.getText().equals("")){
            lblErrorTotal.setText("Select An Event");
        }
       else { try {
                pst = conn.prepareStatement("INSERT INTO `bookevent`(`customer_name`, `customer_id`, `event_type`, `venue`,`food_name`, `equipment`, `date`,`guests`,`venue_cost`,`food_cost`,`equipment_cost`,`total`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, txtCustomerName.getText());
                pst.setString(2, txtCustomerId.getText());
                String event;
                event=EventType.getSelectedItem().toString();
                pst.setString(3,event);
                pst.setString(4,txtVenueName.getText());                 
                pst.setString(5,txtFoodName.getText());
                pst.setString(6, txtEquipment.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date=sdf.format(jCalendar1.getDate());
                pst.setString(7, date);
                pst.setString(8,txtGuest.getText());
                pst.setString(9,txtVenueCost.getText());
                pst.setString(10,txtFoodCost.getText());
                pst.setString(11,txtEquipmentCost.getText());
                pst.setString(12,txtTotal.getText());

                if (pst.executeUpdate() > 0) 
                    JOptionPane.showMessageDialog(null, "BOOKED SUCCESSFULLY");
               Bill ob = new Bill();
               ob.setVisible(true);
               this.setVisible(false);                
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
}  
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtGuestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuestKeyReleased
        int cost = Integer.parseInt(CustomerFood.txtFoodCost.getText());
        int guest = Integer.parseInt(txtGuest.getText());
        int result = cost * guest;
        txtFoodCost.setText(Integer.toString(result));
    }//GEN-LAST:event_txtGuestKeyReleased

    private void EventTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventTypeMouseClicked
       lblErrorEvent.setText("");
    }//GEN-LAST:event_EventTypeMouseClicked

    private void txtFoodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodNameActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtVenueNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueNameActionPerformed

    private void EventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventTypeActionPerformed

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
            java.util.logging.Logger.getLogger(BookEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> EventType;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBookEvent;
    private javax.swing.JLabel lblErrorDate;
    private javax.swing.JLabel lblErrorEvent;
    private javax.swing.JLabel lblErrorGuest;
    private javax.swing.JLabel lblErrorTotal;
    public static javax.swing.JTextField txtCustomerId;
    public static javax.swing.JTextField txtCustomerName;
    public static javax.swing.JTextField txtEquipment;
    public static javax.swing.JTextField txtEquipmentCost;
    public static javax.swing.JTextField txtFoodCost;
    public static javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtGuest;
    public static javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtVenueCost;
    public static javax.swing.JTextField txtVenueName;
    // End of variables declaration//GEN-END:variables
}
