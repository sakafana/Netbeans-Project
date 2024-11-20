
package helloworld;

import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
       
        System.out.println ("Welcome to the Digital World");
        try (Scanner scan = new Scanner (System.in)) {
            System.out.print("Well, now tell your name: ");
            String name = scan.nextLine();
            System.out.println("Ok, " + name + " You're my slave now.");
            System.out.println("HAHAAHAHHAA");
        }
       
      
    }
    
}
