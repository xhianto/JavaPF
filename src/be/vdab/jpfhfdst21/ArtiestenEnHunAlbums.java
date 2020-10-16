package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.Comparator;
//import java.util.Map;
import java.util.stream.Collectors;

public class ArtiestenEnHunAlbums {
    private static final Path PATH =
            Path.of("data/albumsartists.txt");
    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            var artiesten =
                    stream.collect(Collectors.groupingBy(
                    artists -> artists.split(",")[1]));
            artiesten.entrySet().stream()
                    .sorted((entry1, entry2)
                        -> entry1.getKey().compareTo(entry2.getKey()))
//                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .forEach(entry -> {
                        System.out.println(entry.getKey());
                        for (int i = 0; i < entry.getKey().length(); i++ )
                            System.out.print("=");
                        System.out.println();
                        entry.getValue().stream()
                                .map(album -> album.split(",")[0])
                                .forEach(System.out::println);
                        System.out.println();
                    });
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
