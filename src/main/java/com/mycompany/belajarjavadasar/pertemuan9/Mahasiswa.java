/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan9;

/**
 *
 * @author User
 */
public class Mahasiswa {
    public String  nama;
    public String nim;
    public double ipk;
    
    public Mahasiswa(String nama, String nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    public void tampilInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("IPK  : " + ipk);
    }
    public void belajar(){
        System.out.print(nama + "sedang belajar Java OOP");
    }
}
