package be.vdab.jpfhfdst21;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ActricesTellen {
    private static final Path PATH = Path.of("data/acteurs-actrices.csv");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            System.out.println(
                stream.filter(regel -> regel.endsWith("F"))
                    .mapToInt(regel -> 1)
                    .sum());
        }
        catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
}
