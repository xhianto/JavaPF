package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Vicky {
    private static final Path PATH = Path.of("data/acteurs-actrices.csv");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            System.out.println(
                stream.map(regel -> regel.split(";")[0])
                    .anyMatch(voornaam -> voornaam.equals("Vicki")));
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
