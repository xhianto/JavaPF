package be.vdab.jpfhfdst21;

import java.util.List;

public class StreamList {
    public static void main(String[] args) {
        var groenten = List.of("tomaat", "sla", "ui", "prei");
        groenten.stream().forEach(groente -> System.out.println(groente));
    }
}
