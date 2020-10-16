package be.vdab.jpfhfdst18;

import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryOfFile {
    public static void main(String[] args) {
        var data = Path.of("data");
        System.out.println(Files.isDirectory(data));
        System.out.println(Files.isRegularFile(data));
    }
}
