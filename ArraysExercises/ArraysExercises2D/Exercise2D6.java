import arrays2d.Matrius;
import static arrays2d.Matrius.matrixToTable;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Desenvolupeu un programa que ofereixi opcions per a mantenir les notes d’un
 * mòdul d’un cicle formatiu Les dades consisteixen en una llista d’alumnes (com
 * a màxim 30) i una taula amb les notes de les UF, amb valors enters de 0 a 10.
 * Cal establir amb variables o constants el nombre máxim d’alumnes i el nombre
 * d’UF que té el mòdul. Inicialment els noms de tots els alumnes serà nul,
 * mentre que el valor de totes les notes serà 0. 
 * L’usuari podrà: 
 * 0. sortir 
 * 1. llistar tots els noms dels alumnes del mòdul 
 * 2. llistar totes les notes de tots els alumnes 
 * 3. llistar totes les notes d’un alumne (demanar el nom) 
 * 4. llistar els alumnes amb totes les UF aprovades i la nota promig del mòdul 
 * 5. llistar la nota d’una UF d’un alumne (demanar el nom de l’alumne i la UF) 
 * 6. canviar la nota d’un alumne en una UF (demanar el nom de l’alumne i la UF)
 *
 * @author vimago
 */
public class Exercise2D6 {

    public static void main(String[] args) {
        //definició de dades
        final int MAX_ALUMNES = 30;
        final int NUM_NOTES = 3;
        int numAlumnes = 0;
        String[] nomsAlumnes = new String[MAX_ALUMNES];
        int[][] notes = new int[MAX_ALUMNES][NUM_NOTES];
        boolean continuar = true;
        //
        numAlumnes = generarDades(nomsAlumnes, notes);
        //
        do { //bucle de control
            int opcioSel = mostrarMenu();
            switch (opcioSel) {
                case 0: //sortir
                    continuar = false;
                    break;
                case 1: //llistar noms alumnes
                    llistarNomsAlumnes(nomsAlumnes, numAlumnes);
                    break;
                case 2:
                    llistarNotesAlumnes(notes, numAlumnes, nomsAlumnes);
                    break;
                case 3:
                    llistarNotesPerAlumne(nomsAlumnes, numAlumnes, notes);
                    break;
                case 4:
                    llistarAlumnesAprovatsPromigNota(nomsAlumnes, notes, numAlumnes, NUM_NOTES);
                    break;
                case 5:
                    llistarNotaUFAlumne(notes, numAlumnes, nomsAlumnes);
                    break;
                case 6:
                    canviarNotaUFAlumne(notes, numAlumnes, nomsAlumnes);
                    break;
                default:
                    System.out.println("La dada introduïda no és correcta.");
                    break;
            }
        } while(continuar);
        System.out.println("Gràcies per utilizar el programa.");
    }
    
    /**
     * mostra un menú i pregunta quina opció vol a l'usuari
     * @return el número de l'opció escollida per l'usuari o opció -1 si no és vàlida
     */
    private static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        String[] opcions = {"Sortir", 
            "Llistar tots els noms dels alumnes del mòdul", 
            "Llistar les notes de tots els alumnes", 
            "Llistar les notes d'un alumne", 
            "Llistar els alumnes amb totes les UF aprovades i la nota promig del mòdul", 
            "Llistar la nota d’una UF d’un alumne", 
            "Canviar la nota d’un alumne en una UF"};
        System.out.println("===MENÚ DE GESTIÓ DE NOTES===");
        for (int i = 0; i < opcions.length; i++) {
            System.out.format("%d. %s%n", i, opcions[i]);
        }
        int opcio;
        try {
        System.out.println("Selecciona una opció: ");
        opcio = sc.nextInt();
        } catch (InputMismatchException e) {
            opcio = -1;
        }
        return opcio;
    }
    
    /**
     * 
     * @param nomsAlumnes
     * @param notes 
     */
    private static int generarDades(String[] nomsAlumnes, int[][] notes) {
        
        nomsAlumnes[0] = "Pere";
        notes[0][0] = 0;
        notes[0][1] = 1;
        notes[0][2] = 4;
        
        nomsAlumnes[1] = "Pablo";
        notes[1][0] = 10;
        notes[1][1] = 8;
        notes[1][2] = 9;
        
        nomsAlumnes[2] = "Miquel";
        notes[2][0] = 10;
        notes[2][1] = 9;
        notes[2][2] = 1;
        
        return 3;
    }
    
    /**
     * mostra la llista de noms de alumnes
     * @param nomsAlumnes llista amb els noms dels alumnes
     */
    private static void llistarNomsAlumnes(String[] nomsAlumnes, int numAlumnes) {
        System.out.println("LLISTA D'ALUMNES");
        for (int i = 0; i < numAlumnes; i++) {
            System.out.println(nomsAlumnes[i]);
        }
    }
    
    /**
     * pregunta a l'usuari el nom de l'alumne, el busca a la llista d'alumnes i, si el troba
     * mostra les seves notes, i si no el troba informarà a l'usuari de que no hi es.
     * @param nomsAlumnes llista dels noms dels alumnes
     * @param numAlumnes número d'alumnes
     * @param notes notes dels alumnes
     */
    private static void llistarNotesPerAlumne(String[] nomsAlumnes, int numAlumnes, int[][] notes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin alumne vols buscar(nom)?: ");
        String nomAlumne = sc.next();
        int fila = -1;
        for(int i = 0; i < numAlumnes; i++) {
            if(nomsAlumnes[i].equals(nomAlumne)) {
                fila = i;
            }
        }
        if(fila == -1) {
            System.out.println("No s'ha trobat el nom.");
        } else {
            
            System.out.println("NOTES DE L'ALUMNE "+nomAlumne.toUpperCase()+":");
            for (int i = 0; i < 3; i++) {
                System.out.println(notes[fila][i]);
            }
            
        }
        
    }

    private static void llistarNotesAlumnes(int[][] notes, int numAlumnes, String[] nomsAlumnes) {
        System.out.println("LLISTA NOTES DELS ALUMNES");
        for (int i = 0; i < numAlumnes; i++) {
            System.out.println(nomsAlumnes[i]);
            for(int j = 0; j < notes[0].length; j++){
            System.out.println(notes[i][j]);   
            }       
        }
    }

    private static void llistarAlumnesAprovatsPromigNota(String[] nomsAlumnes, int[][] notes, int numAlumnes, int NUM_NOTES) {
        System.out.println("ALUMNES APROVATS I NOTA PROMIG");
        int sumatoriNotes = 0;
        int mitjana = 0;
        for (int i = 0; i < numAlumnes; i++) {
            
            sumatoriNotes = 0;
            mitjana = 0;
            
            for(int j = 0; j < notes[0].length; j++){
            sumatoriNotes += notes[i][j];
            
            }
            
            mitjana = sumatoriNotes/NUM_NOTES;
            if (notes[i][0] >= 5 && notes[i][1] >= 5 && notes[i][2] >= 5) {
                System.out.println("L'alumne "+nomsAlumnes[i]+" ha aprovat totes les UF.");
                System.out.println("    Mitjana del mòdul de "+nomsAlumnes[i]+": "+mitjana);
            }
        }

     
       
        
    }

    private static void llistarNotaUFAlumne(int[][] notes, int numAlumnes, String[] nomsAlumnes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin alumne vols buscar(nom)?: ");
        String nomAlumne = sc.next();
        System.out.println("Quina UF vols?( 0, 1, 2):");
        int uf = sc.nextInt();
        if (uf == 0 || uf == 1 || uf == 2) {
        int fila = -1;
        for(int i = 0; i < numAlumnes; i++) {
            if(nomsAlumnes[i].equals(nomAlumne)) {
                fila = i;
            }
        }
        if(fila == -1) {
            System.out.println("No s'ha trobat el nom.");
        } else {
            System.out.println("NOTES DE LA UF "+uf+" DE L'ALUMNE "+nomAlumne.toUpperCase()+":");
            System.out.println(notes[fila][uf]);

            
        }
        } else {
            System.out.println("Solament hi ha 3 UFs: 0, 1 i 2.");
        }
    }

    private static void canviarNotaUFAlumne(int[][] notes, int numAlumnes, String[] nomsAlumnes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De quin alumne vols buscar(nom)?: ");
        String nomAlumne = sc.next();
        System.out.println("Quina UF vols canviar?( 0, 1, 2):");
        int uf = sc.nextInt();
        if (uf == 0 || uf == 1 || uf == 2) {
        System.out.println("Per quina nota la vols canviar?: ");
        int nota = sc.nextInt();
        if ( nota <= 10 && nota >= 0) {
        int fila = -1;
        for(int i = 0; i < numAlumnes; i++) {
            if(nomsAlumnes[i].equals(nomAlumne)) {
                fila = i;
            }
        }
        if(fila == -1) {
            System.out.println("No s'ha trobat el nom.");
        } else {
            notes[fila][uf] = nota;
            System.out.println("S'han guardat els canvis");
        }
        } else {
            System.out.println("Has d'introduïr una nota entre 0-10.");
        }
        } else {
            System.out.println("Solament hi ha 3 UFs: 0, 1 i 2.");
        }
    }
    

}