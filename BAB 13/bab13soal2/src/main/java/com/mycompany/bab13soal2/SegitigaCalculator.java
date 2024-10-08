package com.mycompany.trianglecalculator;

/**
 * Kelas ini menyediakan metode untuk menghitung luas segitiga.
 */
public class TriangleCalculator {

    /**
     * Menghitung luas segitiga dengan alas dan tinggi yang diberikan.
     * @param alas Alas segitiga
     * @param tinggi Tinggi segitiga
     * @return Luas segitiga
     */
    double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    /**
     * Metode ini adalah overload dari metode hitungLuas dan akan menghitung luas dengan parameter yang sama.
     * @param alas Alas segitiga
     * @param tinggi Tinggi segitiga
     * @param luas Parameter tambahan yang tidak digunakan
     * @return Luas segitiga
     */
    double hitungLuas(double alas, double tinggi, double luas) {
        return (alas * tinggi) / 2;
    }
}
