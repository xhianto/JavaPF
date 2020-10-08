package be.vdab.jpfhfdst4;

public class BTWnummer {
    public static void main(String[] args) {
        int btwNummer = 213252520;
        int deeltal = btwNummer / 100;
        byte rest = (byte) (deeltal % 97);
        byte laaste2Cijfers = (byte) (btwNummer % 100);
        System.out.println(laaste2Cijfers == 97 - rest);
    }
}
