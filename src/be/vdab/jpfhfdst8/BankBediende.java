package be.vdab.jpfhfdst8;

public class BankBediende {
    public static void main(String[] args) {
        System.out.println("Intrestpercentage van de spaarrekening: " +
                Spaarrekening.getIntrest());

        var spaar = new Spaarrekening("BE12 3456 7890 1234",
                1.5d);
        var zicht = new Zichtrekening("BE98 7654 3210 9876",
                1000);

        System.out.println("Intrestpercentage van de spaarrekening: " +
                Spaarrekening.getIntrest());

        System.out.println("Maxkrediet van de zichtrekening is: " +
                zicht.getMaxKrediet());

        spaar.storten(600.0d);
        zicht.storten(200.0d);

        spaar.afhalen(25.0d);
        System.out.println("Saldo van de spaarrekening: " + spaar.getSaldo());

        zicht.afhalen(50.0d);
        System.out.println("Saldo van de zichtrekening: " + zicht.getSaldo());

        zicht.afhalen(2000d);
        System.out.println("Saldo van de zichtrekening (na poging afhalen 2000): " +
                zicht.getSaldo());

        spaar.afhalen(600.0d);
        System.out.println("Salso van de spaarrekening (na poging afhalen 600): " +
                spaar.getSaldo());

        zicht.afhalen(1100d);
        System.out.println("Saldo van de zichtrekening (na poging afhalen 1100): " +
                zicht.getSaldo());

        zicht.setMaxKrediet(2000);
        System.out.println("MaxKrediet van de zichtrekening is: " +
                zicht.getMaxKrediet());

        zicht.afhalen(900d);
        System.out.println("Saldo van de zichtrekening (na poging afhalen 900): " +
                zicht.getSaldo());

        System.out.println(spaar);
        System.out.println(zicht);

        System.out.println("Intrest op de spaarrekening: " + spaar.berekenIntrest());
        System.out.println("Intrest op de zichtrekening: " + zicht.berekenIntrest());

        var rekeningen = new Rekening[4];
        rekeningen[0] = new Spaarrekening("BE11 2233 4455 6677",
                1.5);
        rekeningen[1] = new Spaarrekening("BE99 8877 6655 4433",
                1.5);
        rekeningen[2] = new Zichtrekening("BE19 2837 4655 6473",
                2000);
        rekeningen[3] = new Zichtrekening("BE91 8273 6455 4637",
                1500);

        rekeningen[0].storten(500.0d);
        rekeningen[1].storten(550.0d);
        rekeningen[1].afhalen(120.0d);
        rekeningen[2].storten(200.00d);
        rekeningen[2].afhalen(20.00d);
        rekeningen[3].storten(300.0d);

        var i = 0;
        while (i < rekeningen.length && rekeningen[i] != null) {
            System.out.println("Saldo van de rekening: " +
                    rekeningen[i].getSaldo());
            i++;
        }

        System.out.println(rekeningen[1] instanceof Spaarrekening);
    }
}
