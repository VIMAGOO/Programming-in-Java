/**
 * Programa que traspassa tres vectors d’enters d’N elements cada un a una
 * matriu de 3 files i N+1 columnes, col·locant en la darrera columna la suma
 * dels elements de cada fila
 *
 * @author vimago
 */
public class Exercise2D1 {

    public static void main(String[] args) {
        int[] v1 = {3, 5, 2, 12, 4, 7, 1, 0, 3, 1};
        int[] v2 = {0, 6, 8, 3, 22, 1, 4, 5, 7, 8};
        int[] v3 = {4, 2, 2, 2, 6, 1, 1, 1, 8, 0};
        int columnes = v1.length + 1; //11
        int files = 3;
        int[][] matriu = new int[files][columnes];

        vectorAMatriu(matriu, v1, 0);
        vectorAMatriu(matriu, v2, 1);
        vectorAMatriu(matriu, v3, 2);

        matriu[0][columnes-1] = sumaVector(v1);
        matriu[1][columnes-1]  = sumaVector(v2);
        matriu[2][columnes-1] = sumaVector(v3);
        
        System.out.println(matrixToTable(matriu));
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
     * Suma tots els paràmetres del vector
     * @param v vector
     * @return suma dels paràmetres
     */
    public static int sumaVector(int [] v){
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }

}