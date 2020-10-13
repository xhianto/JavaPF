package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mandje {
    private final Map<Product, Integer> mandje = new LinkedHashMap<>();

    public Map<Product, Integer> getMandje() {
        return mandje;
    }

    public void add(Product product, int aantal) {
        controleerProduct(product);
        controleerAantal(aantal);
        if (mandje.containsKey(product)){
            mandje.put(product, mandje.get(product) + aantal);
        }
        else
            mandje.put(product, aantal);
    }
    private void controleerProduct(Product product) {
        if (product == null)
            throw new NullPointerException("product moet ingevuld worden");
    }
    private void controleerAantal(int aantal){
        if (aantal <= 0) {
            throw new IllegalArgumentException("aantal moet positief zijn");
        }
    }
    public void set(Product product, int aantal) {
        controleerProduct(product);
        controleerAantal(aantal);
        controleerProductZitInMandje(product);
        mandje.put(product, mandje.get(product) + aantal);
    }
    private void controleerProductZitInMandje(Product product){
        if (!mandje.containsKey(product)) {
            throw new IllegalArgumentException(
                    "product komt niet voor in mandje");
        }
    }
    public void remove(Product product){
        controleerProduct(product);
        controleerProductZitInMandje(product);
        mandje.remove(product);
    }
    public void clear(){
        mandje.clear();
    }
    public BigDecimal getTotalePrijs(){
        BigDecimal totaal = BigDecimal.ZERO;
        for (var entry : mandje.entrySet()){
            totaal = totaal.add(entry.getKey().getPrijs()
                    .multiply(BigDecimal.valueOf(entry.getValue())));
        }
        return totaal;
    }

    @Override
    public String toString() {
        return mandje.toString();
    }

    //    private HashMap<Product, Integer> gekochteProdructen;
//
//    public Mandje(HashMap<Product, Integer> gekochteProdructen) {
//        Catalogus catalogus = new Catalogus();
//        for (Product product : catalogus.getProducten()){
//            gekochteProdructen.put(product, 0);
//        }
//        this.gekochteProdructen = gekochteProdructen;
//    }
//    public void add(Product product, int aantal){
//        if (gekochteProdructen.get(product) != null){
//            gekochteProdructen.put(product,
//                    gekochteProdructen.get(product) + aantal);
//        }
//    }
//    public void set(Product product, int aantal){
//        if (gekochteProdructen.get(product) != null){
//            gekochteProdructen.put(product, aantal);
//        }
//    }
//    public void remove(Product product){
//        if (gekochteProdructen.get(product) != null){
//            gekochteProdructen.put(product, 0);
//        }
//    }
//    public void clear(){
//        for (HashMap product : gekochteProdructen){
//            product.
//
//        }
//    }
}
