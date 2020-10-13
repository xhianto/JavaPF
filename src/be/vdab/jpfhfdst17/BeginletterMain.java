package be.vdab.jpfhfdst17;

import java.util.HashMap;

public class BeginletterMain {
    public static void main(String[] args) {
        String[] woorden = { "een", "twee", "drie",
                "vier", "vijf", "zes", "zeven", "acht", "negen", "tien" };
        var beginLetters = new HashMap<Character, Integer>();
        char beginchar;
        for (var woord : woorden){
            beginchar = woord.charAt(0);
            beginchar = Character.toLowerCase(beginchar);
            if (beginLetters.get(woord.charAt(0)) == null) {
                beginLetters.put(woord.charAt(0), 1);
            }
            else{
                beginLetters.put(woord.charAt(0),
                        beginLetters.get(woord.charAt(0)) + 1);
            }
        }
        System.out.println(
                "\nAantal woorden die beginnen met elke letter: " );
        System.out.println(beginLetters); //toString() HashMap wordt gebruikt
        System.out.println("size: " + beginLetters.size());
        System.out.println("isEmpty: " + beginLetters.isEmpty());
        System.out.println("------ Set van de keys ------");
        for (var c : beginLetters.keySet()) {
            System.out.println(c);
        }
        System.out.println("------ Set van de values ------");
        for (var i : beginLetters.values()) {
        System.out.println(i);
}
        System.out.println("------ Set van de map.entries ------");
        for (var entry : beginLetters.entrySet()) {
            System.out.print(entry); //toString() Map.Entry wordt gebruikt
                System.out.println(" of anders: " + entry.getKey() + " : " + entry.getValue() );
        }
    }
}

