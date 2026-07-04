/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan5;

/**
 *
 * @author User
 */
public class NestedLoop {
    public static void main(String[] args){
        int tinggi = 5;
        
        for (int i=1; i<= tinggi; i++){ //loop Baris
            for (int j=1; j<=i; j++){ //loop kolom
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
