package com.mycompany.calculator;

/**
 * Kelas ini menyediakan metode untuk operasi kalkulasi dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class SimpleCalculator {

    // Metode untuk menjumlahkan dua bilangan
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode untuk menjumlahkan tiga bilangan
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode untuk mengurangi bilangan kedua dari bilangan pertama
    int kurang(int a, int b) {
        return a - b;
    }

    // Metode untuk mengalikan dua bilangan
    int kali(int a, int b) {
        return a * b;
    }

    // Metode untuk membagi bilangan pertama dengan bilangan kedua
    int bagi(int a, int b) {
        return a / b;
    }
}
