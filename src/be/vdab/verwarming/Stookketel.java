package be.vdab.verwarming;

import be.vdab.util.Vervuiler;

public class Stookketel implements Vervuiler {
    private float CONorm;

    public float getCONorm() {
        return CONorm;
    }

    public void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }


    @Override
    public double berekenVervuiling() {
        return CONorm * 100;
    }
}
