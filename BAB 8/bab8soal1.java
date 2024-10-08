import java.util.Scanner;

public class bab8soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai awal dan nilai akhir dari keyboard
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = scanner.nextInt();

        // Menampilkan bilangan dengan pertambahan 5
        System.out.println("Bilangan dengan pertambahan 5 dari " + nilaiAwal + " sampai " + nilaiAkhir + ":");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(i);
        }
    }
}
