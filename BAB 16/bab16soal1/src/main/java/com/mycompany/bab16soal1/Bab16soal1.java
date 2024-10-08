package com.mycompany.bab16soal1;

import kalkulator.Penjumlahan;
import kalkulator.Pengurangan;
import kalkulator.Perkalian;
import kalkulator.Pembagian;

/**
 * Main class to perform arithmetic operations and display results.
 */
public class Bab16soal1 {

    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        Penjumlahan penjumlahan = new Penjumlahan(a, b);
        Pengurangan pengurangan = new Pengurangan(a, b);
        Perkalian perkalian = new Perkalian(a, b);
        Pembagian pembagian = new Pembagian(a, b);

        // Displaying results
        System.out.println("Hasil Penjumlahan (9.5 + 2.5): " + penjumlahan.hitung());
        System.out.println("Hasil Pengurangan (9.5 - 2.5): " + pengurangan.hitung());
        System.out.println("Hasil Perkalian (9.5 * 2.5): " + perkalian.hitung());
        System.out.println("Hasil Pembagian (9.5 / 2.5): " + pembagian.hitung());
    }
}
