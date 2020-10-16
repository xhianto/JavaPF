package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden {
    private static Path PATH = Path.of("data/sterrenbeelden.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.forEach(regel -> System.out.println(regel));
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
