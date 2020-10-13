package be.vdab.jpfhfdst17;

import java.util.LinkedHashSet;

public class VBLinkedHashSet {
    public static void main(String[] args) {
        var lhs = new LinkedHashSet<String>();
        lhs.add("fiets");
        lhs.add("even");
        lhs.add("dak");
        lhs.add("citroen");
        lhs.add("boom");
        lhs.add("aap");
        lhs.add(null);
        lhs.add("dak");

        System.out.println("Voorbeeld van een HashSet");
        for (var woord : lhs) {
            //System.out.println(woord + ((woord.length() <= 3) ?
            // "\t\t" : "\t") + woord.hashCode());
            System.out.println(woord);
        }
    }
}
