package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;

public abstract class Voertuig implements Milieu, Privaat {
    private String polishouder = "onbepaald";
    private float kostprijs = 0.0f;
    private int pk = 0;
    private float gemVerbruik = 0.0f;
    private String nummerplaat = "onbepaald";

    public Voertuig() {
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty())
            this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0f)
            this.kostprijs = kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public final void setPk(int pk) {
        if (pk > 0)
            this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0f)
            this.gemVerbruik = gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty())
            this.nummerplaat = nummerplaat;
    }

    @Override
    public String toString(){
        return getPolishouder() + ";" + getKostprijs() + ";" + getPk() + ";" +
                getGemVerbruik() + ";" + getNummerplaat();
    }
    public void toon(){
        System.out.println("Polishouder:\t" + getPolishouder());
        System.out.println("Kostprijs:\t\t" + getKostprijs());
        System.out.println("Aantal pk:\t\t" + getPk());
        System.out.println("Gem. verbruik:\t" + getGemVerbruik());
        System.out.println("Nummerplaat:\t" + getNummerplaat());
    }
    public abstract double getKyotoScore();

    @Override
    public void geefMilieuData() {
        System.out.println(pk + ";" + kostprijs + ";" + gemVerbruik);
    }

    @Override
    public void geefPrivateData() {
        System.out.println(polishouder + ";" + nummerplaat);
    }
}
