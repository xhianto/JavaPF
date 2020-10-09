package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private final static String eigenaar = "VDAB";
    private float aankoopPrijs;
    private String genre;
    private String isbn13;

    public Boek() {
    }

    public Boek(String titel, String auteur, float aankoopPrijs,
                String genre, String isbn13) {
        setTitel(titel);
        setAuteur(auteur);
        this.aankoopPrijs = aankoopPrijs;
        setGenre(genre);
        setIsbn13(isbn13);

    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        if (checkIsbn13(isbn13)){
            this.isbn13 = isbn13;
        }
        else {
            throw new Isbn13Exception("ongeldig ISBNnr", isbn13);
        }
    }

    private boolean checkIsbn13(String isbn13){
        isbn13 = isbn13.replaceAll("-","");
        System.out.println(isbn13);
        if (isbn13.length() != 13)
            return false;
        try {
            int som = 0;
            for (int i = 0; i < 12; i++){
                if (i%2 == 0)
                    som += Integer.parseInt(String.valueOf(isbn13.charAt(i)));
                if (i%2 == 1)
                    som += Integer.parseInt(String.valueOf(isbn13.charAt(i))) * 3;
            }
            System.out.println(som);
            int eindCijfer = Integer.parseInt(String.valueOf(isbn13.charAt(12)));
            return (10 - (som % 10) == eindCijfer);
        }
        catch (Exception ex) {
            return false;
        }
    }

    public String getTitel() {
        return titel;
    }

    public final void setTitel(String titel) {
        if (titel != null)
            this.titel = titel;
    }

    public float getAankoopPrijs() {
        return aankoopPrijs;
    }

    public final void setAankoopPrijs(float aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    public final void setGenre(String genre) {
        if (genre != null)
            this.genre = genre;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public String getGenre() {
        return genre;
    }

    public final void setAuteur(String auteur) {
        if (auteur != null)
            this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public String toString() {
        return (titel + " ; " + auteur + " ; " + eigenaar + " ; " +
                aankoopPrijs + " ; " + genre);
    }

    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN EEN BOEK ") ;
        System.out.println("Titel : " + titel) ;
        System.out.println("Auteur : " + auteur) ;
        System.out.println("Het is eigendom van : " + eigenaar);
        System.out.println("Aankoopprijs : " + aankoopPrijs);
        System.out.println("Genre : " + genre);
    }


}
