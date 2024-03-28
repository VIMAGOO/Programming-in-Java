import java.util.Scanner;

/**
 * Aquest codi demana a l'usuari un nombre
 * Diu si el nombre és positiu o negatiu (incloent el 0 com a positiu).
 * @author vimago
 */
public class Exercise4PositiveNegative {

    public static void main(String[] args) {
        
Scanner lector = new Scanner(System.in);
System.out.println("Introdueix un número:");
int num = lector.nextInt();

if (num>=0){
    System.out.println("El número és positiu.");
} else {
    System.out.println("El número és negatiu.");
}
    }
    
}