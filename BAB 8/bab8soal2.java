import java.util.Scanner;

public class bab8soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai awal dan nilai akhir dari keyboard
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();

        // Menampilkan bilangan tahun dari tahun akhir hingga tahun awal
        System.out.println("Tahun dari " + tahunAkhir + " sampai " + tahunAwal + ":");
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }

        scanner.close();
    }
}
