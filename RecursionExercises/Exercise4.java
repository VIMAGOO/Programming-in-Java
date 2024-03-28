package recursivitat.exercicis;

import java.util.Scanner;

/**
 * Programa que calcula el número N-éssim (amb N entrat per teclat) de la serie
 * de Fibonacci.
 *
 * @author vimago
 */
public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix n: ");
        int num = sc.nextInt();
        int numFibo = fibo(num);
        System.out.println(numFibo);
    }

    private static int fibo(int num) {
        if (num == 0 || num == 1) {
        } else {
            num = fibo(num - 1) + fibo(num - 2);
        }
        return num;
    }

}
