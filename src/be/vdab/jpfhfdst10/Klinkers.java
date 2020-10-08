package be.vdab.jpfhfdst10;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        System.out.println("Voer een zin in:");
        Scanner scanner = new Scanner(System.in);
        String invoer = scanner.nextLine();
        char[] klinkers = new char[] { 'a', 'e', 'i', 'o', 'u'};
        int aantalKlinkers = 0;
        for (int i = 0; i < invoer.length(); i++){
            char temp = invoer.toLowerCase().charAt(i);
            for (char klinker : klinkers){
                if (Character.compare(temp, klinker) == 0)
                    aantalKlinkers++;
            }
        }
        System.out.println("Zin heeft " + aantalKlinkers + " klinkers.");
    }
}
