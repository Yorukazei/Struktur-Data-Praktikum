```java

package Tugas2.transposematrix; //Menyatakan bahwa file ini berada dalam package Tugas2.transposematrix.

import java.util.Scanner; //Mengimpor kelas Scanner dari java.util, yang digunakan untuk membaca input dari pengguna.

public class transposematrix { //Mendeklarasikan kelas dengan nama transposematrix.
    public static void main(String[] args) { //main adalah metode utama yang akan dieksekusi saat program dijalankan
        Scanner input = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari pengguna.

        // Input ukuran matriks
        System.out.println("Masukkan jumlah baris dan kolom matriks: "); //Menampilkan pesan agar pengguna memasukkan jumlah baris dan kolom.
        int baris = input.nextInt(), kolom = input.nextInt(); //Menggunakan input.nextInt() untuk membaca angka yang dimasukkan.

        int[][] matriks = new int[baris][kolom]; //matriks digunakan untuk menyimpan input awal.
        int[][] transpose = new int[kolom][baris]; //transpose adalah matriks hasil transpose, dengan ukuran terbalik (baris menjadi kolom, dan sebaliknya).

        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:"); //Menampilkan pesan untuk memasukkan elemen matriks
        for (int i = 0; i < baris; i++) //Menggunakan nested loop (for dalam for) untuk membaca input dan menyimpannya ke dalam array matriks[i][j].
            for (int j = 0; j < kolom; j++)
                matriks[i][j] = input.nextInt();

        // Proses transpose
        for (int i = 0; i < baris; i++) //Menukar nilai matriks[i][j] ke transpose[j][i].
            for (int j = 0; j < kolom; j++)
                transpose[j][i] = matriks[i][j]; //Artinya, baris dari matriks menjadi kolom pada transpose, dan sebaliknya.

        // Output hasil transpose
        System.out.println("Hasil transpose:"); //Menampilkan teks "Hasil transpose:".
        for (int[] row : transpose) { //Menggunakan loop for-each untuk mencetak setiap elemen dari transpose.
            for (int val : row)
                System.out.print(val + " "); //mencetak angka di baris yang sama.
            System.out.println(); // pindah ke baris baru setelah setiap baris matriks dicetak.
        }

        input.close(); //Menutup Scanner untuk mencegah kebocoran sumber daya.
    }
}
```