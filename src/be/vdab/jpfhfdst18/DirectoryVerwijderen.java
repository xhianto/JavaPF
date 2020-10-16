package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryVerwijderen {
    public static void main(String[] args) {
        try {
            Files.delete(Path.of("afbeeldingen"));
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
