package be.vdab.jpfhfdst6;

import java.util.Arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[1000];
        for (int i = 0; i < 1000; i++){
            getallen[i] = (int)(Math.random() * 100 + 1);
        }
        Arrays.sort(getallen);
        for (int getal : getallen){
            System.out.println(getal);
        }
    }
}
