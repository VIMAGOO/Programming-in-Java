import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que permeti emmagatzemar en un array una progressió aritmètica. El
 * programa demanarà a l’usuari el nombre d’elements, l’element inicial i el
 * valor de la diferència. Finalment, mostrarà el contingut de l’array generat.
 *
 * @author vimago
 */
public class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nombre d'elements: ");
        int elements = sc.nextInt();
        System.out.println("Introdueix l'element inicial: ");
        int elemIni = sc.nextInt();
        System.out.println("Introdueix el valor de la diferència: ");
        int suma = sc.nextInt();
        
        int[] progArit = new int[elements];
        for (int i = 0; i < progArit.length; i++) {
            if (i == 0) {
                 progArit[0] = elemIni;
            } else {
               progArit[i] = progArit[i-1] + suma; 
            }
            
        }
        
        System.out.println(Arrays.toString(progArit));
    }

}