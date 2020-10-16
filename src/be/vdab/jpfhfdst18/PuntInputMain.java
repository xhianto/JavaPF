package be.vdab.jpfhfdst18;

import java.io.InputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PuntInputMain {
    public static void main(String[] args) {
        try (var stream =
                new ObjectInputStream(Files.newInputStream(
                        Path.of("data/punt.ser")));
        ){
            var punt = (Punt) stream.readObject();

            System.out.println(punt);
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
