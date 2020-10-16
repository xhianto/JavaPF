package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryHernoemen {
    public static void main(String[] args) {
        try{
            Files.move(Path.of("teksten"), Path.of("afbeeldingen"));
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
