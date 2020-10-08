package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.*;

public class Hoofdprogramma {
    public static void main(String[] args) {
        Voorwerp[] voorwerpen = {
                new be.vdab.voorwerpen.BoekenRek(),
                new BoekenRek(75, 90, 28.5F),
                new be.vdab.voorwerpen.LeesBoek(),
                new LeesBoek("Leesboek Java 7", "Oracle", 20.4F,
                        "genre Informatica", "onderw programmeren" ),
                new be.vdab.voorwerpen.WoordenBoek(),
                new WoordenBoek("Woordenboek Engels", "Van Dale", 30.10F,
                        "genre vertaal woordenboek", "taal Engels-Nederlands")
        };
        float totaleWinst = 0;
        for (var eenVoorwerp: voorwerpen) {
            eenVoorwerp.gegevensTonen();
            System.out.println();
            totaleWinst += eenVoorwerp.winstBerekenen();
        }
        System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
    }
}
