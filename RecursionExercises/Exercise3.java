package recursivitat.exercicis;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un número enter: ");
        int num = sc.nextInt();
        ImprimirNaturals(num);
    }

    private static void ImprimirNaturals(int num) {
        if (num == 1) {
            System.out.println(1);
        } else {
            System.out.println(num);
            ImprimirNaturals(num - 1);
        }
    }
}
