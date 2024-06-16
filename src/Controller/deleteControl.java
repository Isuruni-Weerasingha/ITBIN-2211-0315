/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class deleteControl {
    
    public void delet(int id){
        
        new Model.deleteMember().delete(id);
}
  
    
    public void deletStf(int id){
        
        new Model.deleteStaf().delete(id);
    }
    
    public void delebook(int id){
        
        new Model.deleteBook().delete(id);
    }
    
}
