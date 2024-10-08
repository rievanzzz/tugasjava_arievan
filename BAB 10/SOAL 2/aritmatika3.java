public class aritmatika3 {
    int angka;

    // Method (mutator) untuk penjumlahan
    void setTambah(int bil1, int bil2) {
        angka = bil1 + bil2;
    }

    // Method (accessor) untuk penjumlahan
    int getTambah() {
        return angka;
    }

    // Method (mutator) untuk pengurangan
    void setKurang(int bil1, int bil2) {
        angka = bil1 - bil2;
    }

    // Method (accessor) untuk pengurangan
    int getKurang() {
        return angka;
    }

    // Method (mutator) untuk perkalian
    void setKali(int bil1, int bil2) {
        angka = bil1 * bil2;
    }

    // Method (accessor) untuk perkalian
    int getKali() {
        return angka;
    }

    // Method (mutator) untuk pembagian
    void setBagi(int bil1, int bil2) {
        if (bil2 != 0) {
            angka = bil1 / bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
            angka = 0; // atau bisa mengatur error handling yang lebih baik
        }
    }

    // Method (accessor) untuk pembagian
    int getBagi() {
        return angka;
    }

    // Method (mutator) untuk pangkat
    void setPangkat(int bil1, int bil2) {
        angka = (int) Math.pow(bil1, bil2);
    }

    // Method (accessor) untuk pangkat
    int getPangkat() {
        return angka;
    }
}
