/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class addControl {
    public void item(int id, String name, String courseName, String batch,String email){
       new Model.addModel().addDetails(id, name, courseName, batch, email);
   }

   // public void item(int id, String name, String courseName, String batch,String email JTextField ol) { 
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    
    
    public void staf(int id, String name, int age, String gender,String address){
       new Model.addStaf().addDetails(id, name, age, gender, address);
   } 
    
    public void book(int id, String bookname,String author,String category){
       new Model.addbook().addDetails(id, bookname, author, category);
    }
}
