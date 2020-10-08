package be.vdab.jpfhfdst4;

import java.util.Scanner;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        System.out.println("Geef aantal seconden:");
        Scanner scanner = new Scanner(System.in);
        int invoer = scanner.nextInt();
        System.out.print("U:" + invoer / 3600);
        invoer %= 3600;
        System.out.print(" M:" + invoer / 60);
        invoer %= 60;
        System.out.println(" S:" + invoer);
    }
}
