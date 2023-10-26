/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterrGetter;

/**
 *
 * @author UsEr
 */
public class TugasSettergetter {
     private String nama;
    private String no_pelanggan;
    
    public void SetNama(String nama){
        this.nama = nama;  
    }
    public void SetNo_Pelanggan(String no_pelanggan){
        this.no_pelanggan = no_pelanggan;
    }
    public String GetNama(){
        return this.nama;
    }
    public String GetNo_Pelanggan(){
        return this.no_pelanggan;
    }
}
