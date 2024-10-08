package com.mycompany.bab16soal2;

import Aritmatika.Penjumlahan;
import Aritmatika.Pengurangan;
import Aritmatika.Perkalian;
import Aritmatika.Pembagian;

/**
 * Kelas ini adalah kelas utama untuk melakukan berbagai operasi aritmatika
 * seperti penjumlahan, pengurangan, perkalian, dan pembagian dengan menggunakan
 * kelas-kelas yang sudah didefinisikan sebelumnya.
 */
public class Bab16soal2 {

    public static void main(String[] args) {
        // Mendefinisikan dua variabel double untuk digunakan dalam operasi
        double a = 9.5;
        double b = 2.5;

        // Membuat objek untuk setiap jenis operasi aritmatika
        Penjumlahan penjumlahan = new Penjumlahan(a, b);
        Pengurangan pengurangan = new Pengurangan(a, b);
        Perkalian perkalian = new Perkalian(a, b);
        Pembagian pembagian = new Pembagian(a, b);

        // Mengakses metode getHasil() dari setiap objek untuk mendapatkan hasil operasi
        // dan menampilkan hasilnya ke layar
        System.out.println("Hasil Penjumlahan (9.5 + 2.5): " + penjumlahan.getHasil());
        System.out.println("Hasil Pengurangan (9.5 - 2.5): " + pengurangan.getHasil());
        System.out.println("Hasil Perkalian (9.5 * 2.5): " + perkalian.getHasil());
        System.out.println("Hasil Pembagian (9.5 / 2.5): " + pembagian.getHasil());
    }
}
