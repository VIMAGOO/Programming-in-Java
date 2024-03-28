package recursivitat.exercicis;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.print("Sumar fins a quin número: ");
        Scanner lector = new Scanner(System.in);
        int num = lector.nextInt();  // Últim enter a sumar, a entrar per l'usuari
        if (num > 0) {
            int suma = sumaRecursiva(num);
            System.out.print("La suma és: " + suma);
        } else {
            System.out.println("El nombre ha de ser positiu");
        }
    }

    static int sumaRecursiva(int n) {
        return ((n == 1) ? 1 : n + sumaRecursiva(n - 1));
    }

}
