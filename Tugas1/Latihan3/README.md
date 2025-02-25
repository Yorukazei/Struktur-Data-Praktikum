```java
package Tugas1.Latihan3; //Mendeklarasikan bahwa kelas ini berada dalam package Tugas1.Latihan3.
public class Latihan3 { //Mendeklarasikan kelas Latihan3.
    public static void main(String[] args) { //Mendeklarasikan metode main, yang merupakan entry point eksekusi program
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; //Mendeklarasikan dan menginisialisasi array nilai dengan beberapa elemen bilangan bulat yang merepresentasikan nilai siswa.

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0]; //tertinggi diinisialisasi dengan elemen pertama dari array nilai.
        int terendah = nilai[0]; //terendah juga diinisialisasi dengan elemen pertama dari array nilai.
        int total = nilai[0]; //total diinisialisasi dengan elemen pertama dari array nilai, yang digunakan untuk menghitung total nilai.

        for (int i = 1; i < nilai.length; i++) { //Memulai perulangan for dari indeks 1 (karena indeks 0 sudah digunakan untuk inisialisasi).
            if (nilai[i] > tertinggi) tertinggi = nilai[i]; //Jika elemen array pada indeks i lebih besar dari tertinggi, maka nilai tertinggi diperbarui.
            if (nilai[i] < terendah) terendah = nilai[i]; //Jika elemen array pada indeks i lebih kecil dari terendah, maka nilai terendah diperbarui.
            total += nilai[i]; //Menambahkan nilai elemen array saat ini ke variabel total.
        }

        double rataRata = (double) total / nilai.length; //(double) digunakan untuk memastikan pembagian dilakukan dalam tipe data desimal (floating-point).

        System.out.println("Nilai tertinggi: " + tertinggi); //Mencetak nilai tertinggi.
        System.out.println("Nilai terendah: " + terendah); //Mencetak nilai tertinggi.
        System.out.println("Rata-rata: " + rataRata); //Mencetak nilai rata-rata.
    }
} //Menutup blok kode main dan kelas Latihan3.
```