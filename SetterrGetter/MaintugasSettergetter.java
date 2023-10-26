/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterrGetter;

/**
 *
 * @author UsEr
 */
public class MaintugasSettergetter {
     public static void main(String[]args){
        TugasSettergetter customer = new TugasSettergetter();
        customer.SetNama("Mahlabib Kafi Rizal");
        customer.SetNo_Pelanggan("29183920129");
        
        System.out.println("Nama pelanggan : "+customer.GetNama());
        System.out.println("Nomor Pelanggan : "+customer.GetNo_Pelanggan());
    }
}
