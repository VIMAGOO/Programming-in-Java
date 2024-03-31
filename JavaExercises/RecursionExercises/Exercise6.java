package recursivitat.exercicis;

import java.util.Scanner;

/**
 * Programa que implementa recursivament el producte de dos nombre enters.
 *
 * @author vimago
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre enter: ");
        int enter1 = sc.nextInt();
        System.out.println("Introdueix un nombre enter: ");
        int enter2 = sc.nextInt();
        int c = enter2;
        int producte = producte(enter1, enter2, c);
        System.out.println(producte);
    }

    public static int producte(int enter1, int enter2, int c) {
        int producte = 0;
        if (enter1 == 1) {
            return enter2;
        } else {
            producte = producte(enter1 - 1, enter2 + c, c);
        }
        return producte;
    }
}
