import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Programa que creï un array de mida 100, l’ompli amb valors aleatoris enters
 * entre 1 i 10, pregunti un valor enter n i mostri a quines posicions hi ha el
 * valor n.
 *
 * @author vimago
 */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int [] x = new int[100];
        for (int i = 0; i < x.length; i++) {
            int numAleat = ran.nextInt(0,11);
            x[i] = numAleat;
        }
        System.out.println(Arrays.toString(x));
        System.out.println("Introdueix un número enter entre 0 i 10: ");
        int numUsuari = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        System.out.println("El seu número està a les posicions: ");
        for (int i = 0; i < x.length; i++) {
            if (x[i] == numUsuari) {
                sb.append(i+", ");
            }
        }
        sb.deleteCharAt(sb.lastIndexOf(", "));
        System.out.print(sb.toString()+".\n");
        
    }

}