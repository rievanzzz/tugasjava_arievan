package Aritmatika;

/**
 * Kelas ini mengimplementasikan operasi perkalian.
 * Kelas ini mewarisi dari kelas OperasiAritmatika dan mengimplementasikan metode hitung() untuk melakukan perkalian.
 */
public class Perkalian extends OperasiAritmatika {

    // Konstruktor untuk menginisialisasi nilai a dan b
    public Perkalian(double a, double b) {
        super(a, b);
    }

    // Implementasi metode hitung() untuk melakukan perkalian a dengan b
    @Override
    protected double hitung() {
        return a * b;
    }

    // Metode ini untuk mendapatkan hasil perkalian
    public double getHasil() {
        return hitung();
    }
}
