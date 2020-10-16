package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryMaken {
    public static void main(String[] args) {
        try {
            Files.createDirectory(Path.of("teksten"));
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
