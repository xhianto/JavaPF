package be.vdab.jpfhfdst21;

import java.util.stream.IntStream;

public class StreamGetallenReeks {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(getal -> System.out.println(getal));
        IntStream.range(1,10)
                .forEach(getal -> System.out.println(getal));
    }
}
