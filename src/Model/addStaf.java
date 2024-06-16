/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class addStaf {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addDetails(int id, String name, int age, String gender,String address) {
        con = DBconnector.conn();
        
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed");
            return;
        }

        try {
            String sql = "INSERT INTO staff_members (staffid, staff_name , age, gender, address ) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setString(4, gender);
            pst.setString(5, address);
            
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
