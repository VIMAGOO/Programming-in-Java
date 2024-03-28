import java.util.Scanner;

/**
 * Programa per calcular la suma de matrius MxN. El programa contindrà els
 * subprogrames llegirMatriu, sumarMatrius i mostrarMatrius. La sortida mostrarà
 * les dues matrius i la suma.
 *
 * @author vimago
 */
public class Exercise2D2 {

    public static void main(String[] args) {
        int[] filesColumnes = llegirFilesColumnes();
        System.out.println("MATRIU 1");
        System.out.println("VALORS: ");
        int[][] matriu1 = llegirMatriu(filesColumnes);
        System.out.println("MATRIU 2");
        System.out.println("VALORS:");
        int[][] matriu2 = llegirMatriu(filesColumnes);
        mostrarMatrius(matriu1, matriu2, filesColumnes);

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

    public static int[][] sumarMatrius(int[][] m1, int[][] m2, int[] filesColumnes) {
        int files = filesColumnes[0];
        int columnes = filesColumnes[1];
        int[][] matriuTotal = new int[files][columnes];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                matriuTotal[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return matriuTotal;
    }

    public static void mostrarMatrius(int[][] m1, int[][] m2, int[] filesColumnes) {
        int[][] matriuSuma = sumarMatrius(m1, m2, filesColumnes);
        System.out.println("MATRIU 1:");
        System.out.println(matrixToTable(m1));
        System.out.println("MATRIU 2:");
        System.out.println(matrixToTable(m2));
        System.out.println("SUMA DE LES DOS MATRIUS:");
        System.out.println(matrixToTable(matriuSuma));

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