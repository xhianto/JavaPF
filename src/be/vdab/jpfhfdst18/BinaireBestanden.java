package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaireBestanden {
    public static void main(String[] args) {
        try (var input =
                     Files.newInputStream(Path.of("data/duimop.jpg"));
             var output =
                     Files.newOutputStream(Path.of("data/thumbup.jpg"))) {
            for (int eenByte; (eenByte = input.read()) != -1;) {
                output.write(eenByte);
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
