/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_constructor;

/**
 *
 * @author safanadika
 */
public class myclass {
    public int attribut1;
    public int attribut2;
    
    myclass(int a,int b){
    this.attribut1=a;
    this.attribut2=b;
    
    }
    myclass(int a){
    this.attribut1=a;
    this.attribut2=0;
    
    }
    
    myclass(){
    this.attribut1=0;
    this.attribut2=0;
    
    }
    
    public void tampilattribut(){
    
        System.out.println("Attribut 1: "+this.attribut1 );
        System.out.println("Attribut 2: "+this.attribut2+"\n" );
    
    
    }
}
