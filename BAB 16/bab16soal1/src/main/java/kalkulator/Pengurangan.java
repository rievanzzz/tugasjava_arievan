package kalkulator;

/**
 * Class to perform subtraction operation.
 */
public class Pengurangan extends OperasiAritmatika {

    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        return a - b;
    }
}
