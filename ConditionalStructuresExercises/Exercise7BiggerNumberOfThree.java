import java.util.Scanner;
/**
 * El programa demana a l'usuari 3 números i respon amb quin dels tres números
 * és el més gran.
 * @author vimago
 */

public class Exercise7BiggerNumberOfThree {

    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix el primer número:");
        double numero1 = lector.nextDouble();
        System.out.print("Introdueix el segon número:");
        double numero2 = lector.nextDouble();
        System.out.print("Introdueix el tercer número:");
        double numero3 = lector.nextDouble();
        
String missatge;

if (numero1>numero2){
    if (numero1>numero3){
        
        missatge = String.format("El primer número és el més gran: %1.2f.", numero1);
                
    } else {
        
        missatge = String.format("El tercer número és el més gran: %1.2f.", numero3);
        
    }


}else{
    if (numero2>numero3) {
        
        missatge = String.format("El segon número és el més gran: %1.2f.", numero2);
                
    } else {
        
        missatge = String.format("El tercer número és el més gran: %1.2f.", numero3);
        
    }
         
}

System.out.println(missatge);
    }
    
}