package be.vdab.winkel;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.math.BigDecimal;

public class Catalogus {
    private final Set<Product> producten = new LinkedHashSet<>();

    public Catalogus() {
        producten.add(new Product("1kg appelen",
                BigDecimal.valueOf(1.34)));
        producten.add(new Product("1kg peren",
                BigDecimal.valueOf(1.56)));
        producten.add(new Product("netje citroenen",
                BigDecimal.valueOf(0.64)));
        producten.add(new Product("bakje aardbeien",
                BigDecimal.valueOf(2.85)));
        producten.add(new Product("1kg mandarijnen",
                BigDecimal.valueOf(1.60)));
        producten.add(new Product("0.5kg noten",
                BigDecimal.valueOf(2.35)));
        producten.add(new Product("0.5kg kastanjes",
                BigDecimal.valueOf(3.15)));
        producten.add(new Product("zakje rozijnen",
                BigDecimal.valueOf(1.90)));
    }

    public Set<Product> getProducten() {
        return producten;
    }

    @Override
    public String toString() {
        return producten.toString();
    }

    //    private HashSet<Product> Producten;
//
//    public Catalogus() {
//    }
//
//    public Catalogus(HashSet<Product> producten) {
//        Producten = producten;
//    }
//
//    public HashSet<Product> getProducten() {
//        return Producten;
//    }
}
