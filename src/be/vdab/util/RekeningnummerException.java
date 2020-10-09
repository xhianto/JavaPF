package be.vdab.util;

public class RekeningnummerException extends RuntimeException {
    public RekeningnummerException() {
    }
    private String foutRekeningNummer;

    public String getFoutRekeningNummer(){
        return foutRekeningNummer;
    }
    public RekeningnummerException(String omschrijving){
        super(omschrijving);
    }

    public RekeningnummerException(String omschrijving,
        String foutRekeningNummer) {
        super(omschrijving);
        this.foutRekeningNummer = foutRekeningNummer;
    }
}
