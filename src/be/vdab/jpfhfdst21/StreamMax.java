package be.vdab.jpfhfdst21;

import java.util.stream.IntStream;

public class StreamMax {
    public static void main(String[] args) {
        var stream = IntStream.of(1, 3, 4, 7);
        stream.max().ifPresent(grootste -> System.out.println(grootste));
    }
}
