```java
package Tugas1.Latihan4; //Mendeklarasikan bahwa kelas ini berada dalam package Tugas1.Latihan4.

public class Latihan4 { //Mendeklarasikan kelas Latihan4.
    public static void main(String[] args) { //Mendeklarasikan metode main, yang merupakan entry point eksekusi program.
        // Program operasi matriks
        int[][] matriksA = { //Mendeklarasikan dan menginisialisasi matriks matriksA, yaitu sebuah array 2 dimensi dengan 2 baris dan 3 kolom.
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriksB = { //Mendeklarasikan dan menginisialisasi matriks matriksB dengan ukuran yang sama seperti matriksA.
            {7, 8, 9},
            {10, 11, 12}
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3]; //Membuat matriks hasil berukuran 2x3 yang akan menyimpan hasil penjumlahan elemen-elemen dari matriksA dan matriksB.

        for (int i = 0; i < matriksA.length; i++) { //Melakukan perulangan untuk setiap baris matriks.
            for (int j = 0; j < matriksA[0].length; j++) { // Melakukan perulangan untuk setiap kolom dalam matriks.
                hasil[i][j] = matriksA[i][j] + matriksB[i][j]; //Menjumlahkan elemen matriks matriksA dan matriksB pada posisi [i][j], lalu menyimpannya ke dalam hasil[i][j].
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:"); //Menampilkan teks sebelum hasil matriks.
        for (int[] baris : hasil) { //Menggunakan perulangan for-each untuk mengambil setiap baris dari matriks hasil.
            for (int nilai : baris) { //Menggunakan perulangan for-each untuk mengambil setiap elemen dalam baris.
                System.out.print(nilai + " "); //Mencetak nilai elemen matriks dengan spasi antar elemen.
            }
            System.out.println(); //Mencetak baris baru setelah semua elemen dalam satu baris ditampilkan.
        }
    }
} //Menutup blok kode for, main, dan kelas Latihan4.
```