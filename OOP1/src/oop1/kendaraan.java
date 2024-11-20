/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author safanadika
 */
public class kendaraan {
    public int jmlRoda;
      public int jmlSeat;
        public String nama;
        
        public kendaraan(String x) {

            this.nama=x;
        }

    

 
        public void tampiljmlRoda(){
        
            System.out.println(this.nama+" jumlah rodanya "+this.jmlRoda);
        
        }
        
        public void tampilJmlSeat(){
        
             System.out.println(this.nama+" jumlah seat "+this.jmlSeat);
        
        }
}
