import java.util.Scanner;
import java.util.Arrays;

/**
 * Programa que demani a l'usuari N números reals per teclat, els emmagatzemi
 * en un array i després mostri tots els valors de l'array, el nombre d’elements, la
 * seva suma, els valors mínim i màxim i la mitjana aritmètica (N introduït per
 * l’usuari)
 *
 * @author vimago
 */
public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==DADES==");
        System.out.println("Introdueix el nombre de números reals que vols afegir: ");
        int nombres = sc.nextInt();
        double [] nums = new double[nombres];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introdueix el número de posició " + (i + 1) + ":");
            nums[i] = sc.nextInt();
        }
        double valMaxim = nums[0];
        double valMinim = nums[0];
        double numsTotal = 0;
        double mitjana = 0;
        for (int i = 1; i < nums.length; i++) {
            if (valMaxim < nums[i]) {
                valMaxim = nums[i];
            }
            if (valMinim > nums[i]) {
                valMinim = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            numsTotal += nums[i];
            mitjana = numsTotal / nombres;
        }
        
        System.out.println("==RESULTATS==");
        System.out.println("Array: "+Arrays.toString(nums));
        System.out.println("L'array té "+nombres+" elements.");
        System.out.println("Valor màxim: " + valMaxim);
        System.out.println("Valor mínim: " + valMinim);
        System.out.println("Suma total: "+numsTotal);
        System.out.println("Mitjana: " + mitjana);

    }

}