/**
 * Aquest programa llegeix de l'usuari una quantitat d'euros
 * i la converteix en la quantitat equivalent d'altres monedes.
 */
import java.util.Scanner;
public class Exercise13Coin {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix la quantitat d'€ que vols convertir:");
        double euro = lector.nextDouble();
        
        double dolars = euro * 1.05;
        double libra = euro * 0.87;
        double ien = euro * 156.66;
        
        System.out.println("MENÚ DE MONEDES:");
        System.out.println("Dólars: "+dolars);
        System.out.println("Libra: "+libra);
        System.out.println("Ien: "+ien);
    }
    
}