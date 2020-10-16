package be.vdab.jpfhfdst21;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroeperen {
    public static void main(String[] args) {
        var groentenPerLengte =
                Stream.of("sla", "kool", "wortel", "biet")
                .collect(Collectors.groupingBy(
                        groente -> groente.length()));
        groentenPerLengte.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().stream()
                            .forEach(groente -> System.out.println(groente));
                    System.out.println();
                });
    }
}
