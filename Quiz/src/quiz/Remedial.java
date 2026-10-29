package quiz;

import javax.swing.JOptionPane;

public class Remedial {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int jumlah = Integer.parseInt(jop.showInputDialog(null, "Masukan jumlah array: ", "Input", jop.QUESTION_MESSAGE));
		int nilai [] = new int[jumlah];
		
		int total = 0;
				for (int i = 0; i < jumlah; i++) {
					nilai[i] = Integer.parseInt(jop.showInputDialog(null, "Masukan angka: ", "Data array ke-" + i, jop.QUESTION_MESSAGE));
				total += nilai [i];
				}
				
				double rataRata = (double) total / jumlah;
				
				JOptionPane.showMessageDialog(null, "Rata-rata: " + rataRata, "Hasil Rata-Rata : ", JOptionPane.INFORMATION_MESSAGE);
				
		
	}
}
