import java.util.Scanner;
import java.util.Arrays;

/**
 * Programa que demana les dades de pes d'un nombre de persones a determinar per
 * l'usuari i mostra els valors mínim, màxim, mitjana i el nombre de persones
 * que tenen pes superior a la mitjana.
 *
 * @author vimago
 */
public class Exercise10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==DADES DE PES==");
        System.out.println("Introdueix el nombre de persones: ");
        int persones = sc.nextInt();
        double [] pes = new double[persones];

        for (int i = 0; i < pes.length; i++) {
            System.out.println("Introdueix el pes de la persona " + (i + 1) + ":");
            pes[i] = sc.nextInt();
        }
        double pesMaxim = pes[0];
        double pesMinim = pes[0];
        double pesTotal = 0;
        double mitjana = 0;
        int personesPesSuperiorMitjana = 0;
        for (int i = 1; i < pes.length; i++) {
            if (pesMaxim < pes[i]) {
                pesMaxim = pes[i];
            }
            if (pesMinim > pes[i]) {
                pesMinim = pes[i];
            }
            pesTotal += pes[i];
            mitjana = pesTotal / persones;
        }
        for (int i = 1; i < pes.length; i++) {
            if (pes[i] > mitjana) {
                personesPesSuperiorMitjana++;
            }
        }
        System.out.println("==RESULTATS==");
        System.out.println("Pes màxim: " + pesMaxim);
        System.out.println("Pes mínim: " + pesMinim);
        System.out.println("Mitjana: " + mitjana);
        System.out.println("Persones amb pes superior a la mitjana: " + personesPesSuperiorMitjana);

    }

}