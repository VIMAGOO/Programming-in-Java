import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari un nombre enter
 * i retornarà tots els números parells fins aquest nombre.
 * @author vimago
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre enter: ");
        int enter = sc.nextInt();
        int numParell = 0;
        for (int i = 1; i<=enter; i++){
            if (i % 2 == 0){
                numParell++;
            }
        }
        System.out.println("Números parells: "+numParell);
    }
    
}