package be.vdab.jpfhfdst21;

import java.util.Arrays;

public class StreamArray {
    public static void main(String[] args) {
        var groenten = new String[]{ "tomaat", "sla", "ui", "prei"};
        var stream = Arrays.stream(groenten);
        stream.forEach(groente -> System.out.println(groente));
    }
}
