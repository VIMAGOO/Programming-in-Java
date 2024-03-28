package stringexercicis;

import java.util.Scanner;

/**
 * Programa que demana una cadena de text, i mostra les seves paraules en línies diferents
 * @author vimago
 */
public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix una cadena de text: ");
        String cadena = sc.next();
        //String cadena = sc.nextLine();
        System.out.println("La cadena que has entrat és: "+cadena);
        char esp = ' ';
        int indexPrevi = -1; //inicialitzem des de -1
        int index = 0;
        String paraula;
        
        while (index != -1 && index < cadena.length()) {
            index = cadena.indexOf(esp, indexPrevi+1); //per aquesta raó hem inicialitzat amb -1.
            if (index < 0) {
                paraula = cadena.substring(indexPrevi+1);
            } else {
                paraula = cadena.substring(indexPrevi+1, index);
                indexPrevi = index;    
            }
            System.out.println(paraula);
        }
        
                
    }
    
}
