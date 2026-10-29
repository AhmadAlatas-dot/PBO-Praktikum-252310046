package Latihan;

import javax.swing.JOptionPane;

public class Latihan_07 {

    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        //Input matrix A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Masukan nilai matrix A[" + i + "][" + j + "]:"));
            }
        }

        //Input matrix B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Masukan nilai matrix B[" + i + "][" + j + "]:"));
            }
        }

        //NPM 252310046 = GENAP, maka C = A - B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        //Output matrix C
        String hasil = "C = A - B (NPM Genap)\n\nMatrix C\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += C[i][j] + "  ";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}