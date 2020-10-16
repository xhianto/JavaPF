package be.vdab.jpfhfdst18;

import java.nio.file.Files;
import java.nio.file.Path;

public class ControleerLocatie {
    public static void main(String[] args) {
        System.out.println(Files.exists(Path.of("data")));
    }
}
