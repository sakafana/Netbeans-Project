/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example62d;

/**
 *
 * @author safanadika
 */
public class Example62D {
    
    public static void main(String[] args) {
        
        int [][] scores = { {98, 68, 65, 73, 67}, 
                            {77, 77, 88, 78, 90}, 
                            {53, 63, 74, 85, 72}, 
                            {77, 77, 68, 78, 91 }, 
                            {88, 86, 90, 56, 81} };
        //int student = 0;
        //int exam = 0;
        
        for (int student = 0; student < 5; ++student) {
            System.out.println( (student+1) + " "+"Student");
        
       
        for(int j = 0; j <= 4; ++j) {
           System.out.println("------"+"Exam"+ " " +(j+1) +" "+ scores[student][j]);
       
        }
        
    }
    
}
}