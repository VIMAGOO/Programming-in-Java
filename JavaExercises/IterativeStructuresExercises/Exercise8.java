import java.util.Scanner;
/**
 * En aquest programa l'usuari entra un número enter
 *  i el programa calcula i escriu la suma i el producte dels primers N nombres naturals.
 * @author vimago
 */
public class Exercise8 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra un número enter:");
        int enter = sc.nextInt();
    int compt1 = 0;  
    int compt2 = 0;
    int result1 = 0;
    int result2 = 1;
    for (int i=1;i<=enter;i++) {
    
    System.out.println("Suma número "+i+": ");
    compt1++;
    result1 = result1 + compt1;
    int suma = result1;
    System.out.println (suma);
    
    System.out.println("Multiplicació número "+i+": ");
    compt2++;
    result2 = result2 * compt2;
    System.out.println(result2);
    
    }
    
    System.out.println("Fi del programa");
    
    }     
}