package be.vdab.jpfhfdst8;

public class Vrachtwagen extends Voertuig implements Vervuiler {
    private float maxLading = 10000f;

    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading >= 0f)
            this.maxLading = maxLading;
    }

    public Vrachtwagen() {
    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }
    @Override
    public String toString(){
        return super.toString() + ";" + getMaxLading();
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("Max. Lading:\t" + getMaxLading());
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / (getMaxLading() / 1000);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20;
    }


}
