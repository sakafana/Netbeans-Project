
package ar1;


import java.util.Scanner;


public class AR1 {

    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
       String[] genres= {"Romance","Comedy","Fantasy"};
      
       for(int i=0 ; i < genres.length; i++){
           if (genres[i] == "Romance"){
               System.out.println("Kimi no Nawa");
           } 
           else if (genres[i]== "Comedy") {
               System.out.println("Grand Blue");
           }
           else {
                System.out.println("Tensura");
           }

       }
        
    }
    
}
