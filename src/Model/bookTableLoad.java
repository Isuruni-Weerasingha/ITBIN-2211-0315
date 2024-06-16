/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class bookTableLoad {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet fetchTableData() {
        con = DBconnector.conn();
        try {
            String sql = "SELECT bookid  , b_name, b_author, category FROM record_book";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    public ResultSet searchData(int id){
      con = DBconnector.conn();
        try {
            String sql = "SELECT * FROM order WHERE bookid LIKE '%"+id+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;

    }
}
