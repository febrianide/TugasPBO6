/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasmodul_6;

/**
 *
 * @author Lenovo
 */
public class Produk {
    String nama;
    int harga;
    int diskon;
    
    public Produk(String nama, int harga, int diskon){
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }
    public double hd(){
        return 0;    
    }
    public double sd(){
        return harga - hd();
    }
    public String getnama(){
        return nama;
    }
    public int getharga(){
        return harga;
    }
    public int getdiskon(){
        return diskon;
    }

   
    
}
