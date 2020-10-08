package be.vdab.jpfhfdst7;

import java.sql.SQLOutput;

public class KaartMain {
    public static void main(String[] args) {
        Kaart kaart1 = new Kaart();
        kaart1.printKaart();
        Kaart kaart2 = new Kaart();
        kaart2.printKaart();
        System.out.println(kaart1.isHogerDan(kaart2));
    }
}
