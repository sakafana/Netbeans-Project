/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author safanadika
 */
public class KeretaApi extends kendaraan{
public int jmlGerbong;
public String tipeKA;

public KeretaApi(String x, String y){

    super(x);
    this.tipeKA=y;

}

public void tampilJmlGerbong(){

     System.out.println(this.nama+" jumlah gerbongnya "+this.jmlGerbong);

}

public void tampiltipeKA(){

    System.out.println(this.nama+" adalah jenis kereta "+this.tipeKA);
}
    
}
