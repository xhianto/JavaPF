package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ZoekSterrenbeeld {
    public static void main(String[] args) {
        System.out.println("Tik een sterrenbeeld in:");
        Scanner scanner = new Scanner(System.in);
        String invoer = scanner.nextLine();
        try (var stream =
                     Files.lines(Path.of("data/sterrenbeelden.txt"))) {
            stream.filter(sterrenbeeldMetInvoer -> sterrenbeeldMetInvoer
                    .toLowerCase().contains(invoer.toLowerCase()))
                    .forEach(regel -> System.out.println(regel.toUpperCase()));
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
