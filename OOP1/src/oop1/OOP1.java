/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop1;

/**
 *
 * @author safanadika
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    
//    final int x= 10;
//    int e=10;
    
    
    public static void main(String[] args) {
       
        kendaraan ob1 = new kendaraan("Kijang Innova");
//        ob1.nama = "Alphard";
        ob1.jmlRoda=4;
        ob1.jmlSeat=8;
        
        ob1.tampiljmlRoda();
        ob1.tampilJmlSeat();
        
        
        KeretaApi ob2 = new KeretaApi("KA. Argo Lawu","Executive");
//        ob2.nama = "KA. Argo Lawu";
        ob2.jmlRoda=100;
        ob2.jmlSeat=500;
        ob2.jmlGerbong=20;
        
        ob2.tampiljmlRoda();
        ob2.tampilJmlSeat();
        ob2.tampilJmlGerbong();
        ob2.tampiltipeKA();
        
//        OOP1 j = new OOP1();
////        j.x=25;
//        System.out.println(j.x);
//        j.e=25;
//        System.out.println(j.e);
        
      
    
        
    }
    
}
