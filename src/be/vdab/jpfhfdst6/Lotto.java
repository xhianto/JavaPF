package be.vdab.jpfhfdst6;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] getallen = new int[6];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 42 + 1);
        }

        int reserveGetal = (int)(Math.random() * 42 + 1);
        Arrays.sort(getallen);
        for (int getal : getallen){
            System.out.print("[" + getal + "]");
        }
        System.out.print(" [" + reserveGetal + "]");
    }
}
