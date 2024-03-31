package recursivitat.exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demana a l'usuari un nombre enter no negatiu, el valida, calcula de forma
 * recursiva el factorial i mostra el resultat.
 *
 * @author vimago
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //try-catch per si l'usuari introdueix una dada incorrecta
        try {
            System.out.println("Entra n: ");
            int n = sc.nextInt();
            int factorial = factorial(n);
            //printf és igual a format.
            System.out.printf("%d! = %d%n", n, factorial);
        } catch (InputMismatchException e) {
            System.out.println("Has d'introduïr un nombre enter!");
            //Netegem la variable mal llegida utilitzada per l'usuari del
            //programa perquè, encara que estigui malament, el programa
            //guarda la dada.
            sc.next();
        }
    }

    /**
     * Calcula de forma recursiva el factorial del paràmetre que s'ha rebut
     *
     * @param n --> el número del qual es calcula el factorial
     * @return --> el valor del factorial del paràmetre
     */
    private static int factorial(int n) {
        int result = 1;
        if (n >= 0) {
            if (n == 0) { //cas base
                result = 1; //cas final
            } else {
                result = n * factorial(n - 1);
            }
        } else {
            System.out.println("Has d'introduïr una dada major o igual a 0.");
        }

        return result;

    }

}
