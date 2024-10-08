package kalkulator;

/**
 * Class to perform division operation.
 */
public class Pembagian extends OperasiAritmatika {

    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return a / b;
    }
}
