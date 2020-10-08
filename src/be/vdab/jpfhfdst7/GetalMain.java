package be.vdab.jpfhfdst7;

public class GetalMain {
    public static void main(String[] args) {
        Getal getalA = new Getal(-45);
        System.out.println(getalA.absoluut());;
        System.out.println(getalA.som(90));
        getalA.add(100);
        System.out.println(getalA);
        float floatA = 2.65f;
        double doubleA = 1.45;
        System.out.println(getalA.som(floatA));
        System.out.println(getalA.som(doubleA));



    }
}
