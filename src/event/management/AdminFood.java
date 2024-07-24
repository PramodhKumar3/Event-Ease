package event.management;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminFood extends javax.swing.JFrame {
    String filename=null;
    byte[] person_image=null;
    Connection conn=null;
    PreparedStatement pst=null;
   
    FileInputStream fs;
    File imageFile;
    public AdminFood() {
        initComponents();
        conn=Connect.connect();
        show_user();
        showMaxID();
    }
    void showMaxID() {
        try {
            String sql = "SELECT MAX(FID) FROM ADMINFOOD";
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String maxid = rs.getString(1);
                txtFoodId.setText((Integer.parseInt(maxid)+1)+"");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

     void setImageFromDrive(File f)
    {
        imageFile = f;
    }
    File getImageFromDrive()
    {
        return imageFile;
    }
    public ArrayList<User1> userList(){
        ArrayList<User1> userList= new ArrayList<>();
        try{
            String query1="SELECT * FROM adminfood";
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User1 user;
            while(rs.next()){
              user=new User1(rs.getInt("fid"),rs.getString("fname"),rs.getInt("fcost"),rs.getBytes("image"));
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

        lblFoodId = new javax.swing.JLabel();
        lblFoodName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFoodCost = new javax.swing.JLabel();
        lblFoodImage = new javax.swing.JLabel();
        txtFoodId = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        txtFoodCost = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 420));
        getContentPane().setLayout(null);

        lblFoodId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodId.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodId.setText("Food ID :");
        getContentPane().add(lblFoodId);
        lblFoodId.setBounds(10, 70, 110, 30);

        lblFoodName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodName.setText("Food Name :");
        getContentPane().add(lblFoodName);
        lblFoodName.setBounds(10, 110, 130, 22);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(400, 10, 90, 20);

        lblFoodCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodCost.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodCost.setText("Food Cost :");
        getContentPane().add(lblFoodCost);
        lblFoodCost.setBounds(10, 160, 120, 22);

        lblFoodImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImage.setForeground(new java.awt.Color(255, 255, 255));
        lblFoodImage.setText("Food Image :");
        getContentPane().add(lblFoodImage);
        lblFoodImage.setBounds(10, 210, 140, 22);
        getContentPane().add(txtFoodId);
        txtFoodId.setBounds(180, 70, 150, 30);
        getContentPane().add(txtFoodName);
        txtFoodName.setBounds(180, 110, 150, 30);
        getContentPane().add(txtFoodCost);
        txtFoodCost.setBounds(180, 150, 150, 30);

        btnChoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoose);
        btnChoose.setBounds(380, 240, 90, 24);

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 340, 90, 24);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(140, 340, 100, 24);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(260, 340, 90, 24);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(1192, 392));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Id", "Food Name", "Food Cost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 0, 610, 400);
        getContentPane().add(lblImage);
        lblImage.setBounds(180, 190, 160, 140);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 10, 110, 30);

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn);
        resetbtn.setBounds(380, 340, 90, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 530, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      AdminHome ob = new AdminHome();
      ob.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
     try{
            pst=conn.prepareStatement("INSERT INTO `adminfood`(`fid`, `fname` ,`fcost`,`image`) VALUES (?,?,?,?)");
            //pst=Connect.getConnection().prepareStatement(query);
            pst.setString(1,txtFoodId.getText());
            pst.setString(2,txtFoodName.getText());
            pst.setString(3,txtFoodCost.getText());
           // pst.setString(4,lblImage.getText());
            pst.setBinaryStream(4,fs,(long)getImageFromDrive().length());                    
           if (pst.executeUpdate() > 0){
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Inserted sucessfully");
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,ex);
            }                                  
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageIcon);
        
        setImageFromDrive(f);
        try {
            fs = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminVenue.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
             person_image = bos.toByteArray();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int opt = JOptionPane.showConfirmDialog(null, "Are You Sure To Delete ?", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {        
        try{
            int row = jTable1.getSelectedRow();
            String value = (String) (jTable1.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM `adminfood` WHERE fid="+value;
            pst=conn.prepareStatement(query);
            pst.executeUpdate();
             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.setRowCount(0);
              show_user();
              JOptionPane.showMessageDialog(null,"Deleted");
            
             }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
  try{
            int row = jTable1.getSelectedRow();
            String value = (String) (jTable1.getModel().getValueAt(row, 0).toString());
            String query;
            query = "UPDATE `adminfood` SET `fid`=?,`fname`=?,`fcost`=? WHERE fid="+value;
            pst=conn.prepareStatement(query);
            pst.setString(1,txtFoodId.getText());
            pst.setString(2,txtFoodName.getText());
            pst.setString(3,txtFoodCost.getText());
          if (pst.executeUpdate() > 0)
          {
              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.setRowCount(0);
              show_user();
              JOptionPane.showMessageDialog(null,"Updated");
          }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,ex);
            }    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int i=jTable1.getSelectedRow();
       TableModel model= jTable1.getModel();
       txtFoodId.setText(model.getValueAt(i,0).toString());
       txtFoodName.setText(model.getValueAt(i,1).toString());
       txtFoodCost.setText(model.getValueAt(i,2).toString());
       byte[] img=(userList().get(i).getImage());
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
       lblImage.setIcon(imageIcon);
    }//GEN-LAST:event_jTable1MouseClicked

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
            txtFoodId.setText("");
            txtFoodName.setText("");
            txtFoodCost.setText("");
            lblImage.setIcon(null);
    }//GEN-LAST:event_resetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFoodCost;
    private javax.swing.JLabel lblFoodId;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblFoodName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField txtFoodCost;
    private javax.swing.JTextField txtFoodId;
    private javax.swing.JTextField txtFoodName;
    // End of variables declaration//GEN-END:variables
}
