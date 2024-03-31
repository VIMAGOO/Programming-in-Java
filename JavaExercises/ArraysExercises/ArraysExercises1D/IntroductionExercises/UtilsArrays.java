import java.util.Scanner;

/**
 * 
 * @author vimago
 */
public class UtilsArrays {
    
    /**
     * Llegeix de l'usuari els elements de l'array passat com a paràmetre
     *
     * @param x array a omplir
     */
    public static void llegirArray1(int[] x) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Entra l'element " + i + ":");
            int valor = sc.nextInt();
            x[i] = valor;
        }
    }

    public static int[] llegirArray2(int longitud) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[longitud];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Entra l'element " + i + ":");
            int valor = sc.nextInt();
            x[i] = valor;
        }
        return x;
    }
    
    /**
     * Suma els elements de l'array 
     * @param x l'array a sumar
     * @return la suma dels elements de l'array
     */
    public static int sumaArrays(int[] x) {
        int suma = 0;
//        for (int i = 0; i< x.length; i++) {
//            suma += x[i]; //suma = suma + x[i];
//        }
          for (int elem: x) {
              suma += elem;
          }
        return suma;
    }
    
    public static int valorMax(int[] x) {
        int maxim = x[0];
        for (int i = 1; i < x.length; i++) {
            if (maxim < x[i]) {
                maxim = x[i];
            }
        }
        return maxim;
    }
    
    public static int valorMin(int[] x) {
        int minim = x[0];
        for (int i = 1; i < x.length; i++) {
            if (minim > x[i]) {
                minim = x[i];
            }
        }
        return minim;
    }
    
    public static String arrayToString(int [] x) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < x.length; i++) {
                
            if (i == x.length-1) {
                sb.append(x[i]);   
            } else {
                sb.append(x[i]).append(",");
            }
        }
        //també podem utilitzar:
//        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");
        return sb.toString();
    }
}