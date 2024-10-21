/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmodul_6;

/**
 *
 * @author Lenovo
 */
public class Mainproduk {

    public static void main(String[] args) {
        Produk baru1 = new Buku("Mygirls", 190000, 30);
        Produk baru2 = new Elektronik("Despenser", 500000,25);
        Produk baru3 = new Pakaian("Jeans", 500000, 50);
        
        System.out.println("KERANJANG BELANJA");
        KeranjangBelanja ku = new KeranjangBelanja();
        ku.tp(baru1);
        ku.tp(baru2);
        ku.tp(baru3);
        
        ku.ip();
        
        double totalharga = ku.totalharga();
        System.out.println("\nTotal Harga Setelah Diskon : Rp" + totalharga);     
    }
}
