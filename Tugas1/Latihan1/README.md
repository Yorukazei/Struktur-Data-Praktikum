```java

package Tugas1.Latihan1;
public class Latihan1 { //Mendeklarasikan package Tugas1.Latihan1 dan kelas Latihan1.
    public static void main(String[] args) { //Mendeklarasikan metode main sebagai titik awal eksekusi program.

        int[] bilanganGenap = new int[10]; //Mendeklarasikan array bilanganGenap dengan ukuran 10.
        int jumlah = 0; //Mendeklarasikan variabel jumlah untuk menyimpan total elemen array.

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) { //Mengisi array dengan bilangan genap (dimulai dari 2, 4, 6, …, 20).
            bilanganGenap[i] = (i + 1) * 2;
        }

        // Menampilkan array
        System.out.println("Isi array:"); //Menampilkan teks "Isi array:".
        for (int bilangan : bilanganGenap) { //Menggunakan perulangan for-each untuk mencetak elemen array dan menjumlahkannya.
            System.out.print(bilangan + " ");
            jumlah += bilangan; 
        }

        System.out.println("\\nJumlah semua elemen: " + jumlah);//Menampilkan hasil penjumlahan seluruh elemen array.
    } //Menutup blok kode kelas Latihan1.
}
```