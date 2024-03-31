import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que demani dos valors enters n i m, creï un array amb n elements i
 * escrigui el valor m a totes les seves posicions. Mostrar al final l’array.
 *
 * @author vimago
 */
public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int n = 0;
        do {
        System.out.println("Introdueix el primer enter n:");
        n = sc.nextInt();
        } while(n < 0);
           System.out.println("Introdueix el segon enter m:");
           int m = sc.nextInt(); 
        
        int[] x = new int[n];
        Arrays.fill(x, m);
        System.out.println(Arrays.toString(x));
        
        } catch (InputMismatchException e) {
            System.out.println("No has introduït un número enter.");
        }
        
        
    }

}