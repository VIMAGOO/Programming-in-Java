import java.util.Scanner;
/**
 * Aquest codi demana a l'usuari dos números.
 * Determina quin dels dos números és més gran.
 * Els ordena en ordre ascendent.
 * @author vimago
 */
public class Exercise5AscendingNumber {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix el primer número:");
        double numero1 = lector.nextDouble();
        System.out.print("Introdueix el segon número número:");
        double numero2 = lector.nextDouble();
       
System.out.println("Números en sentit ascendent:");
        String missatge;
if (numero1>numero2){
    missatge=String.format("%1.2f --> %1.2f", numero2, numero1);
    
}else{
    missatge=String.format("%1.2f --> %1.2f", numero1, numero2);
         }
System.out.println(missatge);
    }
    
}