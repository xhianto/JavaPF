package be.vdab.jpfhfdst21;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSorteren {
    public static void main(String[] args) {
        Stream.of("sla", "wortel", "kool", "biet")
                .sorted((groente1, groente2)
                        -> groente1.length() - groente2.length())
//                        -> groente2.compareTo(groente1))
                .forEach(groente -> System.out.println(groente));

//      Sorteren op meerder criteria
        Comparator<String> comparator = (groente1, groente2)
                -> groente1.length() - groente2.length();
        comparator = comparator.thenComparing((groente1, groente2)
                -> groente1.compareTo(groente2));
        Stream.of("sla", "wortel", "kool", "biet")
                .sorted(comparator)
                .forEach(groente -> System.out.println(groente));
    }
}
