package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamOneindigeReeksWaarden {
    public static void main(String[] args) {
        Stream.iterate(1, vorigeGetal -> vorigeGetal + 2)
                .forEach(onevenGetal -> System.out.println(onevenGetal));
    }
}
