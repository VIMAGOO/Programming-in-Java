import java.util.Scanner;

/**
 * En aquest programa, l'usuari entrarà 100 números.
 * Si introdueix un número igual a 0
 * s'acabarà el bucle i es mostraran els resultats sense comptar el 0
 * (números positius i negatius).
 * @author vimago
 */
public class Exercise7 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int i = 0;
       int numeropos = 0;
       int numeroneg = 0;
       boolean cero = false;
       while (!cero) {
           i++;
           System.out.println("Introdueix el número de posició "+i+":");
           double numero = scanner.nextDouble();

           if (numero==0) {
               System.out.println("S'ha introduït el número 0.");
               cero = true;
           } else {
                if (numero>0){
                numeropos++;
                } else {
                numeroneg++;
            }  
           }
            
       }
        System.out.println("Números positius:"+numeropos);
        System.out.println("Números negatius:"+numeroneg);
        System.out.println("Fi del programa.");
           
       
    }
    
}