/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasmodul_6;

/**
 *
 * @author Lenovo
 */
public class Buku extends Produk {
    
    public Buku(String nama, int harga, int diskon) {
        super(nama, harga, diskon);
    }
    @Override
    public double hd(){
        return harga * diskon / 100;
    }
    
}
