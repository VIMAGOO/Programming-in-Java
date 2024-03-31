package recursivitat.exercicis;

import java.util.Scanner;

/**
 * Programa que entra un capital inicial, un tipus d’interès nominal anual i un
 * període de temps mesurat en any i calcula de forma recursiva el capital final
 * obtingut.
 *
 * @author vimago
 */
public class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el capital inicial: ");
        double capInici = sc.nextDouble();
        System.out.println("Entra el tipus d'interès nominal anual (%): ");
        double interesPercent = sc.nextDouble();
        System.out.println("Entra el període de temps mesurat en any: ");
        int periode = sc.nextInt();
        double interes = capInici * interesPercent / 100;
        double capFinal = capitalObtingut(capInici, interes, periode);
        System.out.println("El capital final és " + capFinal);
    }

    public static double capitalObtingut(double capInici, double interes, double periode) {
        double capFinal = 0;
        if (periode == 0) {
            return capInici;
        } else {
            capFinal = capitalObtingut(capInici + interes, interes, periode - 1);
        }
        return capFinal;

    }
}
