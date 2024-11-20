/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suhu;

/**
 *
 * @author safanadika
 */
public class konversiSuhu {
    public float Celcius;
    private float Hasil;
    
    public float cToR(){
    
       this.Hasil=this.Celcius*4/5;
        return Hasil;
    } 
    
   public float cToK(){
       
       this.Hasil = this.Celcius + 273;
        return Hasil;
   }
   
   public float cToF(){
   
       this.Hasil = this.Celcius*9/5+32;
        return Hasil;
   }
   
   public void tampilkanHasil(){
   
       System.out.println(this.Celcius+" Celcius = " + this.cToR()+" Reamur");
       System.out.println(this.Celcius+" Celcius = " + this.cToK()+" Kelvin");
       System.out.println(this.Celcius+" Celcius = " + this.cToF()+" Farenheit"+"\n");
   }
}
