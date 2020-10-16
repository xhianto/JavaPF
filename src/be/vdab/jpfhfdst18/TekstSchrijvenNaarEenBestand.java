package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TekstSchrijvenNaarEenBestand {
    public static void main(String[] args) {
        try (var writer =
            Files.newBufferedWriter(Path.of("data/naam.txt"))) {
                writer.write("jean");
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
