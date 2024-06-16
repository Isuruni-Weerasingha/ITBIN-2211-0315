/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class deleteStaf {
    
      
    Connection con = null;
    PreparedStatement pst = null;
    
    public void delete(int id){
        
        con = DBconnector.conn();
        
        try{
           // String sqlquery = "DELETE FROM order WHERE customerId = '"+id+"' ";
            String sqlqury="DELETE FROM staff_members WHERE staffid  = '"+id+"'";
            pst = con.prepareStatement(sqlqury);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
}
}
    
}
