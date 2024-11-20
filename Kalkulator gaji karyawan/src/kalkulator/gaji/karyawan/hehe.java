/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator.gaji.karyawan;

public class hehe {
    
    public String kodka, namka, gol, stat;
    public int juna;
    public float gapok;
    
    public void setGajiPokok()
    {
        if (this.gol == "IIIa") this.gapok = 1200000;
        else if (this.gol == "IIIb") this.gapok = 1500000;
        else if (this.gol == "IIIc") this.gapok = 1700000;
        else if (this.gol == "III") this.gapok = 1900000;
    
    }
    
    public float tuis()
    {
        float tuistri=0;
        if (this.stat=="MENIKAH") tuistri = (float) (this.gapok * 0.01);
        else if (this.stat=="BELUM MENIKAH") tuistri = (float) 0;
    
    
        return tuistri;
    }
    
    public float tuna()
    {
        return (float) (this.juna * this.gapok * 0.05);
    
    }
    
    public float toja()
    {
        return this.tuna()+this.tuis();
       
    }
    
    public float gator()
    {
        return this.gapok + this.toja();
    
    }
    
    public float pot()
    {
        return (float)(0.15 * this.gator());
       
    
    }
    
    public float gasih()
    {
    return this.gator() - this.pot();
    }
}
