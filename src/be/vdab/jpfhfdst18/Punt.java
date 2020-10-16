package be.vdab.jpfhfdst18;

import java.io.Serializable;

public class Punt implements Serializable {
    private final int x;
    private final int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
