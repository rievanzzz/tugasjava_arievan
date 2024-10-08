package Aritmatika;

/**
 * Kelas ini mengimplementasikan operasi penjumlahan.
 * Kelas ini mewarisi dari kelas OperasiAritmatika dan mengimplementasikan metode hitung() untuk melakukan penjumlahan.
 */
public class Penjumlahan extends OperasiAritmatika {

    // Konstruktor untuk menginisialisasi nilai a dan b
    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    // Implementasi metode hitung() untuk melakukan penjumlahan a dengan b
    @Override
    protected double hitung() {
        return a + b;
    }
    
    // Metode ini untuk mendapatkan hasil penjumlahan
    public double getHasil() {
        return hitung();
    }
}
