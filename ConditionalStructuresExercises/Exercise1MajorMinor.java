import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Aquest programa demana a l'usuari la seva edat,
 * l'usuari rebrà com a resposta si es menor o major d'edat.
 * @author vimago
 */
public class Exercise1MajorMinor {

    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      System.out.print("Quina és la teva edat?:");
      try {
        int edat = lector.nextInt();      
      String missatge;
      
if (edat>=0){
        
    if (edat>=18){
        missatge = "Ets major d'edat.";
         
    } else {
        missatge = "No ets major d'edat.";
    }

} else {
    missatge = "L'edat no és vàlida";
    }


//Mostrar a l'usuari els missatges.
System.out.println(missatge);
}catch (InputMismatchException e){ 
    System.out.println("Els caràcters introduïts no són nombres enters o són lletres.");
}
    }
}