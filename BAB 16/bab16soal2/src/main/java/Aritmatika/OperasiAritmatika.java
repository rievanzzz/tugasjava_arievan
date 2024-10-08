package Aritmatika;

/**
 * Kelas ini adalah kelas abstrak untuk operasi aritmatika.
 * Di sini, kita mendeklarasikan dua variabel double yaitu a dan b yang akan digunakan dalam operasi aritmatika.
 * Kelas ini juga memiliki metode abstrak 'hitung()' yang harus diimplementasikan oleh kelas turunannya.
 */
public abstract class OperasiAritmatika {
    protected double a;
    protected double b;

    // Konstruktor untuk menginisialisasi nilai a dan b
    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas yang mewarisi kelas ini
    protected abstract double hitung();
}
