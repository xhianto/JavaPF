package be.vdab.jpfhfdst17;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LandException extends RuntimeException {
    private BigInteger foutAantalInwoners;
    private BigDecimal foutOppervlakte;

    public LandException() {
    }

    public LandException(String message) {
        super(message);
    }

    public LandException(String message, BigInteger foutAantalInwoners) {
        super(message);
        this.foutAantalInwoners = foutAantalInwoners;
    }

    public LandException(String message, BigDecimal foutOppervlakte) {
        super(message);
        this.foutOppervlakte = foutOppervlakte;
    }
}
