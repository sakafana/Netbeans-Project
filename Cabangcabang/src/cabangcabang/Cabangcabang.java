
package cabangcabang;

import java.util.Scanner;


public class Cabangcabang {

 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berapa nilai Computer Science kamu: ");
        int nilai = scan.nextInt();
        
    
        if (nilai > 100  ){
        System.out.println("Ngarang kamu ya");
        } 
        
        else if (nilai >= 95 ){
        System.out.println("ANDA DAPET NILAI A");
        }
        
        else if (nilai >= 90 ){
        System.out.println("ANDA DAPET NILAI B");
        }
        
        else if (nilai >= 80 ){
        System.out.println("ANDA DAPET NILAI C");
        }
        
        else if (nilai >= 50 ){
        System.out.println("ANDA DAPET NILAI D");
        }
        
        else if (nilai >= 0 ){
        System.out.println("ANDA DAPET NILAI E");
        }
       
        else {
        System.out.println("BODOH KAMU!!");
        }
        
        
        
    }
    
}
