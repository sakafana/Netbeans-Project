/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentarray;

/**
 *
 * @author safanadika
 */
public class Studentarray {

    
    public static void main(String[] args) {
        
        Student[] ar = new Student[2];
        
        ar[0] = new Student(163798908, "Satyabrata");
        ar[1] = new Student(137397808, "Omm Prasad");
        
        System.out.println("Student data in student arr 0: ");
        ar[0].display();
        
        System.out.println("Student data in student arr 1: ");
        ar[0].display();
    }

}
class Student{
    
        public int id;
        public String name;
        
        Student(int id, String name){
        
            this.id=id;
            this.name=name;
            
        }
        
        public void display(){
            System.out.println("Student id is: "+id+" and Student name is: "+name);
            System.out.println();
        
        }
    }
