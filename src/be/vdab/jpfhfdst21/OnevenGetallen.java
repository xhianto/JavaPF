package be.vdab.jpfhfdst21;

import java.util.ArrayList;
import java.util.Scanner;

public class OnevenGetallen {
    public static void main(String[] args) {
        System.out.println("Voer een getal in");
        Scanner scanner = new Scanner(System.in);
        int invoer = scanner.nextInt();
        ArrayList<Integer> getallen = new ArrayList<Integer>();
        while (invoer != 0){
            getallen.add(invoer);
            invoer = scanner.nextInt();
        }
        getallen.stream()
                .sorted()
                .filter(getal -> getal % 2 == 1)
                .forEach(System.out::println);
    }
}
