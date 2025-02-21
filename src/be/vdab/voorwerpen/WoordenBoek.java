package be.vdab.voorwerpen;

public class WoordenBoek extends Boek {
    private String taal;
    private final static float winstMarge = 1.75f;

    public WoordenBoek() {
    }

    public WoordenBoek(String titel, String auteur, float aankoopPrijs,
                       String genre, String isbn13, String taal) {
        super(titel, auteur, aankoopPrijs, genre, isbn13);
        this.taal = taal;
    }

    @Override
    public float winstBerekenen() {
        return winstMarge * getAankoopPrijs();
    }

    @Override
    public String toString() {
        return (super.toString() + " ; " + taal + " ; " + winstMarge);
    }
}
