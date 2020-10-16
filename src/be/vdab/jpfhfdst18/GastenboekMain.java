package be.vdab.jpfhfdst18;

import java.util.Scanner;

public class GastenboekMain {
    public static void main(String[] args) {
        var manager = new GastenboekManager();
        var gastenboek = manager.read();
        var scanner = new Scanner(System.in);
        System.out.print("T=tonen,S=schrijven,E=einde:");
        for (String keuze;
             !(keuze = scanner.nextLine()).equalsIgnoreCase("E");) {
            switch (keuze) {
                case "T":
                case "t":
                    System.out.println(gastenboek);
                    break;
                case "S":
                case "s":
                    System.out.print("Schrijver:");
                    var schrijver = scanner.nextLine();
                    System.out.print("Boodschap:");
                    var boodschap = scanner.nextLine();
                    gastenboek.toevoegen(new GastenboekEntry(schrijver, boodschap));
                    manager.write(gastenboek);
                    break;
                default:
                    System.out.println("Verkeerde keuze");
            }
            System.out.print("T=tonen,S=schrijven,E=einde:");

        }
    }
}
