package com.mycompany.datapegawai;

/**
 * Kelas ini merepresentasikan seorang pegawai dengan tambahan bonus dan metode untuk menghitung gaji total.
 */
class SystemAnalyst extends Pegawai {
    int bonus = 1000000;

    // Metode untuk menghitung total gaji dengan tambahan bonus
    public float hitungGajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }

    public static void main(String[] args) {
        SystemAnalyst sa = new SystemAnalyst(); 
        
        // Menampilkan informasi terkait tunjangan makan, transport, dan gaji
        System.out.println("Tunjangan Makan: " + sa.tunjanganMakan);
        System.out.println("Transport: " + sa.transport);
        System.out.println("Gaji Total: " + sa.hitungGajiTotal());
        System.out.println("Gaji System Analyst: " + sa.gaji);
        System.out.println("Bonus System Analyst: " + sa.bonus);
    }
}
