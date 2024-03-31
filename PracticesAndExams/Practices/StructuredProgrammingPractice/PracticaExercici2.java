import java.util.Scanner;
/**
 * Programa que llegeix de l'usuari un número enter,
 * amb aquest número enter el programa treballarà mitjançant if
 * Diurà a l'usuari si el número introduït és divisible per 4 i/o 6 
 * o si no és divisible per cap d'aquests.
 * @author vima2670
 */
public class PracticaExercici2 {

    public static void main(String[] args) {
        //scanner.
        Scanner scanner = new Scanner(System.in);
        //Establim el missatge de sortida que rebrà l'usuari.
        //Establim també les variables perque el programa llegeixi la dada introduïda.
        System.out.println("DIVISIBLE O NO DIVISIBLE entre 4 i 6?:");
        System.out.println("Introdueix el número enter:");
        int enter = scanner.nextInt();
        
        //if
        //Si és divisible entre 4.
        if (enter%4==0){
            //Si és divisible entre 6.
            if (enter%6==0){
                System.out.println("Número és divisible entre 4 i 6.");
            //Si no és divisible entre 6.
            } else {
                System.out.println("Número és divisible entre 4 i no entre 6.");
            }
        //Si no és divisible entre 4.
        } else {
            //Si és divisible entre 6.
            if (enter%6==0){
                System.out.println("Número és divisible entre 6 i no entre 4.");
            //Si no és divisible entre 6.
            } else {
                System.out.println("Número no és divisible entre 4 ni entre 6.");
            }
        }
    }  
}
