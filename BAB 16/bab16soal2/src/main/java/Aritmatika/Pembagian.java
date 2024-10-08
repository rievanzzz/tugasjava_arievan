package Aritmatika;

/**
 * Kelas ini mengimplementasikan operasi pembagian.
 * Kelas ini mewarisi dari kelas OperasiAritmatika dan mengimplementasikan metode hitung() untuk melakukan pembagian.
 */
public class Pembagian extends OperasiAritmatika {

    // Konstruktor untuk menginisialisasi nilai a dan b
    public Pembagian(double a, double b) {
        super(a, b);
    }

    // Implementasi metode hitung() untuk melakukan pembagian a dengan b
    @Override
    protected double hitung() {
        return a / b;
    }
    
    // Metode ini untuk mendapatkan hasil pembagian
    public double getHasil() {
        return hitung();
    }
}
