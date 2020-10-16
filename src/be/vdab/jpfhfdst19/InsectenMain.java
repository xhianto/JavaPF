package be.vdab.jpfhfdst19;

public class InsectenMain {
    public static void main(String[] args) {
        var lezer1 = new InsectenLezer(
                "data/insecten1.csv", System.out);
        var thread1 = new Thread(lezer1);
        InsectenLezer lezer2 = new InsectenLezer(
                "data/insecten2.csv", System.out);
        var thread2 = new Thread(lezer2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(lezer1.getAantalRegels());
        System.out.println(lezer2.getAantalRegels());
        System.out.println(lezer1.getAantalRegels() +
                lezer2.getAantalRegels() + " regels");
    }
}
