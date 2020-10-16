package be.vdab.jpfhfdst21;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        var groenten =
                Stream.of("sla", "wortel", "kool", "biet");
        var stream = groenten.filter(
                groente -> groente.length() == 4);
        stream.forEach(groenteMet4Letters ->
                System.out.println(groenteMet4Letters));
    }
}
