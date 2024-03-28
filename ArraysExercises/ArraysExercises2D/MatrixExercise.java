import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class MatrixExercise {

    public static void main(String[] args) {
        //declarar matriu i generar-la i inicialitzar-la amb un mètode
        int[][] matriu = generarMatriuAleatoria(3, 4);
        //   mostrar matriu en format unilínia
        System.out.println(matrixToString(matriu));
        //declarar i instanciar matriu i inicialitzar-la amb un mètode
        int[][] matriu2 = new int[3][4];
        inicialitzarMatriuAleatoria(matriu2);
        //   mostrar matriu en format unilínia
        System.out.println(matrixToString(matriu2));
        //mostrar matriu en format taula
        System.out.println(matrixToTable(matriu));
    }

    /**
     * declara, instancia i inicialitza amb dades aleatòries una matriu amb les
     * files i columnes especificades
     *
     * @param files el número de files de la matriu
     * @param columnes el número de columnes de la matriu
     * @return la matriu amb les dades
     */
    public static int[][] generarMatriuAleatoria(int files, int columnes) {
        int[][] dades = new int[files][columnes];
        final int MAX_VALOR = 100;
        Random rnd = new Random();
        for (int i = 0; i < dades.length; i++) {
            for (int j = 0; j < dades[i].length; j++) {
                dades[i][j] = rnd.nextInt(MAX_VALOR);
            }
        }
        return dades;
    }

    /**
     * inicialitza una matriu amb dades aleatòries com que el paràmetre 'dades'
     * és una referència, es pot usar per accedir als elements de la matriu i
     * canviar els seus valors.
     *
     * @param dades la matriu a omplir
     */
    public static void inicialitzarMatriuAleatoria(int[][] dades) {
        final int MAX_VALOR = 100;
        Random rnd = new Random();
        for (int i = 0; i < dades.length; i++) {
            for (int j = 0; j < dades[i].length; j++) {
                dades[i][j] = rnd.nextInt(MAX_VALOR);
            }
        }
    }

    /**
     * genera un format String unilínia de la matriu
     *
     * @param dades la matriu a representar
     * @return String amb la matriu en format unilínia
     */
    public static String matrixToString(int[][] dades) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < dades.length; i++) {
            sb.append(Arrays.toString(dades[i]));
            if (i < dades.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * genera un format tabular per a una matriu
     *
     * @param dades la matriu a tabular
     * @return format String tabular de la matriu
     */
    public static String matrixToTable(int[][] dades) {
        StringBuilder sb = new StringBuilder();
        //sb.append("[");
        for (int i = 0; i < dades.length; i++) {
            for (int j = 0; j < dades[i].length; j++) {
                sb.append(dades[i][j]);
                if (j < dades[i].length - 1) {
                    sb.append("\t");
                }
            }
            if (i < dades.length - 1) {
                sb.append("\n");
            }
        }
        //sb.append("]");
        return sb.toString();
    }
    
     /**
     * genera un format tabular per a una matriu
     *
     * @param dades la matriu a tabular
     * @return format String tabular de la matriu
     */
    public static String formatTaula(double[][] dades) {
        StringBuilder sb = new StringBuilder();
        //sb.append("[");
        for (int i = 0; i < dades.length; i++) {
            for (int j = 0; j < dades[i].length; j++) {
                sb.append(dades[i][j]);
                if (j < dades[i].length - 1) {
                    sb.append("\t");
                }
            }
            if (i < dades.length - 1) {
                sb.append("\n");
            }
        }
        //sb.append("]");
        return sb.toString();
    }

    /**
     * Copia les dades del vector a la matriu dins la fila especificada.
     *
     * @param m la matriu on copiarem les dades
     * @param v la matriu que copiarem
     * @param fila files que tindrá l'array d'arrays(m)
     */
    public static void vectorAMatriu(int[][] m, int[] v, int fila) {
        for (int i = 0; i < v.length; i++) {
            m[fila][i] = v[i];
        }
    }
    
    public static int[] llegirFilesColumnes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORMACIÓ: ");
        System.out.println("Introdueix les files: ");
        int files = sc.nextInt();
        System.out.println("Introdueix les columnes: ");
        int columnes = sc.nextInt();
        int[] filesColumnes = {files, columnes};
        return filesColumnes;
    }
    
    public static int[][] llegirMatriu(int[] filesColumnes) {
        Scanner sc = new Scanner(System.in);
        int files = filesColumnes[0];
        int columnes = filesColumnes[1];
        int[][] m = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.format("Introdueix el valor de la fila %d i la columna %d: %n", i, j);
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }
    
    /**
     * Calcula la matriu trasposada
     * @param m matriu a trasposar
     * @return retorna la matriu trasposada
     */
    public static int[][] traspondreMatriu(int[][] m) {
        int columnes = m.length;
        int files = m[0].length;
        int[][] matriuTrasposada = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriuTrasposada[i][j] = m[j][i];
            }
        }
        return matriuTrasposada;
    }
    

}