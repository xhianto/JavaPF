package be.vdab.jpfhfdst8;

public abstract class Rekening {
    private String rekeningNummer;
    private double saldo;

    public Rekening(String rekeningNummer) {
        setRekeningNummer(rekeningNummer);
    }

    public Rekening(String rekeningNummer, double saldo) {
        setRekeningNummer(rekeningNummer);
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public final void setRekeningNummer(String rekeningNummer) {
        if (rekeningNummer != null && !rekeningNummer.isEmpty()){
            this.rekeningNummer = rekeningNummer;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void storten(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }

    public void afhalen(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
        }
    }

    public void overschrijven(Rekening rek, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            rek.storten(bedrag);
        }
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }

    @Override
    public String toString() {
        return rekeningNummer + ", " + saldo;
    }

    public abstract double berekenIntrest();
}
