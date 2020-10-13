package be.vdab.jpfhfdst17;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {
    private String landCode;
    private String landNaam;
    private String hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdstad,
                BigInteger aantalInwoners, BigDecimal oppervlakte) {
        this.landCode = landCode;
        this.landNaam = landNaam;
        this.hoofdstad = hoofdstad;
        this.aantalInwoners = aantalInwoners;
        this.oppervlakte = oppervlakte;
    }

    public String getLandCode() {
        return landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }

    public void setLandNaam(String landNaam) {
        this.landNaam = landNaam;
    }

    public void setHoofdstad(String hoofdstad) {
        this.hoofdstad = hoofdstad;
    }

    public void setAantalInwoners(BigInteger aantalInwoners) {
        if (aantalInwoners.compareTo(BigInteger.ZERO) == 1)
            this.aantalInwoners = aantalInwoners;
        else
            throw new LandException("AantalInwoners moet groter zijn dan 0",
                    aantalInwoners);
    }

    public void setOppervlakte(BigDecimal oppervlakte) {
        if (oppervlakte.compareTo(BigDecimal.ZERO) == 1)
            this.oppervlakte = oppervlakte;
        else
            throw new LandException("Oppervlakte moet groter zijn dan 0",
                    oppervlakte);
    }

    public BigDecimal bevolkingsdichtheid(){
        return new BigDecimal(aantalInwoners).divide(oppervlakte,
                2, RoundingMode.HALF_UP);
    }
    @Override
    public String toString() {
        return landCode + " ; "+ landNaam + " ; " + hoofdstad + " ; " +
                aantalInwoners + " ; " + oppervlakte + " ; " +
                bevolkingsdichtheid();
    }
}
