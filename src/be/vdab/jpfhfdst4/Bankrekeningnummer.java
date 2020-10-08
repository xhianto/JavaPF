package be.vdab.jpfhfdst4;

import java.util.Scanner;

public class Bankrekeningnummer {
    public static void main(String[] args) {
        System.out.println("Voer een rekeningnummer in:");
        Scanner scanner = new Scanner(System.in);
        long reknr = scanner.nextLong();
        long eersteTien = reknr / 100;
        long controleCijfers = reknr % 100;
        if (eersteTien % 97 == controleCijfers){
            System.out.println("Geldige rekeningnummer");
        }
        else{
            System.out.println("Ongeldige rekeningnummer");
        }
    }
}
