package javaapplication30;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaApplication30 {

    public static void main(String[] args) {
    
    ArrayList census = new ArrayList(); //membuat arraylist
    
    boolean loop = true; //kondisi perulangan
    while(loop == true){ //mulai perulangan
        //tampilan awal
        System.out.println("=====WELCOME TO CENSUS APPS=====");
        System.out.println("1. Add Data\n2. Delete or Change Data\n3. Show All Data");
        System.out.println("Please make your choice !\nOr select 0 to EXIT !");
        Scanner scan = new Scanner(System.in);
        String menu = scan.nextLine(); //menentukan menu
        
        if(menu.equals("1")){ //menu add data
            System.out.print("Please enter your data : ");
            Scanner scan2 = new Scanner(System.in);
            String data = scan2.nextLine(); //menerima input data untuk di add
            
            census.add(data); //menambahkan input ke arraylist
            System.out.println("\nYour data has been added!");
        }
        else if(menu.equals("2")){//menu delete/change data
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Select [1] to DELETE or [2] to EDIT : ");
            String pil = scan2.nextLine(); //menerima pilihan
            
            if(pil.equals("1")){//menu delete
                System.out.println("Please select the data you want to remove : \n"+ census);
                Scanner scan3 = new Scanner(System.in);
                String data = scan3.nextLine();//menerima input data untuk di remove
            
                census.remove(data);//menghapus data yang sudah di input dari arraylist
                System.out.println("\nYour data has been removed!");
            }
            else if(pil.equals("2")){//menu change
                System.out.println("Please select the data you want to edit : \n"+ census);
                Scanner scan3 = new Scanner(System.in);
                String data = scan3.nextLine();//menerima input data untuk di edit
                
                System.out.print("Please input new data : ");
                Scanner scan4 = new Scanner(System.in);
                String data2 = scan4.nextLine();//menerima input data baru
                
                census.set(census.indexOf(data), data2);//mereplace data lama berdasarkan nomor index data lama, dengan data baru
                System.out.println("\nYour data has been edited!");
            }
            else{//jika pilihan tidak valid
                System.out.println("INVALID INPUT ! Please Try Again !");
            }
        }
        else if(menu.equals("3")){//menu show data
            System.out.println("The existing data is : ");
            for(int x = 0; x < census.size(); x++){ //melakukan looping sebanyak jumlah data dalam arraylist
                System.out.println("[" + (x+1 )+ "] " + census.get(x)); //menampilkan arraylist per index
            }
            System.out.println("\nPress ENTER to continue ! \n");
            Scanner scan2 = new Scanner(System.in);
            String data = scan2.nextLine(); //agar system terjeda setelah menampilkan data
        }
        else if(menu.equals("0")){//menu exit
            System.out.println("Are you sure ? (y/n)"); //memastikan apakah ingin exit 1
            Scanner scan2 = new Scanner(System.in);
            String exit = scan2.nextLine(); //menerima input apakah ingin exit atau tidak
            if (exit.endsWith("y")||exit.endsWith("Y")||exit.endsWith("yes")||exit.endsWith("YES")||exit.endsWith("Yes")) {//jika memilih ingin exit
                System.out.println("Press ENTER to EXIT!");//memastikan apakah ingin exit 2
                Scanner scan3 = new Scanner(System.in);
                String exit2 = scan3.nextLine();
                if(exit2.equals("")){//jika sudah yakin benar-benar ingin exit
                    loop = false;//merubah kondisi looping agar berhenti
                }
                else{
                    System.out.println("\n Welcome Back :)"); //jika tidak jadi exit 1
                }
            }
            else{
            System.out.println("\n Welcome Back :)"); //jika tidak jadi exit 2
            }
        }
        else{ //jika inputan tidak valid
            System.out.println("INVALID INPUT ! Please Try Again !");
        }
    }
        
       
        
    }
    
}
