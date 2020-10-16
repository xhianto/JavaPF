package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BestandLezenInHetInterneGeheugen {
    public static void main(String[] args) {
        try {
            var regels =
                    Files.readAllLines(Path.of("data/insecten1.csv"));
            for (var regel : regels) {
                System.out.println(regel);
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
