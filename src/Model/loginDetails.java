/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class loginDetails {
    
   public boolean check(String userName, String password) {
        Connection conn = DBconnector.conn();
        if (conn != null) {
            String sql = "SELECT * FROM signup WHERE userName = ? AND password = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, userName);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
      
       return false;
} 
    
}
