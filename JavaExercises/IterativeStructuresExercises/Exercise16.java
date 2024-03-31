import java.util.Scanner;
/**
 * Aquest programa rebrà un número enter de l'usuari
 * de l'1 inclòs fins aquest número entrat el programa calcularà
 * tots els números prims.
 * @author vimago
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número enter: ");
        int enter = sc.nextInt();
        sc.close();

        int prims = 0;

        for (int i = 2; i <= enter; i++) {
            if (esPrim(i)) {
                System.out.println(i);
                prims++;
            }
        }

        System.out.println("PRIMS: " + prims);
    }

    public static boolean esPrim(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}