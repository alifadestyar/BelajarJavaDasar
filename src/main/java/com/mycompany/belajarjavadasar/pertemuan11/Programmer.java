/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan11;

/**
 *
 * @author User
 */
public class Programmer extends Pegawai {
    private double bonus;
    
    public Programmer(String nama, double gajiPokok, double bonus){
        super(nama, gajiPokok);
        this.bonus = bonus;
    }
    @Override 
    public void tampilInfo(){
        System.out.println("=== Data Programmer ===");
        System.out.println("Nama       :     " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println ("Bonus     : " + bonus);
    }
    
}
