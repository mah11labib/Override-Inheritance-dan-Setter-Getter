/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterrGetter;

/**
 *
 * @author UsEr
 */
public class Main { 
    public static void main(String[]args){
                User user = new User();
        user.SetUsername("Mahlabib Kafi Rizal");
        user.Setpassword("aaaaaaaCayang");
        
        System.out.println("Usernamenya = "+user.GetUsername());
        System.out.println("Passowrdnya = "+user.GetPassword());
    }
    }
