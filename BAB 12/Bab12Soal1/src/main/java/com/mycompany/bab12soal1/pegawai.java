package com.mycompany.datapegawai;

/**
 * Kelas ini merepresentasikan data dasar pegawai dengan gaji, tunjangan makan, dan transport.
 */
public class Pegawai {
    float gaji = 4000000;
    float tunjanganMakan = 400000;
    float transport = 500000;
}

/**
 * Kelas ini merepresentasikan seorang System Analyst yang merupakan turunan dari kelas Pegawai.
 */
class SystemAnalyst extends Pegawai {
    int bonus = 1000000;

    public static void main(String[] args) {
        SystemAnalyst sa = new SystemAnalyst();
        
        // Menampilkan informasi gaji dan bonus untuk System Analyst
        System.out.println("Gaji System Analyst: " + sa.gaji);
        System.out.println("Bonus System Analyst: " + sa.bonus);
    }
}
