package Tugas2.Perkalianmatrix;

import java.util.Scanner;

public class PerkalianMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ukuran matriks
        System.out.println("Masukkan jumlah baris matriks A: ");
        int barisA = input.nextInt();
        System.out.println("Masukkan jumlah kolom matriks A (sama dengan baris B): ");
        int kolomA = input.nextInt();
        System.out.println("Masukkan jumlah kolom matriks B: ");
        int kolomB = input.nextInt();

        // Deklarasi matriks
        int[][] A = new int[barisA][kolomA];
        int[][] B = new int[kolomA][kolomB];
        int[][] C = new int[barisA][kolomB];

        // Input elemen matriks A
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                A[i][j] = input.nextInt();
            }
        }

        // Input elemen matriks B
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < kolomA; i++) {
            for (int j = 0; j < kolomB; j++) {
                B[i][j] = input.nextInt();
            }
        }

        // Perkalian matriks
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output hasil perkalian
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
