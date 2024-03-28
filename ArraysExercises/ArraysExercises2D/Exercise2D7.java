import static arrays2d.Matrius.matrixToTable;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise2D7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int [][] taula = creacioTaula();
        int columna = 0;
        int fila = 0;
        int casellaActiva = 0;
        do {
        String opcio = mostrarMenuRebreOpcio().toLowerCase();
        switch (opcio) {
            case "a":
                taula = inicialitzarTaula(taula, columna, fila, casellaActiva);
                break;
            case "b":
                System.out.println("Introdueixi la nova fila (0-5): ");
                fila = sc.nextInt();
                if (fila > 5 || fila < 0) {
                    System.out.println("Fila no vàlida.");
                } else {
                    System.out.println("Introdueixi la nova columna (0-4): ");
                    columna = sc.nextInt();
                    if (columna > 4 || columna < 0) {
                        System.out.println("Columna no vàlida.");
                    } else {
                        System.out.println("La casella activa s'ha canviat correctament.");
                    }
                }
                break;
            case "c":
                System.out.println("Introdueixi el nou valor per a la casella activa: ");
                int valor = sc.nextInt();
                casellaActiva = valor;
                taula[fila][columna] = casellaActiva;
                break;
            case "d":
                if (columna < taula[0].length) {
                    columna += 1;
                } else if (fila < taula.length) {
                    columna = 0;
                } else {
                    fila = 0;
                    columna = 0;
                }
                break;
            case "e":
                if (columna == 0 && fila != 0) {
                    fila -= 1;
                    columna = 4;
                } else if (columna == 0 && fila == 0) {
                    fila = 5;
                    columna = 4;
                } else {
                    columna -= 1;
                }
                break;
            case "f":
                break;
            case "g":
                System.out.println("Coordenades de la casella activa: ");
                System.out.println("("+fila+", "+columna+")");
                break;
            case "h":
                break;
            case "x":
                continuar = false;
                break;
            default:
                System.out.println("Has d'introduïr una opció que es mostri al menú.");
                break;
        }
        } while(continuar);
    }
    
    /**
     * Aquest mètode crea la taula i posa tots els valors a 0
     * @return retorna la taula amb tots els valors a 0
     */
    public static int[][] creacioTaula() {
        int [][] taula = new int[6][5];
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[0].length; j++) {
                taula[i][j] = 0;
            }
        }
        return taula;
    }
    
    /**
     * Mostra el menú i reb la opció que l'usuari ha escollit
     * @return la opció de l'usuari
     */
    public static String mostrarMenuRebreOpcio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==MENÚ==");
        System.out.println("Seleccioni una opció: ");
        System.out.println("    a. Inicialitzar la taula.");
        System.out.println("    b. Canviar la casella activa.");
        System.out.println("    c. Canviar el valor de la casella activa.");
        System.out.println("    d. Passar a la següent casella activa.");
        System.out.println("    e. Passar a la casella activa anterior.");
        System.out.println("    f. Mostrar contingut de la taula.");
        System.out.println("    g. Mostrar la posició de la casella activa.");
        System.out.println("    h. Mostrar el valor de la casella activa.");
        System.out.println("    x. Sortir.");
        return sc.next();
    }
    
    /**
     * 
     * @param taula
     * @return 
     */
    private static int[][] inicialitzarTaula(int[][] taula, int columna, int fila, int casellaActiva) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el valor d'inicialització: ");
        int valor = sc.nextInt();
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[0].length; j++) {
                taula[i][j] = valor;
            }
        }
        taula[fila][columna] = casellaActiva;
        return taula;  
    }
    
    
    
    

}