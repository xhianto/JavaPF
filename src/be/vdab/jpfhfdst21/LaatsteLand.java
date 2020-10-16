package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LaatsteLand {
    private static final Path PATH = Path.of("data/landcodes.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.map(regel -> regel.substring(3))
                    .max((land1, land2) ->
                            land1.toLowerCase().compareTo(land2.toLowerCase()))
                    .ifPresent(land -> System.out.println(land));
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
