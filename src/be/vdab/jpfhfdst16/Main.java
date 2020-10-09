package be.vdab.jpfhfdst16;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        var vandaag = LocalDate.now();
        System.out.println(vandaag);
        var beginEuro = LocalDate.of(2002, 1, 1);
        System.out.println(vandaag);
        var eindeBelgischeFrank = LocalDate.of(2002,
                Month.DECEMBER, 31);
        System.out.println(eindeBelgischeFrank);
        System.out.println(eindeBelgischeFrank.getDayOfMonth());
        System.out.println(eindeBelgischeFrank.getDayOfYear());
        System.out.println(eindeBelgischeFrank.getDayOfWeek());
        System.out.println(eindeBelgischeFrank.getMonthValue());
        System.out.println(eindeBelgischeFrank.getMonth());
        System.out.println(eindeBelgischeFrank.lengthOfMonth());
        System.out.println(eindeBelgischeFrank.getYear());
        System.out.println(eindeBelgischeFrank.isLeapYear());

        System.out.println();
        System.out.println("----Vergelijken----");
        var heden = LocalDate.now();
        System.out.println(vandaag.equals(heden));
        System.out.println(beginEuro.compareTo(heden));
        System.out.println(heden.compareTo(beginEuro));
        var dagenTussen = ChronoUnit.DAYS.between(beginEuro, heden);
        System.out.println(dagenTussen);
        System.out.println(ChronoUnit.DAYS.between(heden, beginEuro));
        var jarenTussen = ChronoUnit.YEARS.between(beginEuro, heden);
        System.out.println(jarenTussen);
        var period = Period.between(beginEuro, vandaag);
        System.out.println("De euro is " + period.getYears() + " jaar " +
                period.getMonths() + " maand en " + period.getDays() +
                " dagen geleden ingevoerd.");
    }
}
