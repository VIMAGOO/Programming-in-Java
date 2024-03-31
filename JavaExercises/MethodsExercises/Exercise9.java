import java.util.Scanner;


/**
 * Programa que demana tres nombres enters i diu quin és el valor més gran. 
 * Implementar un mètode amb el prototip int major(int x, int y) 
 * que retorni el valor major de dos.
 * @author vimago
 */
public class Exercise9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer nombre:");
        int enter1 = sc.nextInt();
        System.out.println("Introdueix el segon nombre:");
        int enter2 = sc.nextInt();
        System.out.println("Introdueix el tercer nombre:");
        int enter3 = sc.nextInt();
        
        int majorDeDos = major(enter1, enter2);
        
        if (majorDeDos>enter3){
            System.out.println("El número més gran és "+majorDeDos);
        } else {
            System.out.println("El número més gran és "+enter3);
        }
        
    }
    
    public static int major(int x, int y) {
        int major;
        if (x>y){
            major = x;
        } else {
            major = y;
        }
        return major;
    }
}