package kalkulator;

/**
 * Class to perform addition operation.
 */
public class Penjumlahan extends OperasiAritmatika {

    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        return a + b;
    }
}
