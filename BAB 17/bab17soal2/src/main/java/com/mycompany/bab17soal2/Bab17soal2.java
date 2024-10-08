package com.mycompany.bab17soal2;

/**
 * Kelas ini digunakan untuk menampilkan nama-nama negara beserta ibu kotanya
 * menggunakan array multidimensi.
 */
public class Bab17soal2 {

    public static void main(String[] args) {
        // Membuat array multidimensi yang menyimpan nama negara dan ibu kotanya
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menggunakan loop untuk menampilkan setiap negara dan ibu kotanya
        for (int i = 0; i < negaraIbukota.length; i++) {
            // Menampilkan nama negara dan ibu kotanya
            System.out.println("Ibukota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
        }
    }
}
