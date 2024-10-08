package com.mycompany.animalhierarchy;

/**
 * Kelas yang merepresentasikan kucing dan mengimplementasikan metode suara.
 */
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Kucing bersuara: Meow meow");
    }
}
