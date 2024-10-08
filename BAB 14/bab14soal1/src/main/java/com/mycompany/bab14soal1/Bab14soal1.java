package com.mycompany.animalhierarchy;

/**
 * Program utama untuk menguji kelas hewan dan metode suara mereka.
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal giraffe = new Giraffe();

        cat.makeSound();  
        giraffe.makeSound();  

        cat.showMessage(); 
        giraffe.showMessage(); 
    }
}
