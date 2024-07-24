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


public class CustomerFood extends javax.swing.JFrame {
 Connection conn=null;
PreparedStatement pst=null;
  
    public CustomerFood() {
         initComponents();
        conn=Connect.connect();
        show_user();
    }
      public ArrayList<User1> userList(){
        ArrayList<User1> userList= new ArrayList<>();
        try{
            String query1="SELECT * FROM adminfood";
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User1 user;
            while(rs.next()){
             user = new User1(rs.getInt("fid"),rs.getString("fname"),rs.getInt("fcost"),rs.getBytes("image"));
              userList.add(user);     
            }
        }catch(SQLException ex){
           // Logger.getLogger(Registration.class.getName()).log(Level.SEVERE,null,ex);
           JOptionPane.showMessageDialog(null,ex);
        }
         return userList;
    }
    public void show_user(){
        ArrayList<User1>list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[]row =new Object[3];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getfid();
            row[1]=list.get(i).getfname();
            row[2]=list.get(i).getfcost();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblFoodId = new javax.swing.JLabel();
        lblFoodName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFoodCost = new javax.swing.JLabel();
        lblFoodImage = new javax.swing.JLabel();
        txtFoodId = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        txtFoodCost = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 465));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 10, 110, 30);

        lblFoodId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodId.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodId.setText("Food ID :");
        getContentPane().add(lblFoodId);
        lblFoodId.setBounds(10, 53, 110, 30);

        lblFoodName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodName.setText("Food Name :");
        getContentPane().add(lblFoodName);
        lblFoodName.setBounds(10, 101, 130, 22);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(220, 400, 99, 24);

        lblFoodCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodCost.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodCost.setText("Food Cost :");
        getContentPane().add(lblFoodCost);
        lblFoodCost.setBounds(10, 141, 120, 22);

        lblFoodImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImage.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodImage.setText("Food Image :");
        getContentPane().add(lblFoodImage);
        lblFoodImage.setBounds(10, 200, 140, 22);
        getContentPane().add(txtFoodId);
        txtFoodId.setBounds(210, 61, 140, 30);
        getContentPane().add(txtFoodName);
        txtFoodName.setBounds(210, 111, 150, 30);
        getContentPane().add(txtFoodCost);
        txtFoodCost.setBounds(210, 151, 150, 30);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(90, 400, 100, 24);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOOD ID", "FOOD NAME", "FOOD COST"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 0, 490, 470);
        getContentPane().add(lblImage);
        lblImage.setBounds(170, 190, 210, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-550, 0, 1080, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
     CustomerEquipment ob = new CustomerEquipment();
     ob.setVisible(true);
     this.setVisible(false);
     
     // BookEvent x=new BookEvent();
    // BookEvent.txtVenueName.setText(CustomerVenue.txtVenueName. getText());
     //BookEvent.txtFoodCost.setText(CustomerVenue.txtVenueCost. getText());
     //x.setVisible(true);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          int i=jTable1.getSelectedRow();
       TableModel model= jTable1.getModel();
       txtFoodId.setText(model.getValueAt(i,0).toString());
       txtFoodName.setText(model.getValueAt(i,1).toString());
       txtFoodCost.setText(model.getValueAt(i,2).toString());
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
            java.util.logging.Logger.getLogger(CustomerFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFood().setVisible(true);
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
    private javax.swing.JLabel lblFoodCost;
    private javax.swing.JLabel lblFoodId;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblFoodName;
    private javax.swing.JLabel lblImage;
    public static javax.swing.JTextField txtFoodCost;
    private javax.swing.JTextField txtFoodId;
    public static javax.swing.JTextField txtFoodName;
    // End of variables declaration//GEN-END:variables

  /* private void show_user() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
