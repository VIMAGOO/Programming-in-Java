import cat.proven.utils.arrays.UtilsArrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina longitud vols que tingui l'array?:");
        int longitud = sc.nextInt();
//        int[] a1 = new int[longitud];
//        llegirArray1(a1);
//        System.out.println("Amb for");
//        for (int elem : a1) {
//            System.out.print("-" + elem + "-");
//        }
        System.out.println("Amb java.util.Arrays");
        int[] a1 = UtilsArrays.llegirArray2(longitud);
        System.out.println(Arrays.toString(a1));
        //longitud de l'array
        System.out.println("La longitud de l'array és "+a1.length);
        //suma de l'array
        System.out.println("La suma dels elements de l'array és "+UtilsArrays.sumaArrays(a1));
        //valor màxim de l'array
        System.out.println("El valor máxim de l'array és "+UtilsArrays.valorMax(a1));
        System.out.println("El valor mínim de l'array és "+UtilsArrays.valorMin(a1));
        System.out.println(UtilsArrays.arrayToString(a1));
    }

}