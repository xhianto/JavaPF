package be.vdab.jpfhfdst16;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Geboorte {
    public static void main(String[] args) {
        System.out.println("Tik je geboorte datum in (dd/mm/yyyy)");
        Scanner scanner = new Scanner(System.in);
        String invoer = scanner.nextLine();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate geboorteDatum = LocalDate.parse(invoer, formatter);

        var verschil = Period.between(geboorteDatum, LocalDate.now());
        System.out.println("Je bent geboren op:" + geboorteDatum.getDayOfWeek());
        System.out.println("je bent " + verschil.getYears() + " jaar " +
                verschil.getMonths() + " maand en " + verschil.getDays() +
                " dagen oud");
    }
}
