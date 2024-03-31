import java.util.Scanner;
/**
 * Aquest programa rebrà la base i l'exponent d'una potència
 * depenent del cas donarà una resposta o altra.
 * @author vimago
 */
public class Exercise11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de A: ");
        int A = sc.nextInt();
        System.out.print("Introduce el valor de B: ");
        int B = sc.nextInt();

        int resultat = 1;
        double resultat2 = 1;
        if (B==0) {
            System.out.println("El resultat és 1.");
        } else {
            if (A==0){
                System.out.println("El resultat és 0");
            } else {
                if (B >= 0) {
                for (int i = 1; i <= B; i++) {
                resultat *= A;
                }
                System.out.println("A^B = " + resultat);
                } else {
                for (int i = 1; i <= Math.abs(B); i++) {
                resultat2 *= A;
                }
                resultat2 = 1.0/resultat2;
                System.out.println("A^B = " + resultat2);
                }
            }
           

        }

       
        

        sc.close();
    }
}