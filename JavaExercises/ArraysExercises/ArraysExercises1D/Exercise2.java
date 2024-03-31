import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que demani N números enters per teclat, els emmagatzemi en un array
 * i després recorri l'array per calcular per separat la suma dels parells i els
 * senars. El programa mostrarà aquestes sumes. (N introduït per l’usuari)
 *
 * @author vimago
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina longitud vols que tingui l'array?:");
        int longitud = sc.nextInt();
        int[] x = new int[longitud];
        x = llegirArray(longitud);
        int[] sumes = new int[2];
        sumes = sumaParellsSenars(x);
        System.out.println(Arrays.toString(sumes));
        System.out.format("Suma parells: %d \n", sumes[0]);
        System.out.format("Suma imparells: %d \n", sumes[1]);
    }

    public static int[] llegirArray(int longitud) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[longitud];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Entra l'element " + i + ":");
            int valor = sc.nextInt();
            x[i] = valor;
        }
        return x;
    }

    public static int[] sumaParellsSenars(int[] x) {
        int[] sumes = new int[2];
        int sumaParells = 0;
        int sumaImparells = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                sumaParells += x[i];
            } else {
                sumaImparells += x[i];
            }
        }
        sumes[0] = sumaParells;
        sumes[1] = sumaImparells;

        return sumes;
    }

}