package be.vdab.jpfhfdst8;

public class Personenwagen extends Voertuig implements Vervuiler{
    public int aantalDeuren = 4;
    public int aantalPassagiers = 5;

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0)
            this.aantalDeuren = aantalDeuren;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0)
            this.aantalPassagiers = aantalPassagiers;
    }
    public Personenwagen(){

    }

    public Personenwagen(String polishouder, float kostprijs, int pk,
                         float gemVerbruik, String nummerplaat, int aantalDeuren,
                         int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    @Override
    public String toString(){
        return super.toString() + ";" + getAantalDeuren() + ";" + getAantalPassagiers();
    }

    @Override
    public void toon(){
        super.toon();
        System.out.println("Aantal Deuren:\t" + getAantalDeuren());
        System.out.println("Aantal Passagiers:\t" + getAantalPassagiers());
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / getAantalPassagiers();
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5;
    }
}
