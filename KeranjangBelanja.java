/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasmodul_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class KeranjangBelanja {
    List<Produk> produklist;
    
    public KeranjangBelanja(){
        produklist = new ArrayList<>();  
    }
    public void tp(Produk baru){
        produklist.add(baru);
    }
    
    public double totalharga(){
        double total = 0;
        for (Produk baru : produklist ){
            total += baru.hd();
        }
        return total;        
    }
    public void ip(){
        for (Produk baru : produklist){
            System.out.println("\nInformasi Produk");
            System.out.println("Nama Produk :" + baru.getnama());
            System.out.println("Harga awal : Rp" + baru.getharga());
            System.out.println("Diskon : " + baru.getdiskon() + "%");
            System.out.println("Harga Setelah Diskon : Rp" + baru.sd());     
        }
    }
    
}

