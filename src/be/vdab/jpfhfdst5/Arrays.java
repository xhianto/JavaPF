package be.vdab.jpfhfdst5;

public class Arrays {
    public static void main(String[] args) {
        var getallen = new int[5];
        int som = 0;
        for (int i = 0; i < 5; i++){
            getallen[i] = (int)(100 * Math.random() + 1);
            som += getallen[i];
        }
        for (int getal : getallen){
            System.out.print("[" + getal + "]");
        }
        System.out.println("");
        System.out.println("Som van de array: " + som);
        System.out.println("Gemiddelde van de array: " + (float)som/getallen.length);
    }
}
