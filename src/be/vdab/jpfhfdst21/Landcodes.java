package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Landcodes {
    private static Path PATH = Path.of("data/landcodes.txt");

    private static String getLand(String landcode) {
        String land = "Geen resultaat gevonden";
        try (var reader = Files.newBufferedReader(PATH)) {
            for (String regel; (regel = reader.readLine()) != null;) {
                if (regel.substring(0, 2).toLowerCase()
                        .equals(landcode.toLowerCase())){
                    land = regel.substring(3);
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return land;
    }

    public static void main(String[] args) {
        System.out.println("Tik een landcode in");
        Scanner scanner = new Scanner(System.in);
        System.out.println(getLand(scanner.nextLine()));
    }
}
