package com.mycompany.bab17soal1;

import java.util.Scanner;


public class Bab17soal1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Masukan jumlah kota : ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); 
        

        String[] kota = new String[jumlahKota];
        

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine(); 
        }
        

        System.out.println("Kota kota yang dimasukkan: ");
        for (String k : kota ) {
            System.out.println(k);
        }
        

        scanner.close();
    }
}
