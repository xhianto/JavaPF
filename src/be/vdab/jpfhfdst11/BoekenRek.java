package be.vdab.jpfhfdst11;

public class BoekenRek implements Voorwerp{
    private final static String eigenaar = "VDAB";
    private int hoogte;
    private int breedte;
    private float aankoopPrijs;
    private final static float winstMarge = 2.0f;

    public BoekenRek() {
    }

    public BoekenRek(int hoogte, int breedte, float aankoopPrijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        this.aankoopPrijs = aankoopPrijs;
    }

    public void setHoogte(int hoogte) {
        if (hoogte > 0)
            this.hoogte = hoogte;
    }

    public void setBreedte(int breedte) {
        if (breedte > 0)
            this.breedte = breedte;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN DE BOEKENREK ") ;
        System.out.println("Het boekenrek is " + hoogte + " cm hoog en "
                + breedte + " cm breed.");
        System.out.println("Het is eigendom van : " + eigenaar);
        System.out.println("Aankoopprijs : " + aankoopPrijs);
        System.out.println("Winst : " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return aankoopPrijs * winstMarge;
    }

    @Override
    public String toString() {
        return (hoogte + " ; " + breedte + " ; " + eigenaar + " ; " +
                aankoopPrijs + " ; " + winstMarge);
    }
}
