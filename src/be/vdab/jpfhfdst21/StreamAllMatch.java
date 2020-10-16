package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamAllMatch {
    public static void main(String[] args) {
        System.out.println(
        Stream.of("sla", "wortel", "kool", "biet")
                .allMatch(groente -> groente.length() == 4)
        );
    }
}

