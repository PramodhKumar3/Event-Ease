package event.management;

import java.awt.Image;
import static java.lang.Boolean.TRUE;
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

public class CustomerVenue extends javax.swing.JFrame {
     Connection conn=null;
    PreparedStatement pst=null;
  
    public CustomerVenue() {
        initComponents();
        conn=Connect.connect();
         show_user();
    }
     public ArrayList<User> userList() {
      ArrayList<User> userList =new ArrayList<>();  
      try{
          String query="select * from adminvenue";
          Statement st=conn.createStatement();
          ResultSet rs = st.executeQuery(query);
          User user;
          while(rs.next()){
              user = new User(rs.getInt("vid"),rs.getString("vname"),rs.getString("vplace"),rs.getInt("vcost"),rs.getBytes("image"));
              userList.add(user);    
          }
          
      }catch(Exception ex){
           // Logger.getLogger(Registration.class.getName()).log(Level.SEVERE,null,ex);
           JOptionPane.showMessageDialog(null,ex);
            }
      return userList;
    }
    public void show_user(){
        ArrayList<User>list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[]row =new Object[4];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getvid();
            row[1]=list.get(i).getvname();
            row[2]=list.get(i).getvplace();
            row[3]=list.get(i).getvcost();
            model.addRow(row);
             
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblVenueId = new javax.swing.JLabel();
        lblVenuename = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        BtnVenueCost = new javax.swing.JLabel();
        lblVenueImage = new javax.swing.JLabel();
        txtVenueId = new javax.swing.JTextField();
        txtVenueName = new javax.swing.JTextField();
        txtVenueCost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVenuePlace = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(905, 475));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venues");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(176, 11, 110, 30);

        lblVenueId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVenueId.setForeground(new java.awt.Color(255, 255, 255));
        lblVenueId.setText("Venue ID :");
        getContentPane().add(lblVenueId);
        lblVenueId.setBounds(10, 59, 110, 22);

        lblVenuename.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVenuename.setForeground(new java.awt.Color(255, 255, 255));
        lblVenuename.setText("Venue Name :");
        getContentPane().add(lblVenuename);
        lblVenuename.setBounds(10, 109, 130, 22);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(130, 410, 100, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(250, 410, 90, 30);

        BtnVenueCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnVenueCost.setForeground(new java.awt.Color(255, 255, 255));
        BtnVenueCost.setText("Venue Cost :");
        getContentPane().add(BtnVenueCost);
        BtnVenueCost.setBounds(10, 200, 120, 22);

        lblVenueImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVenueImage.setForeground(new java.awt.Color(255, 255, 255));
        lblVenueImage.setText("Venue Image :");
        getContentPane().add(lblVenueImage);
        lblVenueImage.setBounds(10, 270, 140, 22);
        getContentPane().add(txtVenueId);
        txtVenueId.setBounds(220, 59, 150, 30);

        txtVenueName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtVenueName);
        txtVenueName.setBounds(220, 109, 150, 30);
        getContentPane().add(txtVenueCost);
        txtVenueCost.setBounds(220, 199, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venue Place :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 159, 130, 22);
        getContentPane().add(txtVenuePlace);
        txtVenuePlace.setBounds(220, 159, 150, 30);
        getContentPane().add(lblImage);
        lblImage.setBounds(189, 245, 190, 140);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venue Id", "Venue Name", "Venue Place", "Venue Cost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(485, 0, 420, 460);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-470, 0, 960, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

     CustomerFood ob = new CustomerFood();
     ob.setVisible(true);
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
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txtVenueId.setText(model.getValueAt(i,0).toString());
        txtVenueName.setText(model.getValueAt(i,1).toString());
        txtVenuePlace.setText(model.getValueAt(i,2).toString());
        txtVenueCost.setText(model.getValueAt(i,3).toString());
        byte[]img = (userList().get(i).getImage());
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageIcon);
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtVenueNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueNameActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerVenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnVenueCost;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblVenueId;
    private javax.swing.JLabel lblVenueImage;
    private javax.swing.JLabel lblVenuename;
    public static javax.swing.JTextField txtVenueCost;
    private javax.swing.JTextField txtVenueId;
    public static javax.swing.JTextField txtVenueName;
    private javax.swing.JTextField txtVenuePlace;
    // End of variables declaration//GEN-END:variables

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}