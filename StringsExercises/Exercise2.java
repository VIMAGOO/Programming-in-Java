package string.exercicis;

import java.util.Scanner;

/**
 * Programa que demana dues cadenes de text i indica si són iguals i si 
 * ho són sense diferenciar entre majúscules i minúscules.
 * @author vimago
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix la primera línia de caràcters: ");
        String linia1 = sc.next();
        System.out.println("Introdueix la segona línia de caràcters: ");
        String linia2 = sc.next();
        
        if (linia1.equalsIgnoreCase(linia2)) {
            System.out.println("Les dues frases són iguals.");
        } else {
            System.out.println("Les dues frases són diferents.");
        }
    }
    
}
