package Latihan;

import javax.swing.JOptionPane;

public class Latihan_06 {

    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];

        //Input matrix A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Masukan nilai matrix A [" + i + "][" + j + "]:"));
            }
        }

        //Input matrix B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Masukan nilai matrix B [" + i + "][" + j + "]:"));
            }
        }

        // Output
        String hasil = "Matrix A\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += A[i][j] + "  ";
            }
            hasil += "\n";
        }
        hasil += "\nMatrix B\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += B[i][j] + "  ";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
