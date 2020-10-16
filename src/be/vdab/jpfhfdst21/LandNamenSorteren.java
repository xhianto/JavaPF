package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LandNamenSorteren {
    private static Path PATH = Path.of("data/landcodes.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)){
            stream.map(regel -> regel.split(" ", 2)[1])
                    .sorted()
                    .forEach(System.out::println);
        }
        catch (IOException ex){
            ex.printStackTrace(System.err);
        }
    }
}
