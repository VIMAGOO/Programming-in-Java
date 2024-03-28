import java.util.Scanner;


/**
 *    8. Programa que demana dos nombres enters m i n i mostra:
       a) el sumatori de nombres entre m i n, ambdós inclosos. 
           Implementar int sumatori(int m, int n)
       b) el productori de nombres entre m i n, ambdós inclosos. 
           Implementar int productori(int m, int n)  
 * @author vimago
 */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer nombre: ");
        int enter1 = sc.nextInt();
        System.out.println("Introdueix el segon nombre:");
        int enter2 = sc.nextInt();
        
        int suma = sumatori(enter1, enter2);
        int producte = productori(enter1, enter2);
        
        System.out.println("La suma dels teus números és "+suma+".");
        System.out.println("El producte dels teus números és "+producte+".");
    }
    
    public static int sumatori(int m, int n) {
        return m + n;
    }
    public static int productori(int m, int n) {
        return m * n;
    }
}