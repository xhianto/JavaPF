package be.vdab.jpfhfdst8;

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
