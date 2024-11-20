/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_constructor;

/**
 *
 * @author safanadika
 */
public class myFormula {
    public int p;
    public int l;
    private int area;
    private int keli;
    
    myFormula(int p, int l){
    
        this.p=p;
        this.l=l;
    
    
    
    }
    
    public void hitunglua(){
    
    this.area = this.p*this.l;
    
        System.out.println(this.area);
        
    }
    
    public void hitungkeliling(){
    
    this.keli = 2*(this.p+this.l);
    
        System.out.println(this.keli);
        
    }
    
}
