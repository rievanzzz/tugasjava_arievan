package com.mycompany.animalhierarchy;

/**
 * Kelas abstrak untuk hewan yang mendefinisikan metode abstrak dan konkrit.
 */
public abstract class Animal {
    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void makeSound();
    
    // Metode konkrit yang dapat digunakan oleh kelas turunan
    public void showMessage() {
        System.out.println("Ini adalah metode konkrit dari kelas induk.");
    }
}
