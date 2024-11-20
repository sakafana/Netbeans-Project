/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paskal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author safanadika
 */
public class Paskal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList densus = new ArrayList ();
     boolean ulang = true;
     while (ulang){ 
        System.out.println("<HAI SEMUA TADA INI DIA DENSUS APP>");
        System.out.println("1. Add data\n2. Delete or change data\n3. Perlihatkan semua data ");
        System.out.println("Yok mau pilih menu yang mana?");
        System.out.println("Kalau mau exit tekan 0!");
        
        Scanner scan = new Scanner (System.in);
        String menu = scan.nextLine ();
        
    if(menu.equals("1")){
        System.out.print("Masukan data yang kamu mau : ");
        Scanner scan2 = new Scanner (System.in);
        String Data = scan2.nextLine(); 
        
        densus.add(Data);
        System.out.println("\nData sudah kutambahkan!");
    }
        
    else if(menu.equals("2")){
        Scanner scan2 = new Scanner(System.in);  
        System.out.print("Pilih [1] untuk delete data or [2] untuk edit data : ");
        String pil = scan2.nextLine();
        int x = densus.size();
        if (x >= 1){
            if(pil.equals("1")){
                System.out.println("Silahkan mau yang mana yang kamu ingin hapus :" + densus);
                Scanner scan3 = new Scanner(System.in);
                String Data = scan3.nextLine();
                densus.remove(Data);
                System.out.println("\n"+Data+"\nOke sudah berhasil dihapus");
            }
            else if(pil.equals("2")){
        System.out.println("Mau ganti siapa :\n"+ densus);
        Scanner scan3 = new Scanner(System.in);
        String data3 = scan3.nextLine();
        
        System.out.print("Masukan nama barunya : ");
                Scanner scan4 = new Scanner(System.in);
                String data2 = scan4.nextLine();
                
                densus.set(densus.indexOf(data3), data2);
                System.out.println("\nYour data has been edited!");
            }
            else{
                System.out.println("GABISA DONG, error");
            }
        }
        else {
            System.out.println("Kamu belum masukin nama nya nih\n");
        }
        }
    
     
    else if(menu.equals("3")){
            System.out.println("Data yang ada, adalah : ");
            for(int x = 0; x < densus.size(); x++){ 
                System.out.println("[" + (x+1 )+ "] " + densus.get(x));
            }
            System.out.println("\n  Tekan ENTER buat lanjut \n ");
            Scanner scan3 = new Scanner(System.in);
            String Data = scan3.nextLine(); 
        }
    else if(menu.equals("0")){
                System.out.println("Lah beneran ? (y/n) ");
               Scanner scan2 = new Scanner(System.in);
            String exit = scan2.nextLine(); 
            if (exit.endsWith("y")||exit.endsWith("Y")||exit.endsWith("yes")||exit.endsWith("YES")||exit.endsWith("Yes")) {
                
                System.out.println("Press ENTER to EXIT!");
                Scanner scan3 = new Scanner(System.in);
                String exit2 = scan3.nextLine();
                if(exit2.equals("")){
                   
                }
                  else{
                    System.out.println("\n Welcome Back :)"); 
                }
            }
            else{
            System.out.println("\n Welcome Back :)"); 
            }   
            }
    
            else {
                System.out.println("INVALID INPUT ! Coba lagi !");
            }
       
     }}}
    
    

