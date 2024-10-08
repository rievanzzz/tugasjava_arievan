package com.mycompany.animalhierarchy;

/**
 * Program utama untuk menguji implementasi kelas Burung.
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal bird = new Bird();
        
        // Memanggil metode suara pada objek Burung
        bird.makeSound();
    }
}
