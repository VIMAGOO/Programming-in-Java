package string.exercicis;

import java.util.Scanner;

/**
 * Programa que demana una frase per teclat, l'escriu del dret i del revès 
 * i indica si és un palíndrom (ignorant espais i no diferenciant majúscules 
 * i minúscules).
 * @author vimago
 */
public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix una frase: ");
        String frase = sc.next();
        StringBuilder sb = new StringBuilder(frase);
        System.out.println("Frase dreta");
        System.out.println(sb);
        System.out.println("Frase a la inversa: ");
        System.out.println(sb.reverse());
        System.out.println("És palíndrom o no?");
        boolean esPalindrom = esPalindrom(frase);
        if (esPalindrom) {
            System.out.println("És palíndrom.");
        } else {
            System.out.println("No és palíndrom.");
        }
    }
    
    public static boolean esPalindrom(String frase) {
        if (frase.length()<=0) {
        } else {
            if (frase.charAt(0) == frase.charAt(frase.length()-1)) {
                boolean palindrom = esPalindrom(frase.substring(1, frase.length()-1));
            } else {
                return false;
            }
        }
        return true;
    }
    
}
