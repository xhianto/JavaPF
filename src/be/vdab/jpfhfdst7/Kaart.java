package be.vdab.jpfhfdst7;

public class Kaart {

    String[] kleuren = new String[] {"harten", "ruiten", "klaveren", "schoppen"};
    String[] rangen = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas"};
    private int kleur;
    private int rang;

    public int getRang() {
        return rang;
    }

    public Kaart() {
        this.kleur = (int)(Math.random() * 4);
        this.rang = (int)(Math.random() * 13);
    }
    public void printKaart(){
        System.out.println(kleuren[kleur] + " " + rangen[rang]);
    }
    public boolean isHogerDan(Kaart kaart){
        if (kleur < kaart.kleur)
            return true;
        else if (kleur == kaart.kleur)
            if (rang > kaart.rang)
                return true;
        return false;
    }
}

