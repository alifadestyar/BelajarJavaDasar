/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan8;

/**
 *
 * @author User
 */
public class DemoMethodReturn {
    static int hitungLuas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    static boolean isGenap (int angka){
    if (angka % 2 ==0){
        return true;
    }else{
        return false;    
    }
}
    public static void main(String[] args){
        int luas = hitungLuas(10,5);
        System.out.println("Luas Persegi Panjang: " + luas);
        
        System.out.println("Luas Lain: " + hitungLuas(7,3));
        
        int nilai = 10;
        if (isGenap(nilai)){
            System.out.println(nilai + " adalah Genap");
        }else{
            System.out.println(nilai + " adalah ganjil");
        }    
    }
}
