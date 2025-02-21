package be.vdab.voorwerpen;

public class LeesBoek extends Boek {
    private String onderwerp;
    private final static float winstmarge = 1.5f;

    public LeesBoek() {
    }

    public LeesBoek(String titel, String auteur, float aankoopPrijs,
                    String genre, String isbn13, String onderwerp) {
        super(titel, auteur, aankoopPrijs, genre, isbn13);
        this.onderwerp = onderwerp;
    }

    @Override
    public float winstBerekenen() {
        return winstmarge * getAankoopPrijs();
    }

    @Override
    public String toString() {
        return (super.toString() + " ; " + onderwerp + " ; " + winstmarge);
    }
}
