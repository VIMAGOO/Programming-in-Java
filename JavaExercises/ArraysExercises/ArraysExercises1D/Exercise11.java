import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa per mantenir en memòria una llista de noms (String). Les opcions del
 * menú de funcionalitats seran: sortir, llistar, buscar, afegir, modificar. La
 * llista es manté en un array de longitud N (N a entrar per l’usuari).
 *
 * @author vimago
 */
public class Exercise11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==CREACIÓ DE LA LLISTA==");
        System.out.println("De quina longitud vols que sigui l'array?: ");
        final int longitud = sc.nextInt();
        String[] llista = new String[longitud];
        System.out.println("Quants espais vols omplir?");
        int espais = sc.nextInt();
        if (espais > longitud) {
            System.out.println("No pots omplir més espais dels que hi ha.");
        } else {
            
        int noms = 0;
        for (int i = 0; i < espais; i++) {
            System.out.println("Introdueix el nom de la persona " + (i + 1) + ":");
            llista[i] = sc.next();
            noms++;
        }
        boolean continuar = true;
        do {
            int opcio = missatgeMenuEleccioDif();
            switch (opcio) {
                case 1:
                    continuar = false;
                    break;
                case 2:
                    llistarNoms(noms, llista);
                    break;
                case 3:
                    buscarNom(llista);
                    break;
                case 4:
                    noms = afegirDades(llista, noms);
                    break;
                case 5:
                    llista = modificarLlista(llista);
                    System.out.println("Llista modificada: " + Arrays.toString(llista));
                    break;
                default:
                    System.out.println("Introdueix un valor positiu.");
            }
        } while (continuar);
        System.out.println("La teva llista final és: " + Arrays.toString(llista));
        }
    }

    /**
     * Aquest mètode mostra el missatge del menú i retorna l'opció de l'usuari
     */
    public static int missatgeMenuEleccio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==MENÚ==");
        System.out.println("1. Sortir.");
        System.out.println("2. Llistar.");
        System.out.println("3. Buscar.");
        System.out.println("4. Afegir.");
        System.out.println("5. Modificar.");
        int opcio = 0;
        try {
            opcio = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Has d'introduïr un número enter.");
        }
        return opcio;

    }

    /**
     * Aquest mètode mostra el missatge del menú i retorna l'opció de l'usuari
     * de manera diferent
     */
    public static int missatgeMenuEleccioDif() {
        Scanner sc = new Scanner(System.in);
        int opcio = -1;
        String[] opcions = {"Sortir", "Llistar", "Buscar", "Afegir", "Modificar"};
        for (int i = 0; i < opcions.length; i++) {
            if (i == 0) {
                System.out.println("==MENÚ==");
            }
            System.out.format("%d. %s%n", i + 1, opcions[i]);
        }
        try {
            System.out.println("Selecciona una opció: ");
            opcio = sc.nextInt();
            if (opcio < 1 || opcio > opcions.length + 1) {
                System.out.println("Introdueix una dada vàlida");
            }
        } catch (InputMismatchException e) {
            System.out.println("Has d'introduïr un número enter.");
        }
        return opcio;
    }
    /**
     * Aquest mètode mostra l'estat actualitzat de la llista de l'usuari
     * @param noms els número d'elements que té la llista
     * @param llista l'array que conté tots els noms
     */
    public static void llistarNoms(int noms, String[] llista) {
        System.out.println("=LLISTAT=");
        System.out.println("La teva llista té els següents noms: ");
        for (int i = 0; i < noms; i++) {

            System.out.println(llista[i]);
        }
        System.out.format("%d noms mostrats. %n", noms);
    }
    
    /**
     * Aquest mètode busca la posició del nom que l'usuari ha introduït
     * @param llista l'array que conté tots els noms
     */
    public static void buscarNom(String[] llista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin nom vols buscar?: ");
        String nom = sc.next();
        int posicio = Arrays.binarySearch(llista, nom);
        System.out.println("El nom està a la posició " + posicio + ".");
    }
    
    /**
     * Aquest mètode afegeix dades a la llista
     * @param llista array que conté tots els noms i els valors nulls
     * @param noms el número de elements que té la llista
     * @return retorna el número de elements actualitzats
     */
    public static int afegirDades(String[] llista, int noms) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quants noms vols afegir?");
  
        int nomsAAfegir = sc.nextInt();
        if ((nomsAAfegir+noms) > llista.length) {
            System.out.println("No pots afegir tants noms.");
        } else {
        System.out.println(noms);
        System.out.println(noms + nomsAAfegir);
        int nomsNous = 0;
        for (int i = noms; i < (noms + nomsAAfegir); i++) {
            System.out.println("Introdueix el nom de la persona " + (i + 1) + " que vols afegir: ");
            String nomNou = sc.next();
            llista[i] = nomNou;
            nomsNous++;
        }
        noms += nomsNous;
        }
        return noms;
    }
    
    /**
     * Aquest mètode modifica els noms de la llista
     * @param llista l'array que conté tots els noms
     * @return retorna la llista amb els noms modificats
     */
    public static String[] modificarLlista(String[] llista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin nom vols canviar? ");
        String nom = sc.next();
        int posicio = Arrays.binarySearch(llista, nom);
        System.out.println("Per quin nom el vols canviar?: ");
        String nomCanviar = sc.next();
        llista[posicio] = nomCanviar;

        return llista;
    }

}