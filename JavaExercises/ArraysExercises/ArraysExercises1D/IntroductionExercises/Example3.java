import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Example3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        System.out.println(Arrays.toString(a));
        //omplir amb un valor tots els elements
        Arrays.fill(a, 3);
        System.out.println(Arrays.toString(a));
        int [] b = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(b));
        int [] c = new int[10];
        //per completar amb un mateix valor un array
        Arrays.fill(c,5);
        //per comparar dos arrays
        System.out.println(Arrays.compare(a, c));
        //per afegir directament valors a l'array
        int [] d = {5, 3, 8, 2, 1, 9};
        System.out.println(Arrays.toString(d));
        //per ordenar arrays
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        //per agafar una part d'un array des d'un punt fins a un altre
        int [] e = Arrays.copyOfRange(d, 2, 4);
        System.out.println(Arrays.toString(e));
        
        int [] arrayAleat = generarArrayAleatori(50, 100);
        System.out.println(Arrays.toString(arrayAleat));
        System.out.println("Quin número vols buscar?: ");
        int numABuscar = sc.nextInt();
        int posicio = buscarPosicioNumeroAArray(arrayAleat, numABuscar);
        System.out.format("El número %d es troba a la posició %d \n", numABuscar, posicio);
        Arrays.sort(arrayAleat);
        System.out.println(Arrays.toString(arrayAleat));
        //per buscar la posició d'un número dins l'array
        int posicio2 = Arrays.binarySearch(arrayAleat, numABuscar);
        System.out.format("El número %d es troba a la posició %d \n", numABuscar, posicio2);
        
    }
    
    public static int [] generarArrayAleatori(int longitud, int valorMax) {
        Random ran = new Random();
        int [] x = new int[longitud];
        for (int i = 0; i < x.length; i++) {
            x[i] = ran.nextInt(valorMax);
            
        }
        return x;
    }
    
    public static int buscarPosicioNumeroAArray(int [] array, int valor) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                index = i;
                break;
            }
        }
        return index;
    }
    
}