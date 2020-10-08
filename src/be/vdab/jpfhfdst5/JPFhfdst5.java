package be.vdab.jpfhfdst5;

public class JPFhfdst5 {
    public static void main(String[] args) {
        System.out.println("--- impliciete initialisatie arry ---");
        var getallen = new int[3];
        System.out.println("1e element uit int tabel:" + getallen[0]);
        System.out.println("2e element uit int tabel:" + getallen[1]);
        System.out.println("3e element uit int tabel:" + getallen[2]);
        System.out.println("");

        var chars = new char[3];
        System.out.println("1e element uit int tabel:" + chars[0]);
        System.out.println("2e element uit int tabel:" + chars[1]);
        System.out.println("3e element uit int tabel:" + chars[2]);
        System.out.println("");

        var vlaggen = new boolean[3];
        System.out.println("1e element uit int tabel:" + vlaggen[0]);
        System.out.println("3e element uit int tabel:" + vlaggen[2]);
        System.out.println("2e element uit int tabel:" + vlaggen[1]);
        System.out.println("");

        var kommagGetallen = new float[3];
        System.out.println("1e element uit int tabel:" + kommagGetallen[0]);
        System.out.println("2e element uit int tabel:" + kommagGetallen[1]);
        System.out.println("3e element uit int tabel:" + kommagGetallen[2]);
        System.out.println("");

        var namen = new String[3];
        System.out.println("1e element uit int tabel:" + namen[0]);
        System.out.println("2e element uit int tabel:" + namen[1]);
        System.out.println("3e element uit int tabel:" + namen[2]);
        System.out.println("");
    }
}
