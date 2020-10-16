package be.vdab.jpfhfdst21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        var talen = new LinkedHashMap<String, String>();
        talen.put("NL", "Nederlands");
        talen.put("FR", "Frans");
        talen.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() +
                        " : " + entry.getValue()));

    }

}
