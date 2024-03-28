package recursivitat.exercicis;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise8a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De quina grandària vols que sigui el triangle?: ");
        int grandaria = sc.nextInt();

        triangleMenorMajor("*",grandaria, "*");
        triangleMajorMenor("*",grandaria, "*");
    }

    public static void triangleMenorMajor(String ast, int grandaria, String ast2) {
        if (grandaria == 0) {
        } else {
            
            //Toda multiplicación de dígitos y carácteres se puede 
            //expresar en un bucle con una suma (el caràcter irà subiendo x veces de valor)
            //y una resta (el caràcter se irà restando hasta que de 0, es el que marcarà
            //cuantas veces se le sumará al primer carácter su valor).
            //En este caso utilitzamos, en vez de dígitos, un String.
            
            System.out.println(ast);
            triangleMenorMajor(ast+ast2, grandaria-1, ast2);

        }
    }
    public static void triangleMajorMenor(String ast, int grandaria, String ast2) {
        if (grandaria == 0) {
        } else {
            triangleMajorMenor(ast+ast2, grandaria-1, ast2);
            System.out.println(ast);
        }
    }
}
