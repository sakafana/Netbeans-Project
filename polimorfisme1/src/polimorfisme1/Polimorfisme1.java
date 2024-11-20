/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme1;

/**
 *
 * @author safanadika
 */
public class Polimorfisme1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        superclass1 ob1,ob2,ob3;
        
        ob1 = new superclass1();
        ob2 = new subclass1();
        ob3 = new subclass2();
        
        ob1.method1();
        ob2.method1();
        ob3.method1();
  
    }
    
}
