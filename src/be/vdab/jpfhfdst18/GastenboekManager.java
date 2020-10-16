package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager {
    public void write(Gastenboek gastenboek) {
        try (var stream = new ObjectOutputStream( Files.newOutputStream(
                Path.of("data/gastenboek.ser")))) {
            stream.writeObject(gastenboek);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    public Gastenboek read() {
        try (var stream = new ObjectInputStream(
                Files.newInputStream(
                        Path.of("data/gastenboek.ser")));
        ){
            return (Gastenboek) stream.readObject();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return new Gastenboek();
    }
}