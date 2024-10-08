package Aritmatika;

/**
 * Kelas ini mengimplementasikan operasi pengurangan.
 * Kelas ini mewarisi dari kelas OperasiAritmatika dan mengimplementasikan metode hitung() untuk melakukan pengurangan.
 */
public class Pengurangan extends OperasiAritmatika {

    // Konstruktor untuk menginisialisasi nilai a dan b
    public Pengurangan(double a, double b) {
        super(a, b);
    }

    // Implementasi metode hitung() untuk melakukan pengurangan a dengan b
    @Override
    protected double hitung() {
        return a - b;
    }
    
    // Metode ini untuk mendapatkan hasil pengurangan
    public double getHasil() {
        return hitung();
    }
}
