import java.util.Scanner;

/**
 * Escriviu una funció que implementi l’operador lògic d’igualtat amb matrius.
 * La funció requerida ha de rebre com a paràmetres les dues matrius i ha de
 * retornar un valor lògic. Dues matrius són iguals si tenen les mateixes
 * dimensions i tots els seus elements corresponents són iguals. Escriviu també
 * el programa principal que l’utilitzi.
 *
 * @author vimago
 */
public class Exercise2D4 {

    public static void main(String[] args) {
        int[] filesColumnes1 = filesColumnes();
        System.out.println("MATRIU 1");
        System.out.println("VALORS: ");
        int[][] matriu1 = llegirMatriu(filesColumnes1);
        int[] filesColumnes2 = filesColumnes();
        System.out.println("MATRIU 2");
        System.out.println("VALORS:");
        int[][] matriu2 = llegirMatriu(filesColumnes2);
        mostrarMatrius(matriu1, matriu2);
        boolean sonIguals = compararMatrius(matriu1, matriu2, filesColumnes1, filesColumnes2);
        if (sonIguals) {
            System.out.println("Les matrius són iguals.");
        } else {
            System.out.println("Les matrius no són iguals.");
        }
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

    public static void mostrarMatrius(int[][] m1, int[][] m2) {
        System.out.println("MATRIU 1:");
        System.out.println(matrixToTable(m1));
        System.out.println("MATRIU 2:");
        System.out.println(matrixToTable(m2));
        System.out.println("SUMA DE LES DOS MATRIUS:");

    }

    public static boolean compararMatrius(int[][] m1, int[][] m2, int[] filesColumnes1, int[] filesColumnes2) {
        int files1 = filesColumnes1[0];
        int columnes1 = filesColumnes1[1];
        int files2 = filesColumnes2[0];
        int columnes2 = filesColumnes2[1];

        if (files1 == files2 && columnes1 == columnes2) {
            for (int i = 0; i < files1; i++) {
                for (int j = 0; j < columnes1; j++) {
                    if (m1[i][j] == m2[i][j]) {
                        return true;
                    } else {
                        return false;
                    }

                }
            }
        } else {
            return false;
        }
        return false;
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