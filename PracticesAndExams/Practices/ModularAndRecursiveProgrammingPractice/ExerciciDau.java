
import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;

/**
 * Aquest programa li preguntarà a l'usuari quants punts vol apostar del seu
 * saldo. Segons el valor dels dos daus rebrà una recompensa o no. El joc es
 * terminarà perquè l'usuari s'ha quedat sense saldo, perquè ha arribat al máxim
 * de saldo (40), o perquè ha tret dos 6.
 *
 * @author vima2670
 */
public class ExerciciDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables de saldo i que utilitzarem al bucle
        int saldo = 10;
        int tirada1 = 0;
        int tirada2 = 0;
        //Bucle do-while, vull que s'executi al menys una vegada
        do {
            //Els punts que aposta l'usuari.
            int puntsAposta = obteAposta(saldo);

            //Els resultats de la tirada dels dos daus
            tirada1 = tiradaDau();
            tirada2 = tiradaDau();

            //Mostrem la tirada
            String tirada = mostrarTirada(tirada1, tirada2);

            //El premi que l'usuari rebrà
            int premi = calcularPremi(puntsAposta, tirada1, tirada2);
            //Sumarem el premi al saldo
            saldo += premi;

            //Si el saldo té un valor de més de 40 punts, el saldo tindrá un valor 
            //de 40.
            if (saldo > 40) {
                saldo = 40;
            }

            //La condició del bucle, en aquest cas que el métode continuarJoc retorni true
        } while (continuarJoc(saldo, tirada1, tirada2) == true);

        //Missatges per alertar a l'usuari que el joc ha terminat.
        System.out.println("El joc s'ha acabat :(");
        System.out.println("Saldo final: " + saldo);
        System.out.println("L'última tirada ha sigut " + tirada1 + " i " + tirada2 + ".");
    }

    /**
     * Aquest mètode obté l'aposta que fa l'usuari
     *
     * @param saldo --> el saldo de l'usuari
     * @return --> retorna l'aposta de l'usuari
     */
    public static int obteAposta(int saldo) {
        Scanner sc = new Scanner(System.in);
        int aposta;
        do {
            System.out.println("Saldo: " + saldo);
            System.out.println("Quants punts vols apostar?");
            aposta = sc.nextInt();
        } while (aposta > saldo || aposta < 0);
        return aposta;
    }

    /**
     * Aquest mètode dona un valor aleatori entre l'1 i el 6
     *
     * @return --> valor aleatori (1-6) d'un dau
     */
    public static int tiradaDau() {
        Random ran = new Random();
        int numAleat = ran.nextInt(1, 7);
        return numAleat;
    }

    /**
     * Aquest mètode mostra a l'usuari el resultat de dues tirades
     *
     * @param tirada1 --> primer número aleatori
     * @param tirada2 --> segon número aleatori
     * @return --> retorna un missatge amb les dues tirades
     */
    public static String mostrarTirada(int tirada1, int tirada2) {
        System.out.println("********************");
        System.out.println("**** 1ª tirada:" + tirada1 + "****");
        System.out.println("**** 2ª tirada:" + tirada2 + "****");
        System.out.println("********************");
        return null;
    }

    /**
     * Aquest mètode calcula el premi que rebrà l'usuari
     *
     * @param aposta --> aposta que fa l'usuari
     * @param tirada1 --> primer número aleatori
     * @param tirada2 --> segon número aleatori
     * @return --> retorna el premi
     */
    public static int calcularPremi(int aposta, int tirada1, int tirada2) {
        if (tirada1 == 6 && tirada2 == 6) {
            return aposta * 2;
        } else {
            if (tirada1 + tirada2 == 10) {
                return 4;
            } else {
                if (tirada1 == tirada2) {
                    return 3;
                } else {
                    return -aposta;
                }
            }
        }
    }

    /**
     * Aquest métode té la funció de continuar o no el joc.
     *
     * @param saldo --> el saldo que té l'usuari
     * @param tirada1 --> primer número aleatori
     * @param tirada2 --> segon número aleatori
     * @return --> un boolean per si es continuará (true) o si no (false)
     */
    public static boolean continuarJoc(int saldo, int tirada1, int tirada2) {
        boolean continuar = true;
        if (saldo <= 0 || saldo == 40 || tirada1 == 6 && tirada2 == 6) {
            continuar = false;
        }
        return continuar;
    }
}
