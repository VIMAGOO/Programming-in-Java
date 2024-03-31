/**
 * En aquest programa, l'usuari entra el color del qual és
 * el semàfor, i el programa respon amb la recomanació adient.
 */
import java.util.Scanner;


public class Exercise12TrafficLightColour {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("De quin color està el semàfor?:");
        String semafor = lector.next();
        String missatge;
        
        switch(semafor){
        case "vermell":
            missatge = "No pots passar!";
            break;  
        case "taronja":
            missatge = "Atenció, has de córrer!";
            break;  
        case "verd":
            missatge = "Pots passar tranquil·lament.";
            break;  
        default:
            missatge = "La dada introduïda no és vàlida.";
            break;
    }
System.out.println(missatge);
    }
}