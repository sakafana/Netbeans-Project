/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modifier;

/**
 *
 * @author safanadika
 */
public class formula {
    
    public int panjang;
    public int lebar;
    private int luas;
    private int keliling;
    
    private void hitungluas(){
    
        this.luas = this.panjang * this.lebar;
    
    }
    
    private void hitungkeliling(){
    
        this.keliling= 2 * (this.panjang+this.lebar);

    }
    
    public void output(){
        
        this.hitungkeliling();
        this.hitungluas();
        
        System.out.println("Luas persegi panjang: "+this.luas);
        System.out.println("Keliling persegi panjang: "+this.keliling);
    
    }
}
