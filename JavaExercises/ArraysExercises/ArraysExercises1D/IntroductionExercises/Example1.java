import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class ExempleArrays01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[5];
//        entraArray1(a1);
//        System.out.println("De quina longitud vols que sigui l'array?");
//        int longitud = sc.nextInt();
//        entraArray2(longitud);
//inicialitzar dades a l'array
        a1[0] = 3;
        a1[1] = 5;
        a1[2] = 2;
        a1[3] = 6;
        a1[4] = -3;
        //mostrar array
        System.out.println("==CONTINGUT ARRAY==");
        imprimirArray(a1);

        System.out.println("==CONTINGUT * 10==");
        System.out.println("==PRIMERA MANERA==");
        for (int i = 0; i < a1.length; i++) {
            System.out.printf("al[%d] = %d%n", i, a1[i] * 10);
        }
//        System.out.println("==SEGONA MANERA==");
//        for (int i = 0; i < a1.length; i++) {
//            a1[i] = a1[i] * 10;
//        }
//        for (int i = 0; i < a1.length; i++) {
//            System.out.printf("al[%d] = %d%n", i, a1[i]);
//        }
// EL VALOR DE L'ARRAY NO CANVÏA, PERÒ PODEM MODIFICAR ELS VALORS DE L'ARRAY
        System.out.println("==SEGONA MANERA==");
        multiplicarArray(a1, 10);
        imprimirArray(a1);
        
        //bucle for-each
        for (int elem: a1) {
            System.out.println(elem);
        }
    } //final main()

    private static void imprimirArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("al[%d] = %d%n", i, x[i]);
        }
    } //final imprimirArray()

    private static void multiplicarArray(int[] a1, int val) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = a1[i] * 10;
        }
    } //final multiplicarArray()

    private static void entraArray1(int[] x) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Entra l'element %d: ", i);
            int val = sc.nextInt();
            x[i] = val;
        }
    }
    
    private static int[] entraArray2(int longitud) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[longitud];
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Entra l'element %d: ", i);
            int val = sc.nextInt();
            x[i] = val;
        }
        return x;
        
    }
}