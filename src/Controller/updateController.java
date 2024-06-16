/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class updateController {
    
    
    public void update(int id, String name, String courseName, String batch , String email) {
        new Model.updateMember().update(id, name, courseName, batch , email);
}
    
   public void updatStaf(int id, String staffName, int agee, String gender , String address){
       
       new Model.updateStaf().update(id, staffName, agee, gender , address);
   }
    
   public void updatBook(int id, String bookname,String author,String category){
       
       new Model.updateBook().update(id, bookname, author, category);
   }
}
