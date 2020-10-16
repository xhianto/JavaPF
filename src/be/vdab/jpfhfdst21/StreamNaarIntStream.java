package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamNaarIntStream {
    public static void main(String[] args) {
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                    .mapToInt(groente -> groente.length())
                    .sum());
    }
}
