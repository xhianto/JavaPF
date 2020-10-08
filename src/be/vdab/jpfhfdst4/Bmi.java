package be.vdab.jpfhfdst4;

public class Bmi {
    public static void main(String[] args) {
        float gewicht = 75.7f;
        float lengte = 1.70f;
        float bmi;

        bmi = gewicht / (lengte * lengte);
        System.out.println("De bodymassindex is " + bmi);
    }
}
