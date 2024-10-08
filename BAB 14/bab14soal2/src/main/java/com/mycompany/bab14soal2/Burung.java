package com.mycompany.animalhierarchy;

/**
 * Kelas yang merepresentasikan burung dan mengimplementasikan metode suara.
 */
public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Suara burung mencicit");
    }
}
