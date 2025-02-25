```java

package Tugas2.Perkalianmatrix; //Menentukan bahwa program ini berada dalam package Tugas2.Perkalianmatrix.

import java.util.Scanner; //Mengimpor Scanner untuk membaca input dari pengguna.

public class PerkalianMatriks { //Mendeklarasikan kelas dengan nama PerkalianMatriks.
    public static void main(String[] args) { //Metode utama yang dieksekusi saat program dijalankan.

        Scanner input = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari pengguna.


        // Input ukuran matriks
        System.out.println("Masukkan jumlah baris matriks A: "); //Matriks A memiliki ukuran (barisA x kolomA)
        int barisA = input.nextInt();
        System.out.println("Masukkan jumlah kolom matriks A (sama dengan baris B): "); //Matriks B memiliki ukuran (kolomA x kolomB), sehingga jumlah kolom A harus sama dengan jumlah baris B agar perkalian bisa dilakukan.
        int kolomA = input.nextInt();
        System.out.println("Masukkan jumlah kolom matriks B: "); //Matriks hasil C akan memiliki ukuran (barisA x kolomB).

        int kolomB = input.nextInt();

        // Deklarasi matriks
        int[][] A = new int[barisA][kolomA]; //Menyimpan elemen matriks pertama (A).
        int[][] B = new int[kolomA][kolomB]; //Menyimpan elemen matriks kedua (B).
        int[][] C = new int[barisA][kolomB]; //Menyimpan hasil perkalian matriks (barisA x kolomB).

        // Input elemen matriks A
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++) { //Mengakses setiap baris pada matriks A.
            for (int j = 0; j < kolomA; j++) { //Mengakses setiap kolom pada matriks A dan membaca input dari pengguna.
                A[i][j] = input.nextInt();  
            }
        }

        // Input elemen matriks B
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < kolomA; i++) { //Mengakses setiap baris pada matriks B (jumlahnya harus sama dengan kolom A).
            for (int j = 0; j < kolomB; j++) { //Mengakses setiap kolom pada matriks B dan membaca input dari pengguna.

                B[i][j] = input.nextInt();
            }
        }

        // Perkalian matriks
        for (int i = 0; i < barisA; i++) { //Mengakses setiap baris hasil matriks C.
            for (int j = 0; j < kolomB; j++) { //Mengakses setiap kolom hasil matriks C.
                for (int k = 0; k < kolomA; k++) { //Melakukan perkalian baris dari A dengan kolom dari B, lalu menjumlahkan hasilnya.
                    C[i][j] += A[i][k] * B[k][j]; //rumus
                }
            }
        }

        // Output hasil perkalian
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < barisA; i++) { //Mengakses setiap baris pada hasil matriks C.
            for (int j = 0; j < kolomB; j++) { //Mencetak setiap elemen pada baris tersebut.
                System.out.print(C[i][j] + " ");
            }
            System.out.println(); //Pindah ke baris baru setelah setiap baris matriks dicetak.

        }

        input.close(); //Menutup Scanner untuk mencegah kebocoran sumber daya.
    }
}
```