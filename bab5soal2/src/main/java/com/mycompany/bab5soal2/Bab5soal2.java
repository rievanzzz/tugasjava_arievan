/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal2;

/**
 *
 * @author lled
 */
import java.util.Scanner;
public class Bab5soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //menginput alas luas segitiga
        System.out.println("Masukan nilai Alas:");
        double alas = scanner.nextDouble();
        //menginput tinggi luas segitiga
        System.out.println("Masukan nilai Tinggi:");
        double tinggi = scanner.nextDouble();
        //menghitung luas segitiga
        double luas = (alas * tinggi )/2;
        
        //menutup scanner
        scanner.close();
        //menampilkan hasil
        System.out.println("Luas Segitiga: " + luas);
    }
}
