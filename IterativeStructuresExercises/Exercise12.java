import java.util.Scanner;
import java.util.Random;
/**
 * Aquest programa rebrà de l'usuari un número enter,
 * si no l'endevina el programa li dirà a l'usuari que és o més petit o més gran.
 * si l'endevina, mostrarà el nombre d'intents.
 * @author vimago
 */
public class Exercise12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables per a Random.
        final int maxim = 100;
        final int minim = 1;
        Random ran = new Random();
        //Variables que utilitzarem al bucle.
        int numSecret = ran.nextInt(minim,maxim);
        int enter;
        int intents = 0;
        boolean endevinat = false;
        //Bucle.
        do {
            //Diem a l'usuari que entri la variable.
            System.out.println("Entra un número enter: ");
            enter = sc.nextInt();
            //if
            //Si el número coincideix amb el número secret.
            if (enter==numSecret){
                //Fem que endevinat sigui igual a true per sortir del bucle.
                endevinat = true;
            //Si no coincideix.
            } else {
                //Missatge de que ha fallat.
                System.out.println("Has fallat!");
                //Afegim un intent a la variable intents.
                intents++;
                //Informem si és més gran o més petit.
                if (enter>numSecret){
                    System.out.println("El número secret és més petit");
                } else {
                    System.out.println("El número secret és més gran");
                }
            }
        } while (!endevinat);
        
        //Missatge pels usuaris que hagin endevinat el número.
        System.out.println("Has endevinat el número!");
        System.out.println("Has fet "+intents+" intents.");
        
    }
    
}