package be.vdab.jpfhfdst17;

import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper> {
    private String naam;
    private int punten;

    public Tienkamper(String naam, int punten) {
        this.naam = naam;
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null)
            this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        if (punten >= 0)
            this.punten = punten;
    }

    @Override
    public String toString() {
        return naam + " ; " + punten;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tienkamper))
            return false;
        Tienkamper that = (Tienkamper) o;
        return Objects.equals(getNaam(), that.getNaam());
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public int compareTo(Tienkamper o) {
        return naam.compareTo(o.getNaam());
    }
}
