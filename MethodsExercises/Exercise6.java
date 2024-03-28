import java.util.Scanner;


/**
 *
 * @author vimago
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer nombre enter:");
        int enter1 = sc.nextInt();
        System.out.println("Introdueix el segon nombre enter:");
        int enter2 = sc.nextInt();
        
        int compara = compara(enter1, enter2);
        switch (compara){
            case 0:
                System.out.println("El número "+enter1+" i "+enter2+" són iguals.");
                break;
            case 1:
                System.out.println("El número "+enter1+" és més gran que "+enter2+".");
                break;
            case -1:
                System.out.println("El número "+enter2+" és més gran que "+enter1+".");
                break;
        }
    }
    public static int compara(int x, int y) {
        int valor = 0;
        if (x==y){
            valor = 0;
        } else {
            if (x>y){
            valor = 1;
            } else {
            valor = -1;
            }
        }    
        return valor;
    }
}