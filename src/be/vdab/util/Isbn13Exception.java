package be.vdab.util;

public class Isbn13Exception extends RuntimeException {
    private String foutIsbn13;

    public String getFoutIsbn13() {
        return foutIsbn13;
    }

    public Isbn13Exception() {
    }

    public Isbn13Exception(String omschrijving) {
        super(omschrijving);
    }

    public Isbn13Exception(String omschrijving, String foutIsbn13) {
        super(omschrijving);
        this.foutIsbn13 = foutIsbn13;
    }
}
