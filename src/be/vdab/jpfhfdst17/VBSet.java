package be.vdab.jpfhfdst17;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;

public class VBSet {
    public static void main(String[] args) {
        var hs = new HashSet<String>();
        hs.add("fiets");
        hs.add("even");
        hs.add("dak");
        hs.add("citroen");
        hs.add("boom");
        hs.add("aap");
        hs.add(null);
        hs.add("dak");

        System.out.println("Voorbeeld van een HashSet");
        for (var woord : hs) {
            //System.out.println(woord + ((woord.length() <= 3) ?
            // "\t\t" : "\t") + woord.hashCode());
            System.out.println(woord);
        }
    }
}
