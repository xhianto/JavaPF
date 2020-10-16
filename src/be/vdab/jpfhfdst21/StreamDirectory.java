package be.vdab.jpfhfdst21;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDirectory {
    private static final Path PATH = Path.of("data");

    public static void main(String[] args) {
        try (var stream = Files.list(PATH)) {
            stream.forEach(entry -> System.out.println(entry.getFileName()));
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
