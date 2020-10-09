package be.vdab.rekening;

import be.vdab.util.RekeningnummerException;

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
        if (checkIBANnummer(rekeningNummer)){
            this.rekeningNummer = rekeningNummer;
        }
        else {
            throw new RekeningnummerException("ongeldige IBANreknr", rekeningNummer);
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

    private boolean checkIBANnummer (String reknr) {
        if (reknr == null || reknr.length() != 19 || !reknr.substring(0,2).equals("BE")) {
            return false;
        }
        try {
            Integer.parseInt(reknr.substring(2, 4));
            var d1 = Integer.parseInt(reknr.substring(5, 9));
            var d2 = Integer.parseInt(reknr.substring(10, 14));
            var d3 = Integer.parseInt(reknr.substring(15, 17));
            var d4 = Integer.parseInt(reknr.substring(17, 19));

            var tienCijfers = (d1 * 1000000L + d2 * 100L + d3);
            var rest = (int) (tienCijfers % 97);
            return (rest == d4);
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
}
