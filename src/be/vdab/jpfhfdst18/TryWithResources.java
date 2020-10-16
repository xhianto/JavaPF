package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResources {
    public static void main(String[] args) {
        try (var reader = Files.newBufferedReader(
                Path.of("data/insecten1.csv"))){
            for (String regel ; (regel = reader.readLine()) != null;) {
                System.out.println(regel);
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
