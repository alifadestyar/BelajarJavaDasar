/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan11;

/**
 *
 * @author User
 */
public class Manajer extends Pegawai {
    private double tunjangan;
    
    public Manajer(String nama, double gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
//    public void tampilInfo(){
//        super.tampilInfo();
//        System.out.println("Tunjnagan : Rp. " + tunjangan);
//        System.out.println("Total     : Rp. " + (gajiPokok + tunjangan));
//    }
    @Override
    public void tampilInfo(){
        System.out.println("--- Data Manajer ---");
        System.out.println("Nama       : " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Total      : " + (gajiPokok + tunjangan));
    }
}
