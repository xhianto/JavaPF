package be.vdab.jpfhfdst11;

public abstract class Boek implements Voorwerp{
    private String titel;
    private String auteur;
    private final static String eigenaar = "VDAB";
    private float aankoopPrijs;
    private String genre;

    public Boek() {
    }

    public Boek(String titel, String auteur, float aankoopPrijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        this.aankoopPrijs = aankoopPrijs;
        setGenre(genre);
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
