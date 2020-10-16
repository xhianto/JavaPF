package be.vdab.jpfhfdst21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToLIst {
    public static List<String> gesorteerdeGroente() {
        return Stream.of("sla", "wortel", "kool", "biet")
                .sorted()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(gesorteerdeGroente());
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .sorted()
                        .collect(Collectors.toList())
        );
    }
}
