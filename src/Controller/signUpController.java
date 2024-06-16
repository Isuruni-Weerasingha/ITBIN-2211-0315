/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class signUpController {
    public void sign(String name, String userName, String email, String password){
        new Model.signUp().signData(name, userName, email, password);
}
}
