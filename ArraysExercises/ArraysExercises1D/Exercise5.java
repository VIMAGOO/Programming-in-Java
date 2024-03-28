import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que demani dos valors enters a i b, creï un array que contingui tots
 * els valors entre a i b (tots dos inclosos) i el mostri per pantalla.
 *
 * @author vimago
 */
public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer valor (més gran): ");
        int a = sc.nextInt();
        System.out.println("Introdueix el segon valor (més petit): ");
        int b = sc.nextInt();
        int[] x = new int[(a - b) + 1];
        System.out.println(b);
        for (int i = 0; i < x.length; i++) {

            if (i != 0) {
                b += 1;
                x[i] = b;
            } else {
                x[0] = b;
            }
        }

        System.out.println(Arrays.toString(x));
    }

}