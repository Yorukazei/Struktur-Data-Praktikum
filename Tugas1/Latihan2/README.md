```java
package Tugas1.Latihan2; //Mendeklarasikan bahwa kelas ini berada dalam package Tugas1.Latihan2.

public class Latihan2 { //Mendeklarasikan kelas Latihan2.
    public static void main(String[] args) { //Mendeklarasikan metode main, yang merupakan entry point eksekusi program.
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; //Mendeklarasikan dan menginisialisasi array nilai dengan beberapa elemen bilangan bulat.
        int cari = 90; //Menyimpan angka yang akan dicari dalam variabel cari.
        boolean ketemu = false; //Mendeklarasikan variabel boolean ketemu dengan nilai awal false, digunakan untuk menandai apakah nilai ditemukan atau tidak.

        int indeks = -1; //Mendeklarasikan variabel indeks dengan nilai awal -1, yang nantinya akan menyimpan posisi nilai yang dicari dalam array.

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) { //Memulai perulangan for untuk menelusuri semua elemen array nilai.
            if (nilai[i] == cari) { //Memeriksa apakah elemen array pada indeks i sama dengan nilai yang dicari.
                ketemu = true; //Jika nilai ditemukan, atur ketemu menjadi true dan simpan indeks nilai yang ditemukan.
                indeks = i;
                break; //Keluar dari perulangan setelah nilai ditemukan.
            }
        }

        // Menampilkan hasil
        if (ketemu) { //Mengecek apakah nilai yang dicari ditemukan (ketemu == true).
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks); //Jika ditemukan, mencetak pesan yang menunjukkan indeks tempat nilai ditemukan.
        } else { //Jika tidak ditemukan, mencetak pesan bahwa nilai tidak ditemukan dalam array.
            System.out.println("Nilai " + cari + " tidak ditemukan");
        } //Menutup blok kode if, main, dan kelas Latihan2.
    }
}
```