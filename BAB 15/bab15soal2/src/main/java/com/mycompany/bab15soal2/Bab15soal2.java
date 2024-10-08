package com.mycompany.calculatorapp;

import kalkulator.Division;
import kalkulator.Subtraction;
import kalkulator.Multiplication;

/**
 * Program utama untuk menguji operasi kalkulasi.
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Subtraction subtract = new Subtraction();
        Division divide = new Division();  
        Multiplication multiply = new Multiplication();  

        // Operasi kalkulasi
        int resultSubtraction = subtract.subtract(10, 5);
        int resultDivision = divide.divide(10, 2);  
        int resultMultiplication = multiply.multiply(10, 2);  

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan (10 - 5): " + resultSubtraction);
        System.out.println("Hasil Pembagian (10 / 2): " + resultDivision);
        System.out.println("Hasil Perkalian (10 * 2): " + resultMultiplication);
    }
}
