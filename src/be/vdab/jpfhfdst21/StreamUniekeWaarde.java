package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamUniekeWaarde {
    public static void main(String[] args) {
        Stream.of("sla", "kool", "wortel", "biet", "sla")
                .distinct()
                .forEach(System.out::println);
    }
}
