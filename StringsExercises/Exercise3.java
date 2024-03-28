package string.exercicis;

import java.util.Scanner;

/**
 * Programa que demana una frase i l'escriu passant a majúscules la primera 
 * lletra de cada paraula.
 * @author vimago
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix una frase: ");
        String frase = sc.next().toLowerCase();
        char esp = ' ';
        int indexPrevi = -1; //inicialitzem des de -1
        int index = 0;
        int i = 0;
        String paraula;
        System.out.println("==RESULTAT==");
        while (index != -1 && index < frase.length()) {
            index = frase.indexOf(esp, indexPrevi+1); //per aquesta raó hem inicialitzat amb -1.
            if (index < 0) {
                paraula = frase.substring(indexPrevi+1, frase.length());
                paraula = paraula.toUpperCase().charAt(0)+paraula.substring(1);
            } else {
                paraula = frase.substring(indexPrevi+1, index);
                indexPrevi = index;
                i++;
                paraula = paraula.toUpperCase().charAt(0)+paraula.substring(1);
            }
            if (i == 1) {
                System.out.print(paraula);
            } else {
                System.out.print(" "+paraula);
            }
            
        }
    }
    
}
