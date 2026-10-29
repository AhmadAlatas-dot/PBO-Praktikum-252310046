package Latihan;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan_10 {

    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<String> data = new ArrayList<String>();

        //Isi ArrayList berdasarkan field
        for (int i = 0; i < field.length; i++) {
            data.add(JOptionPane.showInputDialog(null,
                    "Masukan " + field[i] + ":", "Data array ke - " + i, JOptionPane.QUESTION_MESSAGE));
        }

        //Tampilkan hasil
        String hasil = " ";
        for (int i = 0; i < field.length; i++) {
            hasil += field[i] + ": " + data.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
