import java.util.Scanner;
/**
 * Aquest codi demana dos números a l'usuari.
 * Mostra quin valor dels dos és el més gran.
 * @author vimago
 */
public class Exercise3BigNumber {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix el primer número:");
        double numero1 = lector.nextDouble();
        System.out.print("Introdueix el segon número:");
        double numero2 = lector.nextDouble();
         
if (numero1>numero2){
    System.out.println("El número més gran és el primer número:"+numero1);
}else{
    System.out.println("El número més gran és el segon número:"+numero2);
}


    }
    
}