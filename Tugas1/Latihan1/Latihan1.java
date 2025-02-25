package Tugas1.Latihan1;
public class Latihan1 { 
    public static void main(String[] args) {

        int[] bilanganGenap = new int[10];
        int jumlah = 0;

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }

        // Menampilkan array
        System.out.println("Isi array:");
        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }

        System.out.println("\nJumlah semua elemen: " + jumlah);
    }
}