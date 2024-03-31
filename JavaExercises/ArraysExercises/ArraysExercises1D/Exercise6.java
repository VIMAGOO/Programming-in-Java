import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Programa per crear un array amb 100 nombres aleatoris enters entre 0 i 1000,
 * demani a l'usuari un número real entre 0 i 1000 i mostri quants valors de
 * l'array són menors que el número introduït.
 *
 * @author vimago
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int [] x = new int[100];
        System.out.println("Introdueix un número enter entre 0 i 1000: ");
        int numUsuari = sc.nextInt();
        int numMenor = 0;
        for (int i = 0; i < x.length; i++) {
            int numAleat = ran.nextInt(0,1001);
            x[i] = numAleat;
            if (numAleat < numUsuari) {
                numMenor++;
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.format("%d números de l'array són menors que el número que has introduït. \n", numMenor);
    }

}