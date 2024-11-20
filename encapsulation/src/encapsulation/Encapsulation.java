/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author safanadika
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        circle ob1=new circle();
        ob1.setr(10);
        ob1.hitungarea();
        System.out.println("Area of the circle with r = "+ ob1.getr()+" is "+ ob1.getarea());
        
    }
    
}
