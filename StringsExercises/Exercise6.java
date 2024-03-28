package string.exercicis;

import java.util.Scanner;

/**
 * Programa per llegir una frase per teclat i mostrar quantes vegades apareix
 * cadascuna de les vocals.
 *
 * @author vimago
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix una frase: ");
        String frase = sc.next();
        int vocals = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocals++;
            }
        }
        System.out.println("Hi ha un total de "+vocals+" vocals.");
    }

}
