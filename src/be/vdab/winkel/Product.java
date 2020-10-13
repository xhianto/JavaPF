package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    // constructor
    public Product(String omschrijving, BigDecimal prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public void setOmschrijving(String omschrijving) {
        if (omschrijving.trim().isEmpty()) {
            throw new IllegalArgumentException("omschrijving moet " +
                    "ingevuld worden");
        }
        this.omschrijving = omschrijving;
    }

    public void setPrijs(BigDecimal prijs) {
        if (prijs.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("prijs moet >= 0");
        }
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product))
            return false;
        Product product = (Product) o;
        return Objects.equals(omschrijving, product.omschrijving);
    }

    @Override
    public int hashCode() {
        return omschrijving.hashCode();
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return omschrijving + " ; " + prijs;
    }
}
