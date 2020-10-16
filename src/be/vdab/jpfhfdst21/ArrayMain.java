package be.vdab.jpfhfdst21;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        var groenten = new String[]{ "tomaat", "sla", "ui", "prei"};
        Arrays.sort(groenten, (groente1, groente2) ->
                groente1.length() - groente2.length());
                // -groente1.compareTo(groente2));
        System.out.println(Arrays.toString(groenten));
    }
}
