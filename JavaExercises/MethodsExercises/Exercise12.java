import java.util.Scanner;


/**
 * Programa que demana a l’usuari un preu sense i amb descompte i informa del 
 * percentatge de descompte que s’hi ha aplicat. Cal crear un mètode que rebi 
 * els preus i retorni el percentatge de descompte.
 * 
 * @author vimago
 */
public class Exercise12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==CALCULADORA DE PERCENTATGES==");
        System.out.println("Introdueix el preu sense descompte: ");
        double preu = sc.nextDouble();
        System.out.println("Introdueix el preu amb descompte: ");
        double preuDesc = sc.nextDouble();
        
        double perDesc = percentatgeDescompte (preuDesc, preu);
        
        System.out.println("El percentatge de descompte és "+perDesc+"%.");
    }
    
    public static double percentatgeDescompte(double x, double y) {
        return (1-(x/y))*100;
    }
}