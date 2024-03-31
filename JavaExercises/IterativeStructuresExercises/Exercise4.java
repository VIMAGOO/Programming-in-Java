import java.util.Scanner;
/**
 * Aquest programa demana un nombre positiu a l'usuari
 * i retorna el factorial.
 * @author vimago
 */
public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre positiu N");
        int enter = sc.nextInt();
        int factorial = 1;
        for (int i = 0; i<enter; i++){
            factorial *= (enter - i);    
        }
        System.out.println(factorial);
        System.out.println("Fi del programa.");
    }
    
}