package be.vdab.jpfhfdst18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BestandInBlokkenLezen {
    public static void main(String[] args) {
        try {
            var reader =
                    Files.newBufferedReader(
                            Path.of("data/insecten1.csv"));
            try {
                var regel = reader.readLine();
                while (regel != null) {
                    System.out.println(regel);
                    regel = reader.readLine();
                }
            }
            catch (IOException ex) {
                System.out.println(ex);
            }
            finally {
                reader.close();
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
