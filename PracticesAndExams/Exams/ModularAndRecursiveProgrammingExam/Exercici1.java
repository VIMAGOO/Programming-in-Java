package exercicisexamen;

import java.util.Random;
import java.util.Scanner;

/**
 * Aquest programa demana a l'usuari quantes rondes vol jugar, una vegada
 * introduït aquest valor, podrà jugar. El primer que farà serà escollir una
 * posició com a futbolista (esquerra, centre o dreta), es compararà el resultat
 * que ha donat l'ordinador amb el que ha donat ell i haurà marcat o no. A la
 * mateixa ronda també jugarà de porter i farà el mateix.
 *
 * @author vima2670
 */
public class Exercici1 {

    public static void main(String[] args) {
        //lector
        Scanner sc = new Scanner(System.in);
        //missatge
        System.out.println("Quantes rondes vols jugar?");
        //variable que introdueix l'usuari
        int rondesMax = sc.nextInt();
        //variables que utilitzarem al bucle
        int ronda = 0;
        int golsJugador = 0;
        int golsOrd = 0;
        String entitatJug = "jugador";
        String entitatOrd = "ordinador";
        //bucle do-while
        do {
            //cada iteració sumarà una ronda
            ronda += 1;
            //missatge turn jugador
            System.out.println("=TURN DEL JUGADOR=");
            System.out.println("Ronda número " + ronda);
            System.out.println("Jugador, et toca llençar!");

            //posició que tria el jugador
            String posicioJugador1 = triaPosicioJugador();
            //missatge de la posició que ha triat l'ordinador
            mostrarPosicio(entitatJug, posicioJugador1);
            //posició que dona l'ordinador aleatòriament
            String posicioOrd1 = triaPosicioOrdinador();
            //missatge de la posició
            mostrarPosicio(entitatOrd, posicioOrd1);

            //esGol mostarà si s'ha marcat o no i si es true sumarà un gol al jugador
            if (esGol(posicioJugador1, posicioOrd1) == true) {
                golsJugador++;
            }

            //mostrarà el marcador
            mostrarMarcador(ronda, golsJugador, golsOrd);

            //missatge turn de l'ordinador
            System.out.println("=TURN DE L'ORDINADOR=");
            System.out.println("Ronda número " + ronda);
            System.out.println("Jugador, et toca aturar la pilota!");

            ////missatge de la posició que ha triat l'ordinador
            String posicioOrd2 = triaPosicioOrdinador();
            //posició que tria el jugador
            String posicioJugador2 = triaPosicioJugador();
            //posició que dona l'ordinador aleatòriament
            mostrarPosicio(entitatOrd, posicioOrd2);
            //missatge de la posició que ha triat el jugador
            mostrarPosicio("jugador", posicioJugador2);

            //si esGol dona true(ha marcat l'ordinador) sumarà un gol a l'ordinador
            if (esGol(posicioJugador2, posicioOrd2) == true) {
                golsOrd++;
            }

            //mostrarem el marcador
            mostrarMarcador(ronda, golsJugador, golsOrd);
            //while on mentre continuarJoc sigui true continuarà el joc
        } while (continuarJoc(ronda, rondesMax, golsJugador, golsOrd));
        //missatges finals
        System.out.println("===MARCADOR FINAL===");
        //mostrem el marcador
        mostrarMarcador(ronda, golsJugador, golsOrd);
        //resultat del joc
        if (golsJugador == golsOrd) {
            System.out.println("Hi ha hagut un empat!!");
        } else {
            if (golsJugador > golsOrd) {
                System.out.println("El jugador ha guanyat!!");
            } else {
                System.out.println("L'ordinador ha guanyat!!");
            }
        }
    }

    /**
     * Aquest mètode dona al jugador la possibilitat de escollir una posició
     *
     * @return la posició que l'usuari ha escollit
     */
    public static String triaPosicioJugador() {
        Scanner sc = new Scanner(System.in);
        boolean correcte = true;
        String posicio = null;
        do {
            System.out.println("Quina posició vols escollir?");
            System.out.println("Esquerra/Centre/Dreta");
            posicio = sc.next().toLowerCase();
            switch (posicio) {
                case "esquerra":
                    break;
                case "centre":
                    break;
                case "dreta":
                    break;
                default:
                    System.out.println("Has d'introduir una dada correcte.");
                    correcte = false;
                    break;
            }
        } while (!correcte);
        return posicio;
    }

    /**
     * Aquest mètode fa que l'ordinador doni una dada aleatoria entre 1 i 3, en
     * base això escollirà les tres posicions possibles
     *
     * @return posició de l'ordinador
     */
    public static String triaPosicioOrdinador() {
        Random ran = new Random();
        int posicioNum = ran.nextInt(1, 4);
        String posicio = null;
        switch (posicioNum) {
            case 1:
                posicio = "esquerra";
                break;
            case 2:
                posicio = "centre";
                break;
            case 3:
                posicio = "dreta";
                break;
        }

        return posicio;
    }

    /**
     * Aquest mètode mostra el resultat de les posicions triades pel jugador i
     * l'ordinador
     *
     * @param entitat pot ser o jugador o ordinador
     * @param posicio la posició triada per l'entitat
     */
    public static void mostrarPosicio(String entitat, String posicio) {
        System.out.println("La posició del " + entitat + " és: '" + posicio + "'");
    }

    /**
     * Aquest mètode dona un valor booleà, si el jugador ha marcat mostrarà el
     * missatge de que ha sigut gol i retornarà true, si no mostrarà que no ha
     * sigut gol i retornarà false
     *
     * @param posicioJugador posició que ha introduït el jugador
     * @param posicioOrd posició de l'ordinador
     * @return
     */
    public static boolean esGol(String posicioJugador, String posicioOrd) {
        boolean gol = false;
        if (posicioJugador.equals(posicioOrd)) {
            System.out.println("No ha sigut gol.");
            gol = false;
        } else {
            System.out.println("Ha sigut gol!");
            gol = true;
        }
        return gol;
    }

    /**
     * Aquest mètode mostrà el marcador (ronda, gols del jugador i gols de
     * l'ordinador)
     *
     * @param ronda la ronda de la qual són els resultats
     * @param golsJugador gols del jugador
     * @param golsOrd gols de l'ordinador
     */
    public static void mostrarMarcador(int ronda, int golsJugador, int golsOrd) {
        System.out.println("=================");
        System.out.println("Ronda: " + ronda);
        System.out.println("**Jugador: " + golsJugador + " gols.**");
        System.out.println("**Ordinador: " + golsOrd + " gols.**");
        System.out.println("=================");
    }

    /**
     * Retornà un booleà, si la ronda en la qual l'usuari està i la ronda
     * introduïda com a ronda màxima coincideixen s'acabarà el joc; al igual que
     * si es impossible una remuntada
     *
     * @param ronda ronda a la qual està el jugador
     * @param rondaMax ronda que ha introduït el jugador com a ronda màxima
     * @param golsJugador gols del jugador
     * @param golsOrdinador gols de l'ordinador
     * @return
     */
    public static boolean continuarJoc(int ronda, int rondaMax, int golsJugador, int golsOrdinador) {
        double rondaMaxDouble = rondaMax;
        double golsJugadorDouble = golsJugador;
        double golsOrdinadorDouble = golsOrdinador;
        if (ronda == rondaMax) {
            System.out.println("Les " + rondaMax + " rondes han sigut completades!");
            return false;
        } else {
            if (rondaMaxDouble / golsJugadorDouble < 2 || rondaMaxDouble / golsOrdinadorDouble < 2) {
                System.out.println("El joc ha terminat perquè no hi ha forma de remuntar : ( ");
                return false;
            } else {
                return true;
            }
        }
    }
}
