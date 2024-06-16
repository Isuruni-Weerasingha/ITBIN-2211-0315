/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class DBconnector {
    public static Connection conn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Note the updated driver class
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms1", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Use e.getMessage() for a better error message
        }
        return conn;
}
}
