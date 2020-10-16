package be.vdab.jpfhfdst21;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringJoining {
    public static void main(String[] args) {
        System.out.println(Stream.of("sla", "wortel", "kool", "biet")
        .collect(Collectors.joining(", ")));
    }
}
