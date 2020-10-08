package be.vdab.jpfhfdst6;

public class RandomGenerator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println((i + 1) + ": " + (int)(Math.random() * 100 + 1));
        }
    }
}
