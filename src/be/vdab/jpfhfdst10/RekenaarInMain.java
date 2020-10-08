package be.vdab.jpfhfdst10;

import be.vdab.jpfhfdst7.Getal;

import java.util.Scanner;

public class RekenaarInMain {
    public static void main(String[] args) {
        System.out.println("Voer een reken som in: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder invoer = new StringBuilder(scanner.nextLine());
        if (invoer.length() != 0){
            if (invoer.charAt(invoer.length() - 1) >= '0' &&
                    invoer.charAt(invoer.length() - 1) <= '9')
                invoer.append('+');
            invoer.insert(0, '=');
        }
        char[] bewerkingstekens = new char[] { '+', '-', '*', '/' };
        int laatsteBewerkingsTeken = 0;
        double antwoord = 0;
        for (int i = 0; i < invoer.length(); i++){
            if (invoer.charAt(i) == '+' || invoer.charAt(i) == '-' ||
                    invoer.charAt(i) == '*' || invoer.charAt(i) == '/'){
                int getal = Integer.parseInt(invoer.substring((laatsteBewerkingsTeken + 1), i));
                if (laatsteBewerkingsTeken == 0){
                    antwoord += getal;
                    laatsteBewerkingsTeken = i;
                }
                else{
                    switch (invoer.charAt(laatsteBewerkingsTeken)){
                        case '+':
                            antwoord += getal;
                            break;
                        case '-':
                            antwoord -= getal;
                            break;
                        case '*':
                            antwoord *= getal;
                            break;
                        case '/':
                            antwoord /= getal;
                    }
                    laatsteBewerkingsTeken = i;
                }
            }
        }
        System.out.println(antwoord);
    }
}
