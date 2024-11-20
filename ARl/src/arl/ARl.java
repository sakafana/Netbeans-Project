
package arl;

import java.util.ArrayList;
import java.util.Scanner;


public class ARl {

    
    public static void main(String[] args) {
        
    ArrayList census = new ArrayList(); 
    
    boolean ulang = true; 
        while (ulang){
        System.out.println("=====DAFTAR NAMA ORANG YANG KAMU SUKA=====");
        System.out.println("""
                           1. Tambahkan nama orang yang kamu suka
                           2. Hapus atau ganti nama orang yang kamu suka
                           3. Tampilkan semua orang yang kamu suka""");
        System.out.println("Kalau kamu tidak mempunyai orang yang kamu suka ketik 0 !");
        Scanner scan = new Scanner(System.in);
        String menu = scan.nextLine(); 
        
        if(menu.equals("1")){ 
            System.out.print("Masukkan nama orang yang kamu suka: ");
            Scanner scan2 = new Scanner(System.in);
            String data = scan2.nextLine(); 
            
            census.add(data); 
            System.out.println("\nNama orang yang kamu suka sudah dimasukkan!\n");
        }
        else if(menu.equals("2")){
        Scanner scan2 = new Scanner(System.in);
            System.out.print("Ketik 1 untuk Menghapus atau 2 untuk Mengubah : ");
            String pil = scan2.nextLine(); 
            int x = census.size();
            if(census.isEmpty()){
            if(pil.equals("1")){
                System.out.println("Pilihlah nama orang yang ingin kamu hapus : \n"+ census);
                Scanner scan3 = new Scanner(System.in);
                String data = scan3.nextLine();
                census.remove(data);
                System.out.println("\n"+data+" Telah di hapus!");
            }
            else if(pil.equals("2")){
                System.out.println("Pilihlah nama orang yang ingin kamu ganti  : \n"+ census);
                Scanner scan3 = new Scanner(System.in);
                String data = scan3.nextLine();
                
                System.out.print("Masukkan nama orang yang baru kamu suka : ");
                Scanner scan4 = new Scanner(System.in);
                String data2 = scan4.nextLine();
                
                census.set(census.indexOf(data), data2);
                System.out.println("\nNamanya sudah tergantikan!");
            }
            else{
                System.out.println("Error : apakah kamu tidak suka orang?");
            }
        }
            else {
                System.out.println("\nkamu belum masukkin nama orang yang kamu suka\n");
            
            }
        
        }
                        
            
        else if(menu.equals("3")){
            int o = census.size();
            if(o >= 1){
                System.out.println("Inilah daftar nama orang yang kamu suka : ");
            for(int x = 0; x < census.size(); x++){ 
                System.out.println("[" + (x+1 )+ "] " + census.get(x)); 
            }
            System.out.println("\nTekan ENTER untuk melanjutkkannya ! \n");
            Scanner scan3 = new Scanner(System.in);
            String data = scan3.nextLine();
            }
            else {
                System.out.println("\nkamu belum masukkin nama orang yang kamu suka\n");
            
            }
             
        }
        else if(menu.equals("0")){
            System.out.println("Kamu yakin gak suka siapa-siapa ? (y/n)"); 
            Scanner scan3 = new Scanner(System.in);
            String exit = scan3.nextLine(); 
            if (exit.endsWith("y")||exit.endsWith("Y")||exit.endsWith("yakin")||exit.endsWith("Yakin")||exit.endsWith("bener yakin")) {
                System.out.println("Tekan ENTER jika kamu benar-benar gak suka siapa-siapa!");
                Scanner scan4 = new Scanner(System.in);
                String exit2 = scan4.nextLine();
                if(exit2.equals("")){
                    ulang = false;
                }
                else{
                    System.out.println("\n Yeee, akhirnya kamu sadar suka sama dia kan :)"); 
                }
            }
            else{
            System.out.println("\n Yeee, akhirnya kamu sadar suka sama dia kan :)"); 
            }
        }
        else{ 
            System.out.println("Error : apakah kamu tidak suka orang?");
        }
    }
        
       
    }
    }


    

    

