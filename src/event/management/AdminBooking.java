package event.management;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminBooking extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;

    public AdminBooking() {
        initComponents();
        conn = Connect.connect();
        show_user();
    }

    public ArrayList<Book1> userList() {
        ArrayList<Book1> userList = new ArrayList<>();
        try {
            String query = "select * from bookevent";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            Book1 user;
            while (rs.next()) {
                user = new Book1(rs.getInt("customer_id"), rs.getInt("guests"), rs.getInt("venue_cost"), rs.getInt("food_cost"), rs.getInt("equipment_cost"), rs.getInt("total"), rs.getString("customer_name"), rs.getString("event_type"), rs.getString("venue"), rs.getString("food_name"), rs.getString("equipment"), rs.getDate("date"));
                userList.add(user);
            }

        } catch (Exception ex) {
            // Logger.getLogger(Registration.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return userList;
    }

    public void show_user() {
        ArrayList<Book1> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[12];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getcustomername();
            row[1] = list.get(i).getcustomerid();
            row[2] = list.get(i).geteventtype();
            row[3] = list.get(i).getvenue();
            row[4] = list.get(i).getfood();
            row[5] = list.get(i).getequipment();
            row[6] = list.get(i).getdate();
            row[7] = list.get(i).getguests();
            row[8] = list.get(i).getvcost();
            row[9] = list.get(i).getfcost();
            row[10] = list.get(i).getecost();
            row[11] = list.get(i).gettotal();

            model.addRow(row);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BtnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBooking = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        BtnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBack.setText("BACK");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBack);
        BtnBack.setBounds(380, 460, 72, 30);

        jScrollPane2.setColumnHeaderView(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Name", " id", "event type", "venue", "food name", "equipment", "date", "guests", "venue cost", "food cost", "equipment cost", "total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 800, 350);

        lblBooking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBooking.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking.setText("       BOOKINGS");
        getContentPane().add(lblBooking);
        lblBooking.setBounds(300, 30, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-240, 0, 1190, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        AdminHome ob = new AdminHome();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AdminBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminBooking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBooking;
    // End of variables declaration//GEN-END:variables
}
