package Latihan;

public class Latihan_02 {

    public static void main(String[] args) {
        int[] ages = new int[5];

        for (int i = 0; i < 5; i++) {
            ages[i] = (i + 1) * 10;
        }

        System.out.println("=Value by index=");
        System.out.println("ages[2]=" + ages[2]);
        System.out.println("=Use Loop=");
        for (int i = 0; i < 5; i++) {
            System.out.println("ages[" + i + "]=" + ages[i]);
        }
    }
}

