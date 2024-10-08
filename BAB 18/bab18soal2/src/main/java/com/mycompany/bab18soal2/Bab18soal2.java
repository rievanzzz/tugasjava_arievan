package com.mycompany.bab18soal2;

/**
 * Kelas ini menunjukkan bagaimana blok `finally` selalu dieksekusi
 * setelah blok `try` dan `catch`, terlepas dari apakah terjadi exception atau tidak.
 */
public class Bab18soal2 {

    public static void main(String[] args) {
        try {
            // Kode di bawah ini tidak akan melemparkan exception
            float data = 1500 / 15;  // Pembagian yang sah, hasilnya adalah 100.0
            System.out.println(data);  // Menampilkan hasil pembagian
        } catch (NullPointerException e) {
            // Blok ini akan menangkap exception jika terjadi NullPointerException
            // Namun dalam kasus ini, tidak ada NullPointerException yang terjadi
            System.out.println(e);  // Menampilkan pesan exception jika ada
        } finally {
            // Blok ini selalu akan dieksekusi, baik ada exception atau tidak
            System.out.println("Blok finally akan selalu dieksekusi");  // Menampilkan pesan yang menunjukkan blok finally telah dieksekusi
        }
    }
}
