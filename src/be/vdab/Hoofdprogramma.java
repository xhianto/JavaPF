package be.vdab;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.*;

public class Hoofdprogramma {
    public static void main(String[] args) {
        Voorwerp[] voorwerpen = new Voorwerp[6];
        try {
            voorwerpen[0] = new BoekenRek();
        }
        catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[1] = new BoekenRek(75, 90,
                    28.5F);
        }
        catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[2] = new LeesBoek();
        }
        catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[3] = new LeesBoek("Leesboek Java 7",
                    "Oracle", 20.4F,
                    "genre Informatica", "978-0-306-40615-7",
                    "onderw programmeren");
        }
        catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[4] = new WoordenBoek();
        }
        catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[5] = new WoordenBoek("Woordenboek Engels",
                    "Van Dale", 30.10F,
                    "genre vertaal woordenboek",
                    "978-0-306-40615-N",
                    "taal Engels-Nederlands");
        }
        catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        float totaleWinst = 0;
        for (Voorwerp voorwerp : voorwerpen) {
            if (voorwerp != null) {
                voorwerp.gegevensTonen();
                System.out.println();
                totaleWinst += voorwerp.winstBerekenen();
            }
        }
        System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
    }
}
