package exercicisexamen;

import java.util.Scanner;

/**
 * En aquest programa l'usuari introdueix el nombre de files de bitlles i quants
 * jugador participaran en el campeonat. El programa calcularà recursivament el
 * nombre de bitlles necessàries per cada jugador i farà la distribució amb "*".
 * Donarà com a resultat el nombre de bitlles necessàries per jugador, el nombre
 * de bittles necessàries al campeonat i la distribució de bitlles necessàries.
 *
 * @author vima2670
 */
public class Exercici2 {

    public static void main(String[] args) {
        //lector
        Scanner sc = new Scanner(System.in);
        //missatge per introduïr files
        System.out.println("Introdueix el nombre de files de bitlles: ");
        //files introduïdes per l'usuari
        int files = sc.nextInt();
        //missatge per introduïr el jugador que participaran
        System.out.println("Quants jugadors participaran al campeonat?");
        //jugadors introduïts per l'usuari
        int jugadors = sc.nextInt();
        //bitlles necessàries per 1 jugador
        int bitllesJugador = calculaBitlles(files);
        //bitlles necessàries per els jugadors que l'usuari introdueixi
        int bitllesTotals = bitllesJugador * jugadors;

        //missatge a mostrar a l'usuari
        System.out.println("El nombre de bitlles necessàries per cada jugador són: " + bitllesJugador);
        System.out.println("Les bitlles necessàries per al campeonat són: " + bitllesTotals);
        System.out.println("");
        System.out.println("===DISTRIBUCIÓ===");
        mostrarPartida(files, "*", "*", " ");
    }

    /**
     * Aquest mètode calcula recursivament les bitlles necessàries per cada
     * jugador segons les files que introdueix l'usuari
     *
     * @param files nombre de files
     * @return el nombre de bitlles necessàries
     */
    public static int calculaBitlles(int files) {
        int bitlles;
        if (files == 1) {
            return 1;
        } else {
            bitlles = files + calculaBitlles(files - 1);
            return bitlles;
        }
    }

    /**
     * Aquest programa que recursivament mostra la distribució de les bitlles (a
     * mitjes)
     *
     * @param files files introduides per l'usuari
     * @param ast astèrisc que anirà cambiant de valor a cada iteració
     * @param ast2 astèrisc constant
     * @param esp espai que anirà cambiant de valor a cada iteració
     */
    public static void mostrarPartida(int files, String ast, String ast2, String esp) {
        if (files == 0) {
        } else {
            mostrarPartida(files - 1, ast + ast2, ast2, esp);
            esp = esp.repeat(files - 1);
            System.out.println(esp + ast);

        }
    }
}
