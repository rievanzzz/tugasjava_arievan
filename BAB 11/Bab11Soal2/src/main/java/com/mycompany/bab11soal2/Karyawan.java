package com.mycompany.datakaryawan;

/**
 * Kelas ini mendefinisikan objek karyawan dengan atribut dan metode untuk mengelola data karyawan.
 */
public class Karyawan {
    int id, gajiPokok;
    String nama, jabatan, golongan;

    // Metode untuk mengatur data karyawan
    void setKaryawan(int id, String nama, String golongan, String jabatan, int gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    } 

    // Metode untuk menampilkan data karyawan
    void getKaryawan() {
        System.out.println("ID Karyawan    : " + id);
        System.out.println("Nama Karyawan  : " + nama);
        System.out.println("Golongan       : " + golongan);
        System.out.println("Jabatan        : " + jabatan);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
    }

    // Metode tambahan dengan parameter berbeda (sebagai placeholder, belum diimplementasikan)
    void setKaryawan(int id, String nama, int golongan, String jabatan, int gajiPokok) {
        throw new UnsupportedOperationException("Metode ini belum diimplementasikan.");
    }
}
