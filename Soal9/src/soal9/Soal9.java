
package soal9;

import java.util.Scanner;

/**
 *
 * @author safanadika
 */
public class Soal9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("silakan masukan angkanya: ");
        int p=sc.nextInt();
        
        for(int i = 1; i <= p; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            }
    }
}
    

