package be.vdab.jpfhfdst7;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {
        System.out.println("Voer een temperatuur in:");
        Scanner scanner = new Scanner(System.in);
        double invoer = scanner.nextDouble();
        Waarnemer waarnemer = new Waarnemer();
        while (invoer != 999){
            waarnemer.getalIngeven(invoer);
            System.out.println("Voer een temperatuur in:");
            invoer = scanner.nextDouble();
        }
        System.out.println("Aantal keer ingegeven is:     " + waarnemer.getAantal());
        System.out.println("De hoogste temperatuur is:    " + waarnemer.getMaxTemp());
        System.out.println("De laagste temperatuur is:    " + waarnemer.getMinTemp());
        System.out.println("De gemiddelde temperatuur is: " +
                ((waarnemer.getAantal() != 0) ?
                        (waarnemer.getSomTemp() / waarnemer.getAantal()) : 0));
    }
}
