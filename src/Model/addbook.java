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
public class addbook {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addDetails(int id, String bookname,String author,String category) {
        con = DBconnector.conn();
        
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed");
            return;
        }

        try {
            String sql = "INSERT INTO record_book (bookid, b_name , b_author, category ) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, bookname);
            pst.setString(3,author);
           // pst.setInt(3, author);
            pst.setString(4, category);
            
            
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
