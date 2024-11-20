/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example72d;

/**
 *
 * @author safanadika
 */
public class Example72D {

    
    public static void main(String[] args) {
        
        
         int [][] scores = { {98, 68, 65, 73, 67}, 
                            {77, 77, 88, 78, 90}, 
                            {53, 65, 74, 85, 72}, 
                            {77, 77, 68, 78, 91 }, 
                            {88, 86, 90, 56, 81} };
        int student = 0;
        int exam = 0;
        
        for (int i = 0; i < 5; ++i) {
            System.out.println( (i+1) + " "+"Student");
        
       
        for(int j = 0; j <= 4; ++j) {
            if (scores[i][j]%10==5){
                
                System.out.println("------"+"Exam"+ " " +(j+1) +" "+ scores[i][j]);
            }
           
       
        }
        
    }
    
    }
    
}
