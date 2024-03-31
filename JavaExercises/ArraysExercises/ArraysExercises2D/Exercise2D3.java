import java.util.Scanner;

/**
 * Programa que calculi la matriu transposada d’una matriu de dimensions M * N.
 * Heu de crear els subprogrames llegirMatriu, transpondre, mostrarMatriu.
 * (Nota: la matriu transposada és la que resulta de canviar files per
 * columnes).
 *
 * @author vimago
 */
public class Exercise2D3 {

    public static void main(String[] args) {
        int[] filesColumnes = filesColumnes();
        int[][] matriu = llegirMatriu(filesColumnes);
        int[][] matriuTrasposada = traspondreMatriu(matriu, filesColumnes);
        mostrarMatrius(matriu, matriuTrasposada);
    }

    public static int[] filesColumnes() {
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

    public static int[][] traspondreMatriu(int[][] m, int[] filesColumnes) {
        int columnes = filesColumnes[0];
        int files = filesColumnes[1];
        int[][] matriuTrasposada = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriuTrasposada[i][j] = m[j][i];
            }
        }
        return matriuTrasposada;
    }

    public static void mostrarMatrius(int[][] m1, int[][] m2) {
        System.out.println("MATRIU:");
        System.out.println(matrixToTable(m1));
        System.out.println("MATRIU TRASPOSADA:");
        System.out.println(matrixToTable(m2));
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