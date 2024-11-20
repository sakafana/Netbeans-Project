/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contoh2;
import paketku.classku;
/**
 *
 * @author safanadika
 */
public class Contoh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        operasiBilangan op1=new operasiBilangan();
        
        op1.bilangan1=10;
        op1.bilangan2=20;
        op1.jumlah();
        op1.tampilHasil();
        
        operasiBilangan op2=new operasiBilangan();
        
        op2.bilangan1=30;
        op2.bilangan2=25;
        op2.jumlah();
        op2.tampilHasil();
        
        classku kelas=new classku();
        
        kelas.cetakHelloWorld();
        
    }
    
}
