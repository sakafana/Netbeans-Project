 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suhu;

import java.util.Scanner;

/**
 *
 * @author safanadika
 */
public class Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        konversiSuhu k = new konversiSuhu();
        k.Celcius = 30 ;
        k.tampilkanHasil();
        
        konversiSuhu o = new konversiSuhu();
        o.Celcius = 120 ;
        o.tampilkanHasil();
        
        konversiSuhu n = new konversiSuhu();
        n.Celcius = 45;
        n.tampilkanHasil();
        
        konversiSuhu t = new konversiSuhu();
        t.Celcius = 50.5f;
        t.tampilkanHasil();

    }
    
}
