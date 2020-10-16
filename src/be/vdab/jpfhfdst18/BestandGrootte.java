package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BestandGrootte {
    public static void main(String[] args) {
        try {
            System.out.println(
                    Files.size(Path.of("data/duimop.jpg"))
            );
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
