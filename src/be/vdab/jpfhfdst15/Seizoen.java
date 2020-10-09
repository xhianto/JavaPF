package be.vdab.jpfhfdst15;

public enum Seizoen {
    LENTE(3),
    ZOMER(6),
    HERFST(9),
    WINTER(12);
    private final int beginmaand;

    Seizoen(int beginmaand) {
        this.beginmaand = beginmaand;
    }

    public int getBeginmaand() {
        return beginmaand;
    }
}
