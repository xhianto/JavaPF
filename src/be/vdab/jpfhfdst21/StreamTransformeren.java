package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamTransformeren {
    public static void main(String[] args) {
        Stream.of("sla", "wortel", "kool", "biet")
                .map(groente -> groente.length())
                .forEach(System.out::println);

        Stream.of(new Rechthoek(3,4),
                new Rechthoek(5,6),
                new Rechthoek(7,8))
                .map(oppervlakte -> oppervlakte.getOppervlakte())
                .forEach(System.out::println);
    }
}
