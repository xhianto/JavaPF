package be.vdab.jpfhfdst10;

import java.util.Scanner;

public class PalindroomInMain {
    public static void main(String[] args) {
        System.out.println("Voer een woord in:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder invoer = new StringBuilder(scanner.next());
        System.out.println("Het is " +
                (invoer.toString().equalsIgnoreCase(
                        invoer.reverse().toString()) ? "" : "g") +
                "een palindroom");
    }
}
