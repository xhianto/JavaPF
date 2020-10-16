package be.vdab.jpfhfdst21;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println(
            Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9),
                BigDecimal.valueOf(0.5))
                .reduce(BigDecimal.ZERO, (vorigeSom, getal) -> vorigeSom.add(getal)));

        // als een Optional<BigDecimal>
        Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9),
                BigDecimal.valueOf(0.5))
                .reduce((vorigeSom, getal) -> vorigeSom.add(getal))
                .ifPresent(som -> System.out.println(som));
    }
}
