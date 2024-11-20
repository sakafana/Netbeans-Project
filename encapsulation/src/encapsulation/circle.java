/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author safanadika
 */
public class circle {
   private int r;
   private double area;
    
   public void setr (int r){
       if (r>0){       
           this.r=r;       
       }
       else{      
           this.r=0;
       }
   }
   
   public int getr(){
   
   return this.r=r;
   }
   
   public double getarea(){
   
       return this.area;
   
   }
   
    void hitungarea(){
    
        this.area = Math.PI*this.r*this.r;
    
    
    }
    
}
