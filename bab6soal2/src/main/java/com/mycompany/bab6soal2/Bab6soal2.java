/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal2;

/**
 *
 * @author lled
 */
import java.util.Scanner;
public class Bab6soal2 {

    public static void main(String[] args) {
        //membuat objek scanner untuk scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("NIM ? : ");
        String nim = scanner.nextLine();
        
        System.out.println("NAMA ? : ");
        String nama = scanner.nextLine();
        
        System.out.println("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        //meentukan grade dan keterangan berdasarkan nilai
        String grade;
        String keterangan;
        
        if (nilai< 50){
            grade ="Tidak Lulus";
            keterangan ="Tidak Lulus";
        } else if (nilai >=50 && nilai < 60){
            grade = "D";
            keterangan ="Lulus";
        } else if (nilai >=60 && nilai < 70){
            grade = "C";
            keterangan ="Lulus";
        } else if (nilai >=70 && nilai < 80){
            grade = "B";
            keterangan ="Lulus";
        } else if (nilai >=80 && nilai < 90){
            grade = "A";
            keterangan ="Lulus";
        } else if (nilai >=90 && nilai < 100){
            grade = "A+";
            keterangan ="Lulus";
        } else {
            grade = "Data nilai salah";
            keterangan = "Data nilai tidak valid";
        }
        
        //menutup scanner
        scanner.close();
        
        //menampilkan hasil
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
