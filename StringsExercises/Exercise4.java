package string.exercicis;

import java.util.Scanner;

/**
 * Programa que demana un nom complet (nom i dos cognoms) i escriu una paraula 
 * contenint les tres primeres lletres de cada part del nom, amb la 
 * primera de cada part en majúscula i les altres en minúscules.
 * Pablo Cardona Escrig
 * PabCarEsc
 * @author vimago
 */
public class Exercise4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix el teu nom i cognom: ");
        String frase = sc.next().toLowerCase();
        char esp = ' ';
        int indexPrevi = -1; //inicialitzem des de -1
        int index = 0;
        String paraula;
        System.out.println("==RESULTAT==");
        while (index != -1 && index < frase.length()) {
            index = frase.indexOf(esp, indexPrevi+1); //per aquesta raó hem inicialitzat amb -1.
            if (index < 0) {
                paraula = frase.substring(indexPrevi+1,indexPrevi+4);
                paraula = paraula.toUpperCase().charAt(0)+paraula.substring(1);
            } else {
                paraula = frase.substring(indexPrevi+1, indexPrevi+4);
                indexPrevi = index;
                paraula = paraula.toUpperCase().charAt(0)+paraula.substring(1);
            }
                System.out.print(paraula);
            
        }
    }
    
}
