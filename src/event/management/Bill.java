package event.management;

import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.Document;

public class Bill extends javax.swing.JFrame {

    public Bill() {
        initComponents();
        billheader();
    }

    public void billheader() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        txtBill.setText("*********************************************************************" + "\n"
                + "\t" + "EVENT MANAGEMENT" + "\n"
                + "\t" + "CONTACT NO.:XXXXXXXXXX" + "\n" + "\n"
                + "\t" + "\t" + "DATE :" + sdf.format(date) + "\n"
                + "*********************************************************************" + "\n" + "\n"
                + "CUSTOMER ID :" + "\t" + BookEvent.txtCustomerId.getText() + "\n" + "\n"
                + "CUSTOMER NAME :" + "\t" + BookEvent.txtCustomerName.getText() + "\n" + "\n"
                + "EVENT TYPE :" + "\t" + "\t"+ BookEvent.EventType.getSelectedItem() + "\n" + "\n"
                + "*********************************************************************" + "\n" + "\n"
                + "VENUE :" + "\t"+ BookEvent.txtVenueName.getText() + "\t" + BookEvent.txtVenueCost.getText() + "\n" + "\n"
                + "FOOD :" + "\t" + BookEvent.txtFoodName.getText() + "\t" + BookEvent.txtFoodCost.getText() + "\n" + "\n"
                + "EQUIPMENT :" + "\t" + BookEvent.txtEquipment.getText() + "\t"+ BookEvent.txtEquipmentCost.getText() + "\n" + "\n"
                + "__________________________________________________" + "\n"
                + "TOTAL :" + "\t" + "\t" + BookEvent.txtTotal.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();
        Print = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(368, 541));
        setResizable(false);

        txtBill.setEditable(false);
        txtBill.setColumns(20);
        txtBill.setRows(5);
        txtBill.setAutoscrolls(false);
        txtBill.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtBill);

        Print.setBackground(new java.awt.Color(153, 153, 153));
        Print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Print.setText("PRINT");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(153, 153, 153));
        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            txtBill.setText(txtBill.getText() + "\t" + "\n" + "\t" + "\t" + "\n" +"develpoed by DHS");
            txtBill.print();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_PrintActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        Profile ob = null;
        try {
            ob = new Profile();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBill;
    // End of variables declaration//GEN-END:variables
}
