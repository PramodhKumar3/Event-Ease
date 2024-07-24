
package event.management;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class AdminEquipment extends javax.swing.JFrame {
    String filename=null;
    byte[] person_image=null;
    Connection conn=null;
    PreparedStatement pst=null;
    FileInputStream fs;
    File imageFile;
  
    public AdminEquipment() {
        initComponents();
        conn=Connect.connect();
        show_user();
        showMaxID();
    }
     void showMaxID() {
        try {
            String sql = "SELECT MAX(EID) FROM ADMINEQUIPMENT";
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String maxid = rs.getString(1);
                txtEquipmentId.setText((Integer.parseInt(maxid)+1)+"");
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
public ArrayList<User2> userList(){
        ArrayList<User2> userList= new ArrayList<>();
        try{
            String query1="SELECT * FROM adminequipment";
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User2 user;
            while(rs.next()){
              user=new User2(rs.getInt("eid"),rs.getString("ename"),rs.getInt("ecost"),rs.getBytes("image"));
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

        jLabel1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblEquipmentId = new javax.swing.JLabel();
        lblEquipmentName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblEquipmentCost = new javax.swing.JLabel();
        lblEquipmentImage = new javax.swing.JLabel();
        txtEquipmentId = new javax.swing.JTextField();
        txtEquipmentName = new javax.swing.JTextField();
        txtEquipmentCost = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 450));
        getContentPane().setLayout(null);

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 390, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Equipments");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 10, 170, 30);

        lblEquipmentId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentId.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentId.setText("Equipment ID :");
        getContentPane().add(lblEquipmentId);
        lblEquipmentId.setBounds(10, 60, 160, 22);

        lblEquipmentName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentName.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentName.setText("Equipment Name :");
        getContentPane().add(lblEquipmentName);
        lblEquipmentName.setBounds(10, 120, 170, 22);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(340, 20, 90, 20);

        lblEquipmentCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentCost.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentCost.setText("Equipment Cost :");
        getContentPane().add(lblEquipmentCost);
        lblEquipmentCost.setBounds(10, 170, 160, 22);

        lblEquipmentImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEquipmentImage.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipmentImage.setText("Equipment Image :");
        getContentPane().add(lblEquipmentImage);
        lblEquipmentImage.setBounds(0, 230, 180, 22);
        getContentPane().add(txtEquipmentId);
        txtEquipmentId.setBounds(210, 60, 140, 30);
        getContentPane().add(txtEquipmentName);
        txtEquipmentName.setBounds(210, 120, 140, 30);
        getContentPane().add(txtEquipmentCost);
        txtEquipmentCost.setBounds(210, 170, 140, 30);

        btnChoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoose);
        btnChoose.setBounds(360, 310, 90, 24);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "equipment id   ", "equipment name ", "equipment cost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 0, 490, 460);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(120, 390, 100, 30);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(330, 390, 90, 30);
        getContentPane().add(lblImage);
        lblImage.setBounds(200, 220, 150, 140);

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn);
        resetbtn.setBounds(230, 390, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-600, -20, 1050, 480);

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
            pst=conn.prepareStatement("INSERT INTO `adminequipment`(`eid`, `ename` ,`ecost`,`image`) VALUES (?,?,?,?)");
           
            pst.setString(1,txtEquipmentId.getText());
            pst.setString(2,txtEquipmentName.getText());
            pst.setString(3,txtEquipmentCost.getText());
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int i=jTable1.getSelectedRow();
       TableModel model= jTable1.getModel();
       txtEquipmentId.setText(model.getValueAt(i,0).toString());
       txtEquipmentName.setText(model.getValueAt(i,1).toString());
       txtEquipmentCost.setText(model.getValueAt(i,2).toString());
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here:
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
            try{
                int row = jTable1.getSelectedRow();
                String value = (String) (jTable1.getModel().getValueAt(row, 0).toString());
                String query;
                query = "UPDATE `adminequipment` SET `eid`=?,`ename`=?,`ecost`=? WHERE eid="+value;
                pst=conn.prepareStatement(query);
                //pst=Connect.getConnection().prepareStatement(query);
                pst.setString(1,txtEquipmentId.getText());
                pst.setString(2,txtEquipmentName.getText());
                //pst.setString(3,txtFoodPlace.getText());
                pst.setString(3,txtEquipmentCost.getText());

                if (pst.executeUpdate() > 0)
                {
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.setRowCount(0);
                    show_user();
                    JOptionPane.showMessageDialog(null,"Updated");
                }
            }catch(SQLException ex){
                // Logger.getLogger(Registration.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(null,ex);
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Are You Sure To Delete ?", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
        try{
            int row = jTable1.getSelectedRow();
            String value = (String) (jTable1.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM `adminequipment` WHERE eid="+value;
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

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        txtEquipmentId.setText("");
        txtEquipmentName.setText("");
        txtEquipmentCost.setText("");
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
            java.util.logging.Logger.getLogger(AdminEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEquipmentCost;
    private javax.swing.JLabel lblEquipmentId;
    private javax.swing.JLabel lblEquipmentImage;
    private javax.swing.JLabel lblEquipmentName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField txtEquipmentCost;
    private javax.swing.JTextField txtEquipmentId;
    private javax.swing.JTextField txtEquipmentName;
    // End of variables declaration//GEN-END:variables

}
