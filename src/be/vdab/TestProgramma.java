package be.vdab;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.verwarming.Stookketel;
import be.vdab.voertuigen.*;

public class TestProgramma {
    public static void main(String[] args) {
        var opel1 = new be.vdab.voertuigen.Personenwagen();
        opel1.toon();
        System.out.println(opel1);
        var opel2 = new Personenwagen("Jan Klaasen",
                14599.0F, 105, 6.8F, "1-KLM-099", 5, 5);
        opel2.toon();
        System.out.println(opel2);
        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalPassagiers(0);
        System.out.println(opel2); //opel2 is niet gewijzigd
        var volvo1 = new be.vdab.voertuigen.Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);
        var volvo2 = new Vrachtwagen("Michel Dewolf",
                214599.0F, 440, 33.1F, "1-PRD-441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);
        System.out.println();
        System.out.println("Kyotoscore personenwagen 1: " + opel1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen 2: " + opel2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2: " + volvo2.getKyotoScore());
//polymorfisme
        var voertuigen = new Voertuig[4];
        voertuigen[0] = opel1;
        voertuigen[1] = opel2;
        voertuigen[2] = volvo1;
        voertuigen[3] = volvo2;
        System.out.println("\n--- toString()---");
        for (var voertuig : voertuigen) {
            System.out.println(voertuig);
        }
        System.out.println("\n--- method toon() ---");
        for (var voertuig : voertuigen) {
            voertuig.toon();
        }

        var stookketel1 = new Stookketel();
        stookketel1.setCONorm(20);
        var vervuilers = new Vervuiler[] { volvo1, volvo2, stookketel1};
        for (var vervuiler : vervuilers){
            System.out.println(vervuiler.berekenVervuiling());
        }

        var Privaten = new Privaat[] { opel1, opel2, volvo1, volvo2 };
        for (var privaat : Privaten){
            privaat.geefPrivateData();
        }

        var Milieus = new Milieu[] { opel1, opel2, volvo1, volvo2};
        for (var milieu : Milieus){
            milieu.geefMilieuData();
        }
    }
}
