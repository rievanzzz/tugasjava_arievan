package com.mycompany.datakaryawan;

import java.util.Scanner;

/**
 * Program untuk mengelola data karyawan dan menentukan jabatan serta gaji pokok berdasarkan golongan.
 */
public class DataKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID Karyawan: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Golongan: ");
        int golongan = input.nextInt();

        String jabatan = "";
        int gajiPokok = 0;

        switch (golongan) {
            case 1:
                jabatan = "Asisten Staff";
                gajiPokok = 3000000;
                break;
            case 2:
                jabatan = "Staff";
                gajiPokok = 3500000;
                break;
            case 3:
                jabatan = "Supervisor";
                gajiPokok = 4000000;
                break;
            case 4:
                jabatan = "Asisten Manager";
                gajiPokok = 5000000;
                break;
            case 5:
                jabatan = "Manager";
                gajiPokok = 6000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        Karyawan karyawan = new Karyawan();
        karyawan.setKaryawan(id, nama, String.valueOf(golongan), jabatan, gajiPokok);
        karyawan.getKaryawan();
    }
}
