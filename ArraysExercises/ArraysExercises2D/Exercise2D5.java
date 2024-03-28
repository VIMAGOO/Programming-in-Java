import static arrays2d.Matrius.matrixToTable;
import static arrays2d.Matrius.formatTaula;

/**
 * Dissenyeu un subprograma que calculi el producte de dues matrius. Escriviu
 * també el programa principal que l’utilitzi. (Recordeu que per multiplicar
 * dues matrius, l’element i,j de la matriu producte s’obté sumant els productes
 * dels elements de la fila i de la primera matriu pels elements de la columna j
 * de la segona),
 *
 * @author vimago
 */
public class Exercise2D5 {

    public static void main(String[] args) {
        double[][] matriu1 = {{2, 3, -1}, {5, 4, 6}};

        double[][] matriu2 = {{1, 0, 5, 2}, {-3, 8, 4, 9}, {0, -3, 2, 7}};

        double[][] matriuMultiplicada = multiplicarMatrius(matriu1, matriu2);
        if (matriuMultiplicada == null) {
            System.out.println("No es poden multiplicar les matrius.");
        } else {
            mostrarMatrius(matriu1, matriu2, matriuMultiplicada);
        }

    }

    public static void generarDades(int[][] matriu1, int[][] matriu2) {
        matriu1[0][0] = 2;
        matriu1[0][1] = 3;
        matriu1[0][2] = -1;
        matriu1[1][0] = 5;
        matriu1[1][1] = 4;
        matriu1[1][2] = 6;

        matriu2[0][0] = 1;
        matriu2[0][1] = 0;
        matriu2[0][2] = 5;
        matriu2[0][3] = 2;
        matriu2[1][0] = -3;
        matriu2[1][1] = 8;
        matriu2[1][2] = 4;
        matriu2[1][3] = 9;
        matriu2[2][0] = 0;
        matriu2[2][1] = -3;
        matriu2[2][2] = 2;
        matriu2[2][3] = 7;
    }

    public static void mostrarMatrius(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("MATRIU 1:");
        System.out.println(formatTaula(m1));
        System.out.println("MATRIU 2:");
        System.out.println(formatTaula(m2));
        System.out.println("MATRIU MULTIPLICADA:");
        System.out.println(formatTaula(m3));

    }

    public static double[][] multiplicarMatrius(double[][] matriu1, double[][] matriu2) {
        double sumatori = 0;
        int filesMult = matriu1.length;
        int colMult = matriu2[0].length;
        double[][] matriuMultiplicada = new double[filesMult][colMult];
        if (matriu1[0].length == matriu2.length) {
            for (int files = 0; files < filesMult; files++) {
                for (int columnes = 0; columnes < colMult; columnes++) {
                    sumatori = 0;
                    for (int seccio = 0; seccio < matriu2.length; seccio++) {
                        sumatori += matriu1[files][seccio] * matriu2[seccio][columnes];
                        
                    }
                    matriuMultiplicada[files][columnes] = sumatori;
                }

            }
        } else {
            return matriuMultiplicada = null;
        }
        return matriuMultiplicada;
    }

}