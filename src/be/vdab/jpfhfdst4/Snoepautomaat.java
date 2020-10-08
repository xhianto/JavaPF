package be.vdab.jpfhfdst4;

import java.util.Scanner;

public class Snoepautomaat {
    public static void main(String[] args) {
        System.out.println("Geef bedrag in:");
        Scanner scanner = new Scanner(System.in);
        float invoer = scanner.nextFloat();
        int bedrag = (int)(invoer * 100);
        bedrag %= 200;
        System.out.println("Wisselgeld:");
        System.out.println("€1.00: " + bedrag / 100);
        bedrag %= 100;
        System.out.println("€0.50: " + bedrag / 50);
        bedrag %= 50;
        System.out.println("€0.20: " + bedrag / 20);
        bedrag %= 20;
        System.out.println("€0.10: " + bedrag / 10);
        bedrag %= 10;
        System.out.println("€0.05: " + bedrag / 5);
        bedrag %= 5;
        System.out.println("€0.02: " + bedrag / 2);
        bedrag %= 2;
        System.out.println("€0.01: " + bedrag);
    }
}
