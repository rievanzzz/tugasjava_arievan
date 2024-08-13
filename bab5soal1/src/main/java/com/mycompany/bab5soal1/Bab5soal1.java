/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal1;

/**
 *
 * @author lled
 */
import java.util.Scanner;
public class Bab5soal1 {

    public static void main(String[] args) {
        //membuat objek scanner untuk input
        Scanner scanner = new Scanner(System.in);
        //Menginput data karyawan
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        
        System.out.println("Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();
        
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        
        System.out.print("Usia: ");
        int usia = scanner.nextInt();
        
        System.out.print("Gaji: ");
        int gaji = scanner.nextInt();
        
        //menutup scanner
        scanner.close();
        
        //menampilkan data karyawan
        
        System.out.println("\nData Karyawan:");
        System.out.println("Nama Karyawan:" + namaKaryawan);
        System.out.println("Alamat:" + alamat);
        System.out.println("Usia:" + usia);
        System.out.println("Gaji: Rp " + gaji);
        
        
        
    }
}
