package com.mycompany.bab18soal1;

/**
 * Kelas ini digunakan untuk menunjukkan bagaimana cara melempar dan menangkap exception
 * ketika memeriksa apakah seseorang memenuhi syarat untuk voting.
 */
public class Bab18soal1 {

    /**
     * Metode ini memeriksa apakah seseorang memenuhi syarat untuk voting berdasarkan usia.
     * @param age usia orang yang ingin diperiksa
     */
    public static void validate(int age) {
        // Jika usia kurang dari 17, lemparkan exception
        if (age < 17) {
            throw new ArithmeticException("Orang ini belum memenuhi syarat untuk vote!");  // Ini adalah contoh melempar exception
        } else {
            // Jika usia sudah 17 atau lebih, beri tahu bahwa orang tersebut memenuhi syarat
            System.out.println("Orang ini sudah memenuhi syarat untuk vote!");
        }
    }

    public static void main(String[] args) {
        try {
            // Memanggil metode validate dengan usia 13
            validate(13);
        } catch (ArithmeticException e) {
            // Menangkap dan menampilkan pesan exception jika terjadi
            System.out.println(e.getMessage());  // Ini adalah contoh blok try-catch (Menangkap Exception)
        }
        // Menampilkan sisa kode yang tetap berjalan meskipun ada exception
        System.out.println("Rest of the code...");
    }
}

/* 
Throw (Melempar Exception):
Digunakan untuk secara langsung melemparkan exception jika kondisi tertentu tidak terpenuhi, sehingga exception tersebut dapat ditangani oleh bagian lain dari program.

Blok try-catch (Menangkap Exception):
Digunakan untuk menangkap exception yang mungkin terjadi selama eksekusi program, sehingga program dapat menangani exception tersebut dan tetap berjalan dengan baik setelahnya.
 */
