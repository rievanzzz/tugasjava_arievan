package com.mycompany.calculator;

/**
 * Program utama untuk menguji metode kalkulasi sederhana.
 */
public class CalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        
        // Menampilkan hasil operasi matematika
        System.out.println("Hasil Pertambahan: " + calculator.tambah(20, 10));
        System.out.println("Hasil Pengurangan: " + calculator.kurang(10, 20));
        System.out.println("Hasil Perkalian: " + calculator.kali(20, 10));
        System.out.println("Hasil Pembagian: " + calculator.bagi(20, 10));
    }
}
