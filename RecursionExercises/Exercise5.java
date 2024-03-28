package recursivitat.exercicis;

import java.util.Scanner;

/**
 * Programa que entra una frase (sense espais) i comprova de forma recursiva si
 * és un palíndrom.
 *
 * @author vimago
 */
public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la frase");
        String frase = sc.nextLine();
        if (esPalindrom(frase) == true) {
            System.out.println("És palíndrom.");
        } else {
            System.out.println("No és palíndrom.");
        }
    }

    public static boolean esPalindrom(String text) {
        if (text.length() <= 1) {
            return true;
        } else {
            return text.charAt(0) == text.charAt(text.length() - 1) && esPalindrom(text.substring(1, text.length() - 1));
        }
    }
}
