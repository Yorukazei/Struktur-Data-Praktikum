```java
package Tugas1.studycase1; //Menentukan bahwa file ini berada dalam package Tugas1.studycase1.

public class Studycase1 { //Mendeklarasikan kelas Studycase1.
    public static void main(String[] args) { //Mendeklarasikan metode main, yang merupakan entry point eksekusi program.

        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"}; //Membuat array namaSiswa yang berisi nama-nama siswa.
        int[][] nilai = { //Membuat array 2D nilai yang berisi nilai dari setiap siswa untuk tiga mata pelajaran.
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"}; //Membuat array mapel yang berisi nama mata pelajaran.

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:"); //Menampilkan teks sebagai header untuk rata-rata nilai per siswa.
        for (int i = 0; i < nilai.length; i++) { //Melakukan perulangan untuk setiap siswa (baris dalam array nilai).
            double total = 0; //Menginisialisasi total untuk menyimpan jumlah nilai seorang siswa.
            for (int n : nilai[i]) { //Perulangan for-each untuk menjumlahkan semua nilai seorang siswa.
                total += n;
            }
            double rataSiswa = total / nilai[i].length; //Menghitung rata-rata nilai siswa dengan membagi total nilai dengan jumlah mata pelajaran.
            System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa); //Menampilkan rata-rata nilai siswa dalam format desimal 2 angka di belakang koma.
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\nRata-rata nilai per mata pelajaran:"); //Menampilkan teks sebagai header untuk rata-rata nilai per mata pelajaran.
        for (int j = 0; j < nilai[0].length; j++) { //Perulangan untuk setiap mata pelajaran (kolom dalam array nilai).
            double total = 0; //Menginisialisasi total untuk menyimpan jumlah nilai pada mata pelajaran tertentu.
            for (int i = 0; i < nilai.length; i++) { //Perulangan untuk menjumlahkan nilai dari semua siswa pada satu mata pelajaran.
                total += nilai[i][j];
            }
            double rataMapel = total / nilai.length; //Menghitung rata-rata nilai per mata pelajaran.
            System.out.printf("%s: %.2f\n", mapel[j], rataMapel); //Menampilkan rata-rata nilai per mata pelajaran dengan format desimal 2 angka di belakang koma.
        }
    }
} //Menutup blok perulangan dan metode main.

```