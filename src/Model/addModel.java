/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
public class addModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addDetails(int id, String name, String courseName, String batch,String email ) {
        con = DBconnector.conn();
        
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed");
            return;
        }

        try {
            String sql = "INSERT INTO student_record (studentid, student_name, course_name, batch_name, email ) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, courseName);
            pst.setString(4, batch);
            pst.setString(5, email);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFUL");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Use e.getMessage() for a more specific error message
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
}
}
}
