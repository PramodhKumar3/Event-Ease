//Database Connection Main class
package event.management;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;


public class Connect {
    
    public static Connection connect(){
        Connection conn=null;
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oemdb","root","");
        Component rootpane=null;
        System.out.println("Connected");
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }
        return conn;
    } 
    
    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
