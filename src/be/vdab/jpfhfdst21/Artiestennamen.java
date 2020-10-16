package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Artiestennamen {
    private static Path PATH = Path.of("data/albumsartists.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.map(regel -> (regel.split(",")[1]))
                    .sorted()
                    .distinct()
                    .forEach(System.out::println);
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
