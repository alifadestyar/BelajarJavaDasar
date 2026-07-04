/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan9;

/**
 *
 * @author User
 */
public class RunMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("Alifa Destya R", "2441015", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Fitrah Adriansyah", "2441011", 3.5);
        
        mhs1.tampilInfo();
        mhs2.tampilInfo();
        
        System.out.println("IPK " + mhs1.nama + " adalah " + mhs1.ipk);
        
        mhs1.belajar();
        mhs2.belajar();
    }
}
