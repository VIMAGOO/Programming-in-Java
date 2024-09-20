
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa per a una màquina expenedora de fàrmacs.
 * 
 * @author vimago
 */
public class MaquinaFarmacia {

    public static void main(String[] args) {
        //dades del programa
        //assignació de dades
        final int MAX_FARMACS = 16;
        String[] farmacsIntroduits = new String[MAX_FARMACS];
        String[][] farmacs = assignacioFarmacs();
        double[][] preus = assignacioPreus();
        int[][] unitats = assignacioUnitats();
        //menu del programa
        final String[] menuOptions = {
            "Sortir (apagar màquina i mostrar vendes)",
            "Mostrar tot",
            "Llegir targeta sanitaria",
            "Valida existència fàrmacs demanats",
            "Comfirma compra fàrmacs"
        };
        boolean exit = false;
        do {
            //display menu and read user's option
            int optionSelected = displayMenuAndReadUserChoice(menuOptions);
            //execute option selected by user
            switch (optionSelected) {
                case 0:  //exit program
                    exit = true;
                    break;
                case 1:
                    mostrarTaula(farmacs, preus, unitats);
                    break;
                case 2:
                    farmacsIntroduits = ingresarFarmacsClient();
                    System.out.println("S'ha llegit correctament la tarjeta.");
                    break;
                case 3:
                    //for per comprovar que s'ha llegit la tarjeta, si no retorna un missatge que ha de fer el pas 2 abans
                    int comp1 = 0;
                    for (int i = 0; i < farmacsIntroduits.length; i++) {
                        if (farmacsIntroduits[i] == null) {
                            comp1++;
                        }
                    }
                    if (comp1 != 16) {
                        mostrarInformacioFarmacs(farmacsIntroduits, farmacs, unitats);
                    } else {
                        System.out.println("Primer has de llegir la tarjeta sanitària.");
                    }
                    break;
                case 4:
                    //for per comprovar que s'ha llegit la tarjeta, si no retorna un missatge que ha de fer el pas 2 abans
                    int comp2 = 0;
                    for (int i = 0; i < farmacsIntroduits.length; i++) {
                        if (farmacsIntroduits[i] == null) {
                            comp2++;
                        }
                    }
                    if (comp2 != 16) {
                        confirmarCompraFarmacs(farmacsIntroduits, farmacs, preus, unitats);
                        //bucle per restar les unitats del medicament corresponent al sistema, ja que han sigut comprades
                        for (int x = 0; x < farmacsIntroduits.length; x++) {
                            for (int i = 0; i < farmacs.length; i++) {
                                for (int j = 0; j < farmacs[0].length; j++) {
                                    if (farmacs[i][j].equalsIgnoreCase(farmacsIntroduits[x])) {
                                        if (unitats[i][j] > 0) {
                                            unitats[i][j] -= 1;
                                        }
                                        //fem que el llistat de fàrmacs introduïts per l'usuari sigui null (el buïdem)
                                        farmacsIntroduits[x] = null;
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("Primer has de llegir la tarjeta sanitària.");
                    }
                    break;
                default:
                    System.out.println("Bad option");
                    break;
            }
        } while (!exit);
        System.out.println("Closing program");
    }

    /**
     * displays options of program menu and inputs user's choice
     *
     * @param options the array of options of the menu
     * @return index of selected option
     */
    private static int displayMenuAndReadUserChoice(String[] options) {
        System.out.println("===== Grade manager menu =====");
        for (int i = 0; i < options.length; i++) {
            System.out.format("[%d]. %s\n", i, options[i]);
        }
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while (choice < 0) {
            try {
                //ask user's choice
                System.out.print("Select an option: ");
                choice = scan.nextInt();
                //validate choice
                if ((choice < 0) || (choice >= options.length)) {
                    choice = -1;
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                choice = -1;
            }

        }
        return choice;
    }

    /**
     * Aquest mètode assigna a l'array bidimensional de fàrmacs tots els seus
     * valors
     *
     * @return l'array amb tots els valors assignats
     */
    private static String[][] assignacioFarmacs() {
        String[][] farmacs = {{"Paracetamol", "Ibuprofeno", "Omeprazol", "Amoxicilina"},
        {"Loratadina", "Simvastatina", "Metformina", "Cetirizina"},
        {"Atorvastatina", "Aspirina", "Naproxeno", "Escitalopram"},
        {"Losartán", "Sildenafil", "Montelukast", "Clopidogrel"}};
        return farmacs;
    }

    /**
     * Aquest mètode assigna a l'array bidimensional de preus tots els seus
     * valors
     *
     * @return l'array amb tots els valors assignats
     */
    private static double[][] assignacioPreus() {
        double[][] preus = {{9.50, 6.75, 12.99, 11.25},
        {5.80, 18.25, 7.99, 8.50},
        {15.75, 4.99, 7.25, 14.50},
        {10.80, 23.99, 9.75, 20.50}};
        return preus;
    }

    /**
     * Aquest mètode assigna a l'array bidimensional d'unitats tots els seus
     * valors
     *
     * @return l'array amb tots els valors assignats
     */
    private static int[][] assignacioUnitats() {
        int[][] unitats = new int[4][4];
        for (int i = 0; i < unitats.length; i++) {
            for (int j = 0; j < unitats[0].length; j++) {
                unitats[i][j] = 5;
            }
        }
        return unitats;
    }

    /**
     * Aquest mètode mostra la taula de tots els fàrmacs, amb els seus preus i
     * les unitats restants.
     *
     * @param farmacs l'array bidimensional que conté tots els fàrmacs
     * @param preus l'array bidimensional que conté tots els preus
     * @param unitats l'array bidimensional que conté totes les unitats
     */
    private static void mostrarTaula(String[][] farmacs, double[][] preus, int[][] unitats) {
        StringBuilder sb = new StringBuilder();
        sb.append("|Fàrmac" + "\t").append("\t").append("|Preu(€)").append("|Unitat\t" + "|").append("\n");
        sb.append("|---------------|-------|-------|").append("\n");
        for (int i = 0; i < farmacs.length; i++) {
            for (int j = 0; j < farmacs[0].length; j++) {
                if (unitats[i][j] > 0) {
                    sb.append("|").append(farmacs[i][j]).append("\t").append("|").append(preus[i][j]).append("\t").append("|").append(unitats[i][j]).append("\t|").append("\n");
                } else {
                    sb.append("|").append(farmacs[i][j]).append("\t").append("|").append(preus[i][j]).append("\t").append("|" + "X" + "\t" + "|").append("\n");
                }
            }
        }
        System.out.println(sb);
    }

    /**
     * Demana a l'usuari quants fàrmacs ha comprat i que introdueixi el nom del
     * fàrmac (recreant el funcionament d'una tarjeta)
     *
     * @return retorna un array amb tots els fàrmacs introduïts
     */
    private static String[] ingresarFarmacsClient() {
        Scanner sc = new Scanner(System.in);
        final int MAX_FARMACS = 16;
        String[] farmacsIntroduits = new String[MAX_FARMACS];
        System.out.println("Quants fàrmacs hi ha?: ");
        int quantitatFarm = sc.nextInt();
        for (int i = 0; i < quantitatFarm; i++) {
            System.out.println("Introdueix el nom del " + (i + 1) + " fàrmac: ");
            farmacsIntroduits[i] = sc.next();
        }
        return farmacsIntroduits;
    }

    /**
     * Aquest mètode mostra la informació dels fàrmacs, és a dir, si queden
     * unitats o si no hi ha cap unitat restant
     *
     * @param farmacsIntroduits els fàrmacs introduïts per l'usuari
     * @param farmacs l'array bidimensional amb els fàrmacs
     * @param unitats l'array bidimensional amb les unitats de fàrmacs
     */
    private static void mostrarInformacioFarmacs(String[] farmacsIntroduits, String[][] farmacs, int[][] unitats) {
        StringBuilder sb = new StringBuilder();
        sb.append("|Fàrmac" + "\t").append("\t").append("|Quantitat\t" + "|").append("\n");
        sb.append("|---------------|---------------|").append("\n");
        for (int x = 0; x < farmacsIntroduits.length; x++) {
            for (int i = 0; i < farmacs.length; i++) {
                for (int j = 0; j < farmacs[0].length; j++) {
                    if (farmacs[i][j].equalsIgnoreCase(farmacsIntroduits[x])) {
                        if (unitats[i][j] > 0) {
                            sb.append("|").append(farmacs[i][j]).append("\t").append("|").append(unitats[i][j]).append("\t").append("\t" + "|").append("\n");
                        } else {
                            sb.append("|").append(farmacs[i][j]).append("\t").append("|" + "X" + "\t").append("\t" + "|").append("\n");
                        }
                    }
                }
            }
        }
        System.out.println(sb);
    }

    /**
     * Aquest mètode confirma la compra dels fàrmacs i fa el sumatori de tots
     * els preus dels fàrmacs que tenen unitats
     *
     * @param farmacsIntroduits els fàrmacs introduïts per l'usuari
     * @param farmacs l'array bidimensional que conté tots els fàrmacs
     * @param preus l'array bidimensional que conté tots els preus
     * @param unitats l'array bidimensional que conté totes les unitats
     */
    private static void confirmarCompraFarmacs(String[] farmacsIntroduits, String[][] farmacs, double[][] preus, int[][] unitats) {
        StringBuilder sb = new StringBuilder();
        System.out.println("==Unitats abans de la teva compra==");
        sb.append("|Fàrmac" + "\t").append("\t").append("|Preu(€)").append("|Unitat\t" + "|").append("\n");
        sb.append("|---------------|-------|-------|").append("\n");
        double sumatoriPreus = 0;
        for (int x = 0; x < farmacsIntroduits.length; x++) {
            for (int i = 0; i < farmacs.length; i++) {
                for (int j = 0; j < farmacs[0].length; j++) {
                    if (farmacs[i][j].equalsIgnoreCase(farmacsIntroduits[x])) {
                        if (unitats[i][j] > 0) {
                            sb.append("|").append(farmacs[i][j]).append("\t").append("|").append(preus[i][j]).append("\t").append("|").append(unitats[i][j]).append("\t|").append("\n");
                            sumatoriPreus += preus[i][j];
                        } else {
                            sb.append("|").append(farmacs[i][j]).append("\t").append("|").append(preus[i][j]).append("\t").append("|" + "X" + "\t" + "|").append("\n");
                        }
                    }
                }
            }
        }
        System.out.println(sb);
        if (sumatoriPreus == 0) {
            System.out.println("No s'ha comprat cap producte perquè no hi queden unitats.");
        } else {
            System.out.println("Preu total a pagar(€): " + sumatoriPreus);
        }
    }

}
