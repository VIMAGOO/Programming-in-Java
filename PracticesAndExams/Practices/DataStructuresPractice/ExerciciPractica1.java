package practicaexercicis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Aquest programa demana a l'usuari el seu nom, cognom i NIF. Després demana
 * quants productes ha comprat i quin és el valor per unitat de cada producte.
 * Finalment, mostra la seva informació amb el codi del client; una llista dels
 * preus que ha afegit prèviament; la suma de tots els preus de la llista i el
 * descompte que s'ha aplicat conjuntament amb l'import final.
 *
 * @author vima2670
 */
public class ExerciciPractica1 {

    public static void main(String[] args) {

//Obtenim la cadena de text amb la informació de l'usuari.
        String nomCognomNif = registre();

//Obtenim els preus de cada producte.
        double[] preus = llistarPreus();

//Obtenim la informació del client separada dins un array
        String[] info = informacioClient(nomCognomNif);
        //Classifiquem la informació de l'array en distintes variables
        String nom = info[0];
        String cognom = info[1];
        String nif = info[2];
        //Generem el codi del client
        String codi = generarCodiClient(nom, cognom, nif);
        //Mostrem tota la informació que l'usuari ha entrat conjuntament amb el codi
        System.out.println("Nom: " + nom);
        System.out.println("Cognom: " + cognom);
        System.out.println("DNI: " + nif);
        System.out.println("Codi del client: " + codi);

//Mostrem la llista de preus que ha entrat l'usuari
        mostraVector(preus);

//Calculem la suma de tots els preus que ha entrat l'usuari
        double suma = sumaVectors(preus);
        //Mostrem la suma dels preus
        System.out.println("==SUMA DELS PREUS==");
        System.out.println("Subtotal: " + suma + "€");

//Calculem el rang i els números que són superiors al nombre de referència
        double rang = rangValors(preus);
        int numsSuperiors = comptaSuperiors(preus, 50);

//Calculem el descompte
        double descompte = calculaDescompte(preus, suma, numsSuperiors, rang);
        //Mostrem l'import final i el descompte que s'ha aplicat al subtotal
        System.out.println("==IMPORT FINAL==");
        System.out.println("El descompte que s'aplicarà serà el següent: " + descompte * 100 + "%");
        System.out.println("Import final: " + (suma - (suma * descompte)) + "€");

    }

    /**
     * Aquest mètode pregunta a l'usuari el seu nom, cognom i NIF en una mateixa
     * cadena de text
     *
     * @return la cadena de text amb la informació de l'usuari
     */
    public static String registre() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("==REGISTRE==");
        System.out.println("Introdueix, separat per espais, el teu nom, cognom i NIF: ");
        String nomCognomNif = sc.next();

        return nomCognomNif;
    }

    /**
     * Aquest mètode permet a l'usuari dir quants productes ha comprat i llistar
     * els preus dels productes comprats
     *
     * @return un array amb tots els preus dels productes
     */
    public static double[] llistarPreus() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("==PRODUCTES==");
        System.out.println("Quants productes diferents has comprat?: ");
        int productes = sc.nextInt();

        System.out.println("==PREUS==");
        double[] preus = new double[productes];
        for (int i = 0; i < preus.length; i++) {
            System.out.println("Introdueix el preu (unitat) del producte " + (i + 1) + ": ");
            preus[i] = sc.nextDouble();
        }
        return preus;
    }

    /**
     * Aquest mètodes separa/organitza la informació que venia en una cadena de
     * text dins un array
     *
     * @param nomCognomNif la cadena de text amb la informació de l'usuari
     * @return l'array amb la informació de l'usuari organitzada
     */
    public static String[] informacioClient(String nomCognomNif) {
        System.out.println("==INFORMACIÓ DE L'USUARI==");
        String esp = " ";
        int indexPrevi = -1;
        int index = 0;
        String[] info = new String[3];
        while (index != -1 && index < nomCognomNif.length()) {
            index = nomCognomNif.indexOf(esp, indexPrevi + 1);
            if (index < 0) {
                info[2] = nomCognomNif.substring(indexPrevi + 1);
            } else {
                if (indexPrevi == -1) {
                    info[0] = nomCognomNif.substring(indexPrevi + 1, index);
                } else {
                    info[1] = nomCognomNif.substring(indexPrevi + 1, index);
                }
                indexPrevi = index;

            }

        }
        return info;
    }

    /**
     * Aquest mètode genera el codi del client amb la seva informació
     *
     * @param nom el nom del client
     * @param cognom el cognom del client
     * @param nif el número identificatiu del client
     * @return el codi del client
     */
    public static String generarCodiClient(String nom, String cognom, String nif) {
        String codiClient;
        StringBuilder sb = new StringBuilder();
        Random ran = new Random();
        int numAleat = ran.nextInt(20, 81);
        sb.append(nom.substring(0, 3).toLowerCase()).append(cognom.substring(cognom.length() - 3, cognom.length()).toUpperCase()).append(nif.substring(nif.length() - 4, nif.length())).append("_").append(numAleat);
        codiClient = sb.toString();
        return codiClient;
    }

    /**
     * Aquest mètode suma tots els preus de la llista de preus dels productes
     *
     * @param preus la llista de preus dels productes
     * @return la suma de tots els preus
     */
    public static double sumaVectors(double[] preus) {
        double suma = 0;
        for (int i = 0; i < preus.length; i++) {
            suma += preus[i];
        }
        return suma;
    }

    /**
     * Aquest mètode calcula el rang entre el valor màxim de preu i el valor
     * mínim de preu dins la llista de preus
     *
     * @param preus la llista de preus dels productes
     * @return el rang o diferencia
     */
    public static double rangValors(double[] preus) {
        double diferencia = 0;
        double preuMax = preus[0];
        double preuMin = preus[0];
        for (int i = 0; i < preus.length; i++) {
            if (preuMax < preus[i]) {
                preuMax = preus[i];
            }
            if (preuMin > preus[i]) {
                preuMin = preus[i];
            }
        }
        diferencia = preuMax - preuMin;
        return diferencia;
    }

    /**
     * Aquest mètode mostra la llista de preus dels productes de manera visual
     *
     * @param preus la llista de preus dels productes
     */
    public static void mostraVector(double[] preus) {
        System.out.println("==LLISTA DE PREUS==");
        System.out.println(Arrays.toString(preus));
    }

    /**
     * Aquest mètode compta tots els preus que són superiors a un valor de
     * referència
     *
     * @param preus la llista de preus dels productes
     * @param ref el valor de referència
     * @return el nombre de preus supeiors al valor de referència
     */
    public static int comptaSuperiors(double[] preus, int ref) {
        int numsSuperiors = 0;
        for (int i = 0; i < preus.length; i++) {
            if (preus[i] > ref) {
                numsSuperiors++;
            }
        }
        return numsSuperiors;
    }

    /**
     * Aquest mètode calcula el descompte que cal aplicar al subtotal segons la
     * suma de preus, els productes que són superiors al valor de referència i
     * el rang entre el producte més car i més barat
     *
     * @param preus la llista de preus dels productes
     * @param sumaPreus la suma de tots els preus
     * @param productesSup productes superiors a un valor de referència
     * @param rang diferècia entre el producte més car i més barat
     * @return
     */
    public static double calculaDescompte(double[] preus, double sumaPreus, int productesSup, double rang) {
        double percDescompteOb = 0.03;
        double descompte = 0;
        if (sumaPreus > 100) {
            descompte = percDescompteOb + 0.02 + 0.01 * productesSup;
            if (rang > 30) {
                descompte += 0.04;
            }
        } else {
            descompte = percDescompteOb + 0.01 * productesSup;
            if (rang > 30) {
                descompte += 0.04;
            }
        }
        return descompte;
    }
}
