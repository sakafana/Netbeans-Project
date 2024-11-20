/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.jibril;

import java.util.Scanner;

/**
 *
 * @author safanadika
 */
public class PercobaanJibril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        
        System.out.print("Masukkan nomor pertama ");
        int A = scan.nextInt();
        System.out.print ("Masukkan nomor kedua ");
        int C = scan.nextInt ();
        System.out.println("Kamu menunjukkan range dalam bilangan genap atau ganjil?");
        String bilangan = scan2.nextLine();
        
        int modul = A % 2;
        
        if (modul == 0){
        switch (bilangan) {
            
            case ("genap"):
             System.out.println ("Kamu memilih range bilangan genap dari  "+ A +"-"+ C + " adalah:");
             for (int i = A; i <= C; i +=2) {
             System.out.print (i + ",");
             }
             break;
             
            case ("ganjil"):
                System.out.println ("Kamu memilih range bilangan ganjil dari  "+ A +"-"+ C + " adalah:");
                for (int i = A +1 ; i <= C; i +=2) {  
                System.out.print (i + ",");
                }
                break; 
            default :
                System.out.println("Range bilangan ganjil & genap dari "+A+"-"+C+"adalah:");
                System.out.println("Genap:");
                for (int i = A; i <= C; i+=2){
                System.out.print(i+",");}
                System.out.println("");
                System.out.println("Ganjil:");
                for (int i =A+1; i <= C; i+=2){
                System.out.print(i+",");}
            break;
        }
        }
        else {
          switch (bilangan) {
            
            case ("genap"):
             System.out.println ("Kamu memilih range bilangan genap dari  "+ A +"-"+ C + " adalah:");
             for (int i = A+1; i <= C; i +=2) {
             System.out.print (i + ",");
             }
             break;
             
            case ("ganjil"):
                System.out.println ("Kamu memilih range bilangan ganjil dari  "+ A +"-"+ C + " adalah:");
                for (int i = A ; i <= C; i +=2) {  
                System.out.print (i + ",");
                }
                break;  
            default :
                System.out.println("Range bilangan ganjil & genap dari "+A+"-"+C+"adalah:");
                System.out.println("Genap:");
                for (int i = A+1; i <= C; i+=2){
                System.out.print(i+",");}
                System.out.println("");
                System.out.println("Ganjil:");
                for (int i =A; i <= C; i+=2){
                System.out.print(i+",");}
                System.out.println(" ");
            break;
                }
        }
    }}

