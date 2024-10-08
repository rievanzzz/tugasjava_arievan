public class Aritmatika3Main {
  public static void main(String[] args) {
      aritmatika3 aritmatikaku = new aritmatika3();
      int bilangan1 = 10, bilangan2 = 2;

      // Pengurangan
      aritmatikaku.setKurang(bilangan1, bilangan2);
      System.out.println("Bilangan 1 = " + bilangan1);
      System.out.println("Bilangan 2 = " + bilangan2);
      System.out.println("Hasil Pengurangan: " + aritmatikaku.getKurang());

      // Perkalian
      aritmatikaku.setKali(bilangan1, bilangan2);
      System.out.println("Hasil Perkalian: " + aritmatikaku.getKali());

      // Pembagian
      aritmatikaku.setBagi(bilangan1, bilangan2);
      System.out.println("Hasil Pembagian: " + aritmatikaku.getBagi());

      // Pangkat
      aritmatikaku.setPangkat(bilangan1, bilangan2);
      System.out.println("Hasil Pangkat: " + aritmatikaku.getPangkat());
  }
}
