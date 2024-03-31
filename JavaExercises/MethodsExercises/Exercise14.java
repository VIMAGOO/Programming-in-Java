import java.util.Scanner;


/**
 * Programa que calcula la hipotenusa d’un triangle. 
 * (El mètode principal llegirà els catets i cridarà el mètode hipotenusa() 
 * al qual passarà els catets. Aquest mètode retornarà el valor de la 
 * hipotenusa, el qual serà mostrat per pantalla pel mètode principal)

 * @author vimago
 */
public class Exercise14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el valor del primer catet:");
        double catet1 = sc.nextDouble();
        System.out.println("Introdueix el valor del segon catet:");
        double catet2 = sc.nextDouble();
        
        double hipotenusa = hipotenusa(catet1,catet2);
        System.out.println("La hipotenusa del teu triangle és "+hipotenusa);
    }
    
    public static double hipotenusa(double catet1, double catet2) {
        double hipotenusa = Math.sqrt(Math.pow(catet1, 2) + Math.pow(catet2, 2));
        return hipotenusa;        
    }
    
}