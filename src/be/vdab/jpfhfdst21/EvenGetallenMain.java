package be.vdab.jpfhfdst21;

public class EvenGetallenMain {
    public static void main(String[] args) {
        EvenGetallen evengetallen =
                getal -> getal % 2 == 0;
        System.out.println(evengetallen.isEven(7));
    }
}
