package be.vdab.jpfhfdst15;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        var zaaiSeizoen = Seizoen.LENTE;
        var skiSeizoen = Seizoen.WINTER;
        System.out.println(zaaiSeizoen);
        System.out.println(skiSeizoen);
        System.out.println();

        for (var seizoen: Seizoen.values()) {
            System.out.println(seizoen);
        }
        System.out.println();

        var zwemseizoen = Seizoen.valueOf(("ZOMER"));
        System.out.println(zwemseizoen.ordinal());
        System.out.println();

        System.out.println(skiSeizoen.getBeginmaand());

        int getal = 12;
        for (var seizoen : Seizoen.values()){
            if (seizoen.getBeginmaand() == getal)
                System.out.println("Gevonden, " + seizoen);
        }
    }
}