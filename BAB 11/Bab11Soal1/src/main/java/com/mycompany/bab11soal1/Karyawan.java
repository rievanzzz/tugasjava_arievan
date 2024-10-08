package com.mycompany.datakaryawan;

/**
 * Class ini merepresentasikan data karyawan.
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
}
