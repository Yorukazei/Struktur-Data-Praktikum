```java
package Tugas1.studycase2; //Menentukan bahwa file ini berada dalam package Tugas1.studycase2.

public class Studycase2 { //Mendeklarasikan kelas Studycase2, yang berisi logika permainan.
    public static void main(String[] args) { //Mendeklarasikan metode main, sebagai titik awal eksekusi program.
        char[][] papan = new char[3][3]; //Membuat array 2D papan berukuran 3x3, yang merepresentasikan papan permainan Tic-Tac-Toe.

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) { //Melakukan perulangan nested loop untuk mengisi papan dengan karakter '-', yang menunjukkan kotak kosong.
            for (int j = 0; j < 3; j++) { 
                papan[i][j] = '-'; //Loop pertama (i): Mengakses baris dalam array papan, Loop kedua (j): Mengakses kolom dalam baris i dan mengisinya dengan '-'.
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X'; //ditempatkan di baris 0, kolom 0.
        papan[1][1] = 'O'; //ditempatkan di baris 1, kolom 1.
        papan[2][2] = 'X'; //ditempatkan di baris 2, kolom 2.

        // Tampilkan papan
        System.out.println("Status Papan:"); //Menampilkan teks "Status Papan:" lalu memanggil metode tampilkanPapan(papan) untuk mencetak papan ke layar.
        tampilkanPapan(papan);
    }

    // public static void tampilkanPapan(char[][] papan) { /Mendeklarasikan metode tampilkanPapan, yang menerima array 2D papan sebagai parameter dan menampilkannya.
        for (int i = 0; i < 3; i++) { //Loop untuk mengakses setiap baris dari papan.
            for (int j = 0; j < 3; j++) { //Loop untuk mengakses setiap elemen dalam baris, kemudian mencetaknya dengan spasi (" ").
                System.out.print(papan[i][j] + " ");
            }
            System.out.println(); //Menambahkan baris baru setelah mencetak satu baris papan, agar output rapi.

        }
    }
} //Menutup metode tampilkanPapan dan kelas Studycase2.
```