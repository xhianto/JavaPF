package be.vdab.jpfhfdst19;

public class RandomArray {
    private double[] randomGetallen = new double[1000000];

    public RandomArray() {
        for (int i = 0; i < randomGetallen.length; i++){
            randomGetallen[i] = Math.random() * 100;
        }
    }

    public double[] getRandomGetallen() {
        return randomGetallen;
    }
}