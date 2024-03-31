/**
 * L'usuari introdueix dos nombres, el preu de l'article i el que ha pagat.
 * El programa li diurà a l'usuari si falten diners per pagar l'article
 * o si, contràriament, resten.
 */
import java.util.Scanner;

public class Exercise11LeftOverOrMissing {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix el preu de l'article:");
        double preuarticle = lector.nextDouble();
        System.out.println("Introdueix la quantitat que has pagat");
        double diners = lector.nextDouble();
        

if (preuarticle>diners){
    double faltapagar = preuarticle - diners;
    System.out.println("Et falten per pagar "+faltapagar+"€");
} else {
    double sobren = diners - preuarticle;
    System.out.println("T'han de donar "+sobren+"€");
}
    }
    
}