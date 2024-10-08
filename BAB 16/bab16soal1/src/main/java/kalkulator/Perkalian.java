package kalkulator;

/**
 * Class to perform multiplication operation.
 */
public class Perkalian extends OperasiAritmatika {

    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        return a * b;
    }
}
