import java.util.Scanner;
/**
 * Aquest programa calcula la taula de l'1 al 9 de qualsevol número.
 * @author vimago
 */

public class Exercise15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TAULA DEL 1 AL 9:");
        System.out.println("Introdueix el nombre del qual "
                + "vols saber la taula: ");
        int num = sc.nextInt();
       
        for (int i = 1; i <= 9; i++){
            int mult = num * i;
            System.out.println(num+" per "+i+" és igual a: "+mult);
        }
        System.out.println("Aquesta és la taula de multiplicar del vostre número.");
    }
    
}