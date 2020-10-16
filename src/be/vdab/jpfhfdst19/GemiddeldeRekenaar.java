package be.vdab.jpfhfdst19;

public class GemiddeldeRekenaar implements Runnable {
    private RandomArray randomArray;
    private final int begin;
    private final int aantalIteraties;
    private double gemiddelde;

    public GemiddeldeRekenaar(RandomArray randomArray, int begin, int aantalIteraties) {
        this.randomArray = randomArray;
        this.begin = begin;
        this.aantalIteraties = aantalIteraties;
    }

    public double getGemiddelde() {
        return gemiddelde;
    }

    @Override
    public void run() {
        double totaal = 0;
        for (int i = begin; i < (begin + aantalIteraties); i++){
            totaal += randomArray.getRandomGetallen()[i];
        }
        gemiddelde = totaal / aantalIteraties;
    }
}
