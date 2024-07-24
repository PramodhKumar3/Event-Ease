package event.management;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

public final class AdminVenue extends javax.swing.JFrame {
    String filename = null;
    byte[] person_image = null;
    Connection conn = null;
    PreparedStatement pst = null;
    FileInputStream fs;
    File imageFile;

    public AdminVenue() {
        initComponents();
        conn = Connect.connect();
        show_user();
        showMaxID();
    }

    void showMaxID() {
        try {
            String sql = "SELECT MAX(VID) FROM ADMINVENUE";
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                String maxid = rs.getString(1);
                txtVenueId.setText((Integer.parseInt(maxid)+1)+"");
            }
        } catch (SQLException ex) {
            // Logger.getLogger(Registration.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void setImageFromDrive(File f) {
        imageFile = f;
    }

    File getImageFromDrive() {
        return imageFile;
    }

    public ArrayList<User> userList() {
        ArrayList<User> userList = new ArrayList<>();
        try {
            String query = "select * from adminvenue";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            User user;
            while (rs.next()) {
                user = new User(rs.getInt("vid"), rs.getString("vname"), rs.getString("vplace"), rs.getInt("vcost"), rs.getBytes("image"));
                userList.add(user);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return userList;
    }

    public void show_user() {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getvid();
            row[1] = list.get(i).getvname();
            row[2] = list.get(i).getvplace();
            row[3] = list.get(i).getvcost();
            model.addRow(row);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblVenueId = new javax.swing.JLabel();
        lblVenuename = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        BtnVenueCost = new javax.swing.JLabel();
        lblVenueImage = new javax.swing.JLabel();
        txtVenueId = new javax.swing.JTextField();
        txtVenueName = new javax.swing.JTextField();
        txtVenueCost = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVenuePlace = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        lblerrorvid = new javax.swing.JLabel();
        lblerrorvname = new javax.swing.JLabel();
        lblerrorvplace = new javax.swing.JLabel();
        lblerrorvcost = new javax.swing.JLabel();
        lblerrorimage = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venues");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 0, 110, 30);

        lblVenueId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVenueId.setForeground(new java.awt.Color(255, 255, 255));
        lblVenueId.setText("Venue ID :");
        getContentPane().add(lblVenueId);
        lblVenueId.setBounds(10, 50, 110, 22);

        lblVenuename.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVenuename.setForeground(new java.awt.Color(255, 255, 255));
        lblVenuename.setText("Venue Name :");
        getContentPane().add(lblVenuename);
        lblVenuename.setBounds(10, 100, 130, 22);

        btnInsert.setBackground(new java.awt.Color(204, 204, 204));
        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 430, 90, 30);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(350, 10, 90, 30);

        BtnVenueCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnVenueCost.setForeground(new java.awt.Color(255, 255, 255));
        BtnVenueCost.setText("Venue Cost :");
        getContentPane().add(BtnVenueCost);
        BtnVenueCost.setBounds(10, 200, 120, 22);

        lblVenueImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVenueImage.setForeground(new java.awt.Color(255, 255, 255));
        lblVenueImage.setText("Venue Image :");
        getContentPane().add(lblVenueImage);
        lblVenueImage.setBounds(10, 260, 140, 22);

        txtVenueId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtVenueId);
        txtVenueId.setBounds(190, 50, 150, 30);
        getContentPane().add(txtVenueName);
        txtVenueName.setBounds(190, 100, 150, 30);
        getContentPane().add(txtVenueCost);
        txtVenueCost.setBounds(190, 200, 150, 30);

        btnChoose.setBackground(new java.awt.Color(204, 204, 204));
        btnChoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoose);
        btnChoose.setBounds(350, 330, 90, 24);

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(130, 430, 90, 30);

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(340, 430, 90, 30);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venue ID", "Venue Name", "Venue Place", "Venue Cost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 0, 550, 470);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venue Place :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 150, 130, 22);
        getContentPane().add(txtVenuePlace);
        txtVenuePlace.setBounds(190, 150, 150, 30);

        lblImage.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lblImage);
        lblImage.setBounds(170, 260, 170, 130);
        getContentPane().add(lblerrorvid);
        lblerrorvid.setBounds(190, 80, 150, 20);
        getContentPane().add(lblerrorvname);
        lblerrorvname.setBounds(194, 130, 150, 20);
        getContentPane().add(lblerrorvplace);
        lblerrorvplace.setBounds(190, 180, 150, 20);
        getContentPane().add(lblerrorvcost);
        lblerrorvcost.setBounds(190, 230, 150, 20);
        getContentPane().add(lblerrorimage);
        lblerrorimage.setBounds(190, 400, 140, 20);

        resetbtn.setBackground(new java.awt.Color(204, 204, 204));
        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn);
        resetbtn.setBounds(240, 430, 80, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-600, -70, 1050, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminHome ob = new AdminHome();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
        lblImage.setIcon(imageIcon);

        setImageFromDrive(f);
        try {
            fs = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminVenue.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
   /*      if (txtVenueId.getText().equals("")) {
            lblerrorvid.setText("*fill id field");
        }
        if (txtVenueName.getText().equals("")) {
            lblerrorvname.setText("*fill venue field");
        }
        if (txtVenuePlace.getText().equals("")) {
            lblerrorvplace.setText("*fill place field");
        }
        if (txtVenueCost.getText().equals("")) {
            lblerrorvcost.setText("*fill cost field");
        }
        if (lblImage.getText().equals("")) {
            lblerrorimage.setText("*fill image field");
       
        } else {*/
        /*try {
            pst = conn.prepareStatement("INSERT INTO `adminvenue`(`vid`, `vname`,`vplace`, `vcost`,`image`) VALUES(?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(txtVenueId.getText()));
            pst.setString(2, txtVenueName.getText());
            pst.setString(3, txtVenuePlace.getText());
            pst.setString(4, txtVenueCost.getText());
            pst.setBinaryStream(5, fs, (long) getImageFromDrive().length());
            if (pst.executeUpdate() > 0) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                show_user();
                JOptionPane.showMessageDialog(null, "Inserted");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }*/
        try {
        if (txtVenueId.getText().isEmpty() || txtVenueName.getText().isEmpty() || txtVenuePlace.getText().isEmpty() || txtVenueCost.getText().isEmpty() || person_image == null) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields and choose an image.");
            return;
        }
        
        String venueName = txtVenueName.getText().toLowerCase(); // Convert venue name to lowercase for case-insensitive comparison
        
        // Check if venue name is "home"
        if (venueName.equals("home")) {
            if (txtVenuePlace.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your address in the Venue Place field.");
                return;
            }
        }
        
        pst = conn.prepareStatement("INSERT INTO `adminvenue`(`vid`, `vname`,`vplace`, `vcost`,`image`) VALUES(?,?,?,?,?)");
        pst.setInt(1,Integer.parseInt(txtVenueId.getText()));
        pst.setString(2, txtVenueName.getText());
        
        // If venue name is "home," set the venue place to the address entered by the user
        if (venueName.equals("home")) {
            pst.setString(3, txtVenuePlace.getText());
        } else {
            pst.setString(3, ""); // Otherwise, set an empty string for venue place
        }
        
        pst.setString(4, txtVenueCost.getText());
        pst.setBinaryStream(5, fs, (long) getImageFromDrive().length());
        
        if (pst.executeUpdate() > 0) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Inserted");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
    //  }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txtVenueId.setText(model.getValueAt(i, 0).toString());
        txtVenueName.setText(model.getValueAt(i, 1).toString());
        txtVenuePlace.setText(model.getValueAt(i, 2).toString());
        txtVenueCost.setText(model.getValueAt(i, 3).toString());
        byte[] img = (userList().get(i).getImage());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
        lblImage.setIcon(imageIcon);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          int i = jTable1.getSelectedRow();
        try {
            int row = jTable1.getSelectedRow();
            String value = (String)(jTable1.getModel().getValueAt(row, 0).toString());
            System.out.println(value);
            String query = "UPDATE `adminvenue` SET `vid`=?,`vname`=?,`vplace`=?,`vcost`=? WHERE vid='"+value+"'";
            pst = conn.prepareStatement(query);
            pst.setString(1, txtVenueId.getText());
            pst.setString(2, txtVenueName.getText());
            pst.setString(3, txtVenuePlace.getText());
            pst.setString(4, txtVenueCost.getText());
          // pst.setBinaryStream(5, fs, (long) getImageFromDrive().length());
            if (pst.executeUpdate() > 0) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                show_user();
                JOptionPane.showMessageDialog(null, "Updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Are You Sure To Delete ?", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                int row = jTable1.getSelectedRow();
                String value = (String) (jTable1.getModel().getValueAt(row, 0).toString());
                String query = "DELETE FROM `adminvenue` WHERE vid=" + value;
                pst = conn.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                show_user();
                JOptionPane.showMessageDialog(null, "Deleted");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtVenueIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueIdActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        txtVenueId.setText("");
        txtVenueName.setText("");
        txtVenuePlace.setText("");
        txtVenueCost.setText("");
        lblImage.setIcon(null);
    }//GEN-LAST:event_resetbtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AdminVenue().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnVenueCost;
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
    public static javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblVenueId;
    private javax.swing.JLabel lblVenueImage;
    private javax.swing.JLabel lblVenuename;
    private javax.swing.JLabel lblerrorimage;
    private javax.swing.JLabel lblerrorvcost;
    private javax.swing.JLabel lblerrorvid;
    private javax.swing.JLabel lblerrorvname;
    private javax.swing.JLabel lblerrorvplace;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField txtVenueCost;
    private javax.swing.JTextField txtVenueId;
    private javax.swing.JTextField txtVenueName;
    private javax.swing.JTextField txtVenuePlace;
    // End of variables declaration//GEN-END:variables
}
