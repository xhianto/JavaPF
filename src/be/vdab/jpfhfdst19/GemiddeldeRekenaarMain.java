package be.vdab.jpfhfdst19;

public class GemiddeldeRekenaarMain {
    public static void main(String[] args) {
        var randomArray = new RandomArray();
        var gemiddelde1 = new GemiddeldeRekenaar(
                randomArray, 0, 500000);
        var gemiddelde2 = new GemiddeldeRekenaar(
                randomArray, 500000, 500000);
        var gemiddelde3 = new GemiddeldeRekenaar(
                randomArray, 0 , 1000000);
        var thread1 = new Thread(gemiddelde1);
        var thread2 = new Thread(gemiddelde2);
        var thread3 = new Thread(gemiddelde3);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException ex) {
            System.out.println(ex);
        }

        System.out.println("Gemiddelde van thread1 = " +
                gemiddelde1.getGemiddelde());
        System.out.println("Gemiddelde van thread2 = " +
                gemiddelde2.getGemiddelde());
        System.out.println("Gemiddelde van Array   = " +
                (gemiddelde1.getGemiddelde() +
                        gemiddelde2.getGemiddelde()) / 2);
        System.out.println("Check gemiddelde       = " +
                gemiddelde3.getGemiddelde());
    }

}
