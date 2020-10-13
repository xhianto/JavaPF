package be.vdab.cursus;

public class Cursus implements Comparable<Cursus>{
    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus(int cursusNr, String cursusNaam, int prijs) {
        this.cursusNr = cursusNr;
        this.cursusNaam = cursusNaam;
        this.prijs = prijs;
    }

    public final int getCursusNr() {
        return cursusNr;
    }

    public final void setCursusNr(int cursusNr) {
        if (cursusNr > 0)
            this.cursusNr = cursusNr;
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public final void setCursusNaam(String cursusNaam) {
        if ((cursusNaam != null) && !(cursusNaam.trim().isEmpty()))
            this.cursusNaam = cursusNaam;
    }

    public int getPrijs() {
        return prijs;
    }

    public final void setPrijs(int prijs) {
        if (prijs > 0)
            this.prijs = prijs;
    }

    @Override
    public String toString() {
        return (cursusNr + " ; " + cursusNaam + " ; " + prijs);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cursus))
            return false;
        Cursus cursus = (Cursus) o;
        return getCursusNr() == cursus.getCursusNr();
    }

    @Override
    public int hashCode() {
        return cursusNr;
    }

    @Override
    public int compareTo(Cursus cursus){
        // sorteren op cursusNr
        // return cursusNr - cursus.getCursusNr();

        // sorteren op cursusPrijs: consistent met equals()
        if (this.equals(cursus))
            return 0;
        else
            return prijs == cursus.getPrijs() ? -1 : prijs - cursus.getPrijs();
    }
}
