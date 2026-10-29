package Latihan;

import javax.swing.JOptionPane;

public class Latihan_03 {

    public static void main(String[] args) {
        // Tentukan jumlah array
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah array :"));
        int nilai[] = new int[jumlah];

        // Isi nilai array
        for (int i = 0; i < jumlah; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Masukan angka :", "Data array ke - 1" + i, JOptionPane.QUESTION_MESSAGE));
        }

        // Cetak hasil
        String hasil = "";
        for (int i = 0; i < jumlah; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
