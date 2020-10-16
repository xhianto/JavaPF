package be.vdab.jpfhfdst21;

import java.util.stream.IntStream;

public class StreamMin {
    public static void main(String[] args) {
        var stream = IntStream.of(1, 3, 4, 7);
        stream.min().ifPresent(kleinste -> System.out.println(kleinste));

    }
}
