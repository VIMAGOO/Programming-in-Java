import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Random;

/**
 * Exemple on podem veure com funcionen les matrius (amplada i altura).
 *
 * @author vimago
 */
public class Example2D {

    public static void main(String[] args) {
        int[][] matriu1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("matriu1.length: " + matriu1.length);
        System.out.println("matriu1[0].length: " + matriu1[0].length);
        printMatriu(matriu1);
        System.out.println(matrixToString(matriu1));
        System.out.println(matrixToTable(matriu1));
        int[][] matriu2 = emplenarMatriu(matriu1);
        System.out.println(matrixToString(matriu2));
    }

    public static void printMatriu(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.format("La matriu1[%d][%d] és %d%n", i, j, array[i][j]);
            }
        }

    }

    public static int[][] emplenarMatriu(int[][] array) {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(1, 10);
            }
        }
        return array;
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

}