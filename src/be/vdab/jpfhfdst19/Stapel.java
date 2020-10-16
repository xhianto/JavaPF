package be.vdab.jpfhfdst19;

import java.util.concurrent.atomic.AtomicInteger;

public class Stapel {
    private final AtomicInteger aantalPannenkoeken = new AtomicInteger();

    public void voegPannenkoekToe(){
        aantalPannenkoeken.incrementAndGet();
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken.intValue();
    }
}
