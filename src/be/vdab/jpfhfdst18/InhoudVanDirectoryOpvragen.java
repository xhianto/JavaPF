package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class InhoudVanDirectoryOpvragen {
    public static void main(String[] args) {
        try (var stream =
                     Files.newDirectoryStream(Path.of("data"))) {
            for (var path : stream) {
                System.out.print(path);
                System.out.println(Files.isDirectory(path) ?
                        ":directory" : ":bestand");
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
