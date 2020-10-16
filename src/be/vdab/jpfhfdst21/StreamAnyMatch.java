package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamAnyMatch {
    public static void main(String[] args) {
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .anyMatch(groente -> groente.length() == 4)
        );
    }
}
