package com.mycompany.trianglecalculator;

/**
 * Program utama untuk menghitung luas segitiga dengan menggunakan metode dari kelas SegitigaCalculator.
 */
public class TriangleCalculatorTest {

    public static void main(String[] args) {
        SegitigaCalculator calculator = new SegitigaCalculator();
        
        // Menghitung luas segitiga dengan alas 10 dan tinggi 15
        double luas = calculator.hitungLuas(10, 15);
        System.out.println("Luas segitiga dengan alas 10 dan tinggi 15 adalah: " + luas);
    }
}
