package recursivitat.exercicis;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise8b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De quina grandària vols que sigui el triangle?: ");
        int grandaria = sc.nextInt();

        triangleMenorMajor("*", grandaria);
        triangleMajorMenor("*", grandaria);
    }

    public static void triangleMenorMajor(String ast, int grandaria) {
        if (grandaria == 0) {
        } else {
            triangleMenorMajor(ast, grandaria - 1);
            System.out.println(ast.repeat(grandaria));
        }
    }

    public static void triangleMajorMenor(String ast, int grandaria) {
        if (grandaria == 0) {
        } else {
            System.out.println(ast.repeat(grandaria));
            triangleMajorMenor(ast, grandaria - 1);

        }
    }
}
