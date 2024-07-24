
package event.management;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class CustomerEquipment extends javax.swing.JFrame {
    Connection conn=null;
PreparedStatement pst=null;
  
    public CustomerEquipment() {
        initComponents();
        conn=Connect.connect();
        show_user();
    }
    public ArrayList<User2> userList(){
        ArrayList<User2> userList= new ArrayList<>();
        try{
            String query1="SELECT * FROM adminequipment";
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User2 user;
            while(rs.next()){
              user = new User2(rs.getInt("eid"),rs.getString("ename"),rs.getInt("ecost"),rs.getBytes("image"));
              userList.add(user);  
            }
        }catch(SQLException ex){
           // Logger.getLogger(Registration.class.getName()).log(Level.SEVERE,null,ex);
           JOptionPane.showMessageDialog(null,ex);
        }
         return userList;
    }
    public void show_user(){
        ArrayList<User2>list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[]row =new Object[3];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).geteid();
            row[1]=list.get(i).getename();
            row[2]=list.get(i).getecost();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblEquipmentId = new javax.swing.JLabel();
        lblEquipmentName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblEquipmentCost = new javax.swing.JLabel();
        lblEquipmentImage = new javax.swing.JLabel();
        txtEquipmentId = new javax.swing.JTextField();
        txtEquipmentName = new javax.swing.JTextField();
        txtEquipmentCost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(875, 500));
        getContentPane().setLayout(null);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(82, 420, 110, 24);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Equipments");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 20, 170, 30);

        lblEquipmentId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentId.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentId.setText("Equipment ID :");
        getContentPane().add(lblEquipmentId);
        lblEquipmentId.setBounds(18, 70, 160, 22);

        lblEquipmentName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentName.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentName.setText("Equipment Name :");
        getContentPane().add(lblEquipmentName);
        lblEquipmentName.setBounds(10, 130, 170, 22);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(220, 420, 104, 24);

        lblEquipmentCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentCost.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentCost.setText("Equipment Cost :");
        getContentPane().add(lblEquipmentCost);
        lblEquipmentCost.setBounds(10, 190, 160, 22);

        lblEquipmentImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentImage.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentImage.setText("Equipment Image :");
        getContentPane().add(lblEquipmentImage);
        lblEquipmentImage.setBounds(10, 250, 180, 22);
        getContentPane().add(txtEquipmentId);
        txtEquipmentId.setBounds(218, 80, 150, 30);
        getContentPane().add(txtEquipmentName);
        txtEquipmentName.setBounds(220, 130, 150, 30);
        getContentPane().add(txtEquipmentCost);
        txtEquipmentCost.setBounds(220, 190, 150, 30);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(875, 475));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EQUIPMENT ID", "EQUIPMENT NAME", "EQUIPMENT COST"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(434, 2, 440, 470);
        getContentPane().add(lblImage);
        lblImage.setBounds(210, 250, 180, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-580, -20, 1020, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
         BookEvent x=new BookEvent();
          BookEvent.txtVenueName.setText(CustomerVenue.txtVenueName. getText());
          BookEvent.txtVenueCost.setText(CustomerVenue.txtVenueCost. getText());
          
          BookEvent.txtCustomerName.setText(Profile.txtName. getText());
          BookEvent.txtCustomerId.setText(Profile.txtUserID. getText());
          
          BookEvent.txtFoodName.setText(CustomerFood.txtFoodName.getText());
          BookEvent.txtFoodCost.setText(CustomerFood.txtFoodCost.getText()); 
           
          BookEvent.txtEquipment.setText(CustomerEquipment.txtEquipmentName.getText());
          BookEvent.txtEquipmentCost.setText(CustomerEquipment.txtEquipmentCost.getText());
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       Profile ob = null;
     try {
         ob = new Profile();
     } catch (SQLException ex) {
         Logger.getLogger(CustomerFood.class.getName()).log(Level.SEVERE, null, ex);
     }
       ob.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int i=jTable1.getSelectedRow();
       TableModel model= jTable1.getModel();
       txtEquipmentId.setText(model.getValueAt(i,0).toString());
       txtEquipmentName.setText(model.getValueAt(i,1).toString());
       txtEquipmentCost.setText(model.getValueAt(i,2).toString());
       byte[]img = (userList().get(i).getImage());
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageIcon);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CustomerEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEquipmentCost;
    private javax.swing.JLabel lblEquipmentId;
    private javax.swing.JLabel lblEquipmentImage;
    private javax.swing.JLabel lblEquipmentName;
    private javax.swing.JLabel lblImage;
    public static javax.swing.JTextField txtEquipmentCost;
    private javax.swing.JTextField txtEquipmentId;
    public static javax.swing.JTextField txtEquipmentName;
    // End of variables declaration//GEN-END:variables

  /*  private void show_user() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
