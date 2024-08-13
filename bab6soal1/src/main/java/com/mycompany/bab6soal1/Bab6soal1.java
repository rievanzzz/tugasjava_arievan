/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal1;

/**
 *
 * @author lled
 */
import java.util.Scanner;
public class Bab6soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input data dari pengguna
        System.out.print("NIM ? : ");
        String nim =scanner.nextLine();
        
        System.out.print("NAMA ? : ");
        String nama =scanner.nextLine();
        
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        //menentukan grade berdasarkan nilai
        String grade;
        if (nilai < 50) {
            grade = "Tidak Lulus";
        } else if (nilai >= 50 && nilai <60){
            grade = "D";
        } else if (nilai >= 60 && nilai <70){
            grade = "C";
        } else if (nilai >= 70 && nilai <80){
            grade = "B";
        } else if (nilai >= 80 && nilai <90){
            grade = "A";
        } else if (nilai >= 90 && nilai <100){
            grade = "A+";
        } else {
            grade = "Data nilai salah";
        }
        
        //menutup scanner
        scanner.close();
        
        //menampilkan hasil
        System.out.println("Grade: " + grade);

    }
}
