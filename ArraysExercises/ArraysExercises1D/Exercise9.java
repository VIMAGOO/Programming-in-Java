import java.util.Random;
import java.util.Arrays;
/**
 * Programa que creï dos arrays d’enters de mida 100, inicialitzi els elements
 * de primer array amb tots els valors de l'1 al 100, copiï els valors del
 * primer array al segon en ordre invers, i mostri tots dos per pantalla.
 *
 * @author vimago
 */
public class Exercise9 {

    public static void main(String[] args) {
        int [] a = new int[100];
        int valor = 0;
        for (int i = 0; i < a.length; i++) {
            valor += 1;
            a[i] = valor;
        }
        System.out.println(Arrays.toString(a));
        int [] b = new int[100];
        int j = 100;
        for (int i = 0; i < b.length; i++) {
            j--;
            b[i] = a[j];
        }
        System.out.println(Arrays.toString(b));
        
    }

}