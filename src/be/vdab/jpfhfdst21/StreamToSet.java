package be.vdab.jpfhfdst21;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToSet {
    public static Set<String> gesorteerdeGroente() {
        return Stream.of("sla", "wortel", "kool", "biet")
                .sorted()
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(gesorteerdeGroente());
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .collect(Collectors.toSet())
        );
    }
}
