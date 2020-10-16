package be.vdab.jpfhfdst21;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCombinerenTotEen {
    public static void main(String[] args) {
        Stream.of(Stream.of("Joe", "Jack"), Stream.of("William", "Avarell"))
            .flatMap(stream -> stream)
            .forEach(voornaam -> System.out.println(voornaam));

        Stream.of("The lord of the rings", "The hobbit")
                .map(titel -> titel.split(" "))
                .flatMap(array -> Arrays.stream(array))
                .map(woord -> woord.toLowerCase())
                .distinct()
                .sorted()
                .forEach(woord -> System.out.println(woord));
    }
}
