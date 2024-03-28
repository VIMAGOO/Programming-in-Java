import java.util.Scanner;
/**
 * Aquest programa demana a l'usuari dos números (primer i segon), 
 * l'usuari rebrà de resposta quin és més gran dels dos
 * o si són iguals.
 * @author vimago
 */
public class Exercise6BigNumberEqual {

    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix el primer número:");
        double numero1 = lector.nextDouble();
        System.out.print("Introdueix el segon número:");
         double numero2 = lector.nextDouble();

String missatge;

if (numero1>numero2){
    missatge=String.format("El primer número és el més gran: %1.2f.", numero1); 
}else{
    if (numero1==numero2){
        missatge=String.format("El primer número: %1.2f , i el segon número: %1.2f , són iguals.", numero1, numero2);
    } else {
        missatge=String.format("El segon número és el més gran: %1.2f.", numero2);
    }
         }
 System.out.println(missatge);
    }
    
}