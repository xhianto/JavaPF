package be.vdab.jpfhfdst21;

import java.util.stream.IntStream;

public class StreamSum {
    public static void main(String[] args) {
        var stream = IntStream.of(1, 3, 4, 7);
        System.out.println("Som is:" + stream.sum());
    }
}
