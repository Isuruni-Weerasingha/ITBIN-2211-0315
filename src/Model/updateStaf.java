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
public class updateStaf {
    
    Connection con = null;
    PreparedStatement pst = null;

    public void update(int id, String staffName, int agee, String gender , String address) {
        con = DBconnector.conn();

        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed.");
            return;
        }

        try {
            String sqlquery = "UPDATE staff_members SET staff_name = ?, age = ?, gender = ?, address = ? WHERE staffid  = ?";
            pst = con.prepareStatement(sqlquery);
            pst.setInt(5, id);
            pst.setString(1, staffName);
            pst.setInt(2, agee);          
            pst.setString(3, gender);
            pst.setString(4, address);
            
            

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Update successful");
            } else {
                JOptionPane.showMessageDialog(null, "No rows were updated. Please check the input data and try again.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Failed to close resources: " + e.getMessage());
            }
}
}
    
    
}
