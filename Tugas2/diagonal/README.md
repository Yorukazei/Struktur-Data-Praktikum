```java

package Tugas2.diagonal; // Menentukan bahwa program berada dalam package Tugas2.diagonal.
import java.util.Scanner; //Mengimpor Scanner untuk membaca input dari pengguna.

public class diagonal { //endeklarasikan kelas dengan nama diagonal (sebaiknya nama kelas menggunakan huruf besar di awal, misalnya Diagonal).
    public static void main(String[] args) { //Metode utama yang akan dieksekusi saat program dijalankan.
        Scanner input = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari pengguna.


        // Input ukuran matriks (harus matriks persegi)
        System.out.print("Masukkan ukuran matriks (n x n): "); //Meminta pengguna memasukkan ukuran n untuk matriks persegi (n x n).
        int n = input.nextInt(); //Hanya berlaku untuk matriks persegi (jumlah baris = jumlah kolom).

        int[][] matriks = new int[n][n]; //Membuat array 2D matriks dengan ukuran n x n untuk menyimpan elemen matriks.

        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) //Mengakses setiap baris dalam matriks.
            for (int j = 0; j < n; j++) //Mengakses setiap kolom dalam matriks.
                matriks[i][j] = input.nextInt(); //Membaca input dan menyimpan ke dalam matriks.

        // Cetak diagonal utama & diagonal samping
        System.out.print("Diagonal utama: ");
        for (int i = 0; i < n; i++) //Dari kiri atas ke kanan bawah.
            System.out.print(matriks[i][i] + " "); //Diagonal samping adalah elemen (i, n - i - 1) → Dari kanan atas ke kiri bawah.

        System.out.print("\nDiagonal samping: ");
        for (int i = 0; i < n; i++)
            System.out.print(matriks[i][n - i - 1] + " "); //Diagonal samping adalah elemen (i, n - i - 1) → Dari kanan atas ke kiri bawah.

        input.close(); //Menutup Scanner untuk menghindari kebocoran memori.
    }
}
```