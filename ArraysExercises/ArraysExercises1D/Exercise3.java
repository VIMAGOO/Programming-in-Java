import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que demani N números enters per teclat, els emmagatzemi en un array
 * i calculi i mostri la suma dels positius i la suma dels negatius.
 * @author vimago
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina longitud vols que tingui l'array?:");
        int longitud = sc.nextInt();
        int[] x = new int[longitud];
        x = llegirArray(longitud);
        int[] sumes = new int[2];
        sumes = sumaNegPos(x);
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
    
    public static int[] sumaNegPos(int[] x) {
        int[] sumes = new int[2];
        int sumaPos = 0;
        int sumaNeg = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 0) {
                sumaPos += x[i];
            } else {
                sumaNeg += x[i];
            }
        }
        sumes[0] = sumaPos;
        sumes[1] = sumaNeg;

        return sumes;
    }

}