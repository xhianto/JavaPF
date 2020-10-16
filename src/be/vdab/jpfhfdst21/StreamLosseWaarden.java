package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamLosseWaarden {
    public static void main(String[] args) {
        Stream.of("Adam", "Eva").forEach(naam -> System.out.println(naam));
    }
}
