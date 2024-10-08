package kalkulator;

/**
 * Abstract class representing arithmetic operations.
 */
public abstract class OperasiAritmatika {
    protected double a;
    protected double b;

    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method to be implemented by subclasses
    protected abstract double hitung();
}
