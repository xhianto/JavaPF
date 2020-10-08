package be.vdab.jpfhfdst6;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        System.out.println("Hoeveel huisdieren heb je?");
        Scanner scanner = new Scanner(System.in);
        int aantal = scanner.nextInt();
        String message = "";
        switch (aantal){
            case 0:
                message = "Jammer dat je geen huisdieren hebt.";
                break;
            case 1:
                message = "Je huisdier heeft een speelmaatje nodig.";
                break;
            case 2:
                message = "Ga je nog meer huisdieren halen?";
                break;
            case 3:
                message = "Niet meer huisdieren erbij nemen, hè.";
                break;
            default:
                message = "Je hebt te veel huisdieren.";
        }
        System.out.println(message);
    }
}
