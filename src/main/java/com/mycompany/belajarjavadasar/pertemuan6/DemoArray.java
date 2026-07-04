/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan6;

/**
 *
 * @author User
 */
public class DemoArray {
    public static void main(String[] args){
        String[] namaBuah = {"Apel", "Jeruk", "Mangga"};
        
        System.out.println("Nama Buah Pertama : " + namaBuah[0]);
        System.out.println("Nama Buah Kedua   : " + namaBuah[1]);
        System.out.println("Nama Buah Ketiga  : " + namaBuah[2]);
        
        namaBuah[1] = "Nanas";
        System.out.println("Buah Kedua (Setelah diubah): " + namaBuah[1]);
        
        System.out.println("Jumlah Buah       : " + namaBuah.length);
    }
}
