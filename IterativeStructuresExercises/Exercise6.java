import java.util.Scanner;
/**
 * L'usuari entrarà 100 números,
 * el programa al finalitzar-se mostrarà, dels 100 números, quins són pos. i neg.
 * @author vimago
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeropos = 0;
        int numeroneg = 0;
        int i = 0;
        while (i<10){
            i++;
            System.out.println("Introdueix el número de posició "+i+":");
            double numero = scanner.nextDouble();
            if (numero>0){
                numeropos++;
            } else {
                numeroneg++;
            }  
       
             } 
     
         System.out.println("Números positius:"+numeropos);
        System.out.println("Números negatius:"+numeroneg);
        System.out.println("Fi del programa.");
    }
    
}