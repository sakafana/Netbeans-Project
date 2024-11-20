/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hl.bingung;

/**
 *
 * @author safanadika
 */
public class HLBingung {

    
    public static void main(String[] args) {
        
        String p = printString("wyo");
    }
    public void printString(String s)
    {
        if (s.length() < 6)
        {
        printString(s.substring(1));
            System.out.println(s.substring(0,1));
        }
    }
}
