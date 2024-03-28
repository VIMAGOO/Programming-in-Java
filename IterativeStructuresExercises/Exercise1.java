import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari un nombre enter
 * i retornarà tots els nombres naturals fins aquest nombre.
 * @author vimago
 */
public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre enter: ");
        int enter = sc.nextInt();

        for (int i = 1; i<=enter; i++){
            System.out.println(i);
        }
        System.out.println("Fi del programa.");
    }
    
}