import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise16 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introdueix el primer coeficient:");
    double a = sc.nextDouble();
    System.out.println("Introdueix el segon coeficient:");
    double b = sc.nextDouble();
    System.out.println("Introdueix el tercer coeficient:");
    double c = sc.nextDouble();

    double discriminant = b * b - 4 * a * c;
    double numerador = (-b + Math.sqrt(b * b - 4 * a * c));
    double denominador = (2 * a);
    
    if (a == 0) {
        System.out.println("No és una ecuació de segon grau (a = 0).");
    } else if (discriminant < 0) {
        System.out.println("L'equació no té soluciones reals (discriminant negatiu).");
    } else if (discriminant == 0) {
        double solucio = funcioPos(a, b, c);
        System.out.println("L'equació té una única solució: " + solucio);
    } else if (numerador != 0 && denominador == 0) {
        System.out.println("El denominador és 0! Hi ha infinites solucions.");
    } else if (numerador == 0 && denominador == 0) {
        System.out.println("El denominador i el numerador són igual a 0. Error.");
    } else {
        double solucioPos = funcioPos(a, b, c);
        double solucioNeg = funcioNeg(a, b, c);
        
        System.out.println("Les solucions són: ");
        System.out.println("PRIMERA SOLUCIÓ: " + solucioPos);
        System.out.println("SEGONA SOLUCIÓ: " + solucioNeg);
    }
}

public static double funcioPos(double a, double b, double c) {
    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    return x1;
}

public static double funcioNeg(double a, double b, double c) {
    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    return x2;
}
    
}