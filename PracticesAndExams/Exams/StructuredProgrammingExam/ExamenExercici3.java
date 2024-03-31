import java.util.Random;
import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari un valor enter positiu, 
 * aquest valor serà el valor absolut màxim on variaran els números,
 * tant negativa com positivament, per fer la practica de sumes.
 * El programa escollirà dos números aleatoris dins d'aquest interval.
 * Preguntarà a l'usuari el valor de la soma d'aquests dos números.
 * Si l'usuari encerta, és guardarà el nombre d'encerts;
 * si l'usuari falla, tindrà com a màxim 5 oportunitats.
 * Sempre, després de que l'usuari posi el valor de la suma,
 * el programa preguntarà si vol continuar.
 * Quan termini el programa es mostraràn el nombre d'errors i encerts.
 * @author vima2670
 */
public class ExamenExercici3 {

    public static void main(String[] args) {
        //Inicialitzem el lector.
        Scanner sc = new Scanner(System.in);
        //Creem missatges.
        System.out.println("PRACTICA LES SUMES");
        //Indiquem a l'usuari que introdueixi el límit de l'interval.
        System.out.println("Indica valor absolut màxim on vols que variin els números: ");
        //Guardem la respota de l'usuari.
        int limit = sc.nextInt();
        //Inicialitzem Random
        Random ran = new Random();
        //Variables que utilitzarem al bucle.
        boolean continuar = true;
        int error = 0;
        int encert = 0;
        
        //Si s'introdueix un valor negatiu.
        if (limit<0){
            System.out.println("Has introduït un valor negatiu.");
        } else {
        //if, si l'usuari entra 1 o 0, el programa no s'executarà,
        //ja que l'interval de sumes és inexistent.
        //(0+0).
        if (limit == 1 || limit == 0){
            System.out.println("No pots fer que l'interval sigui entre 0 i 0!");
        } else {
        
        //He triat el bucle do-while perquè no sabem el nombre d'iteracions que
        //es faran (l'escull l'usuari) i perquè el bucle s'ha d'executar, al menys
        //una vegada.
        //bucle do-while
        do {
            //Creem les variables Random.
            //El limit que introdueix l'usuari seràn els límits de l'interval
            //Ex(-999,999), li restem 1 a "limit" i sumem 1 a "-limit",
            //no volem que els valors que insereix l'usuari es comptin.
            int numAleat1 = ran.nextInt(-limit+1,limit-1);
           
            int numAleat2 = ran.nextInt(-limit+1,limit-1);
            
            //Missatge on es pregunta el resultat de la suma.
            System.out.println("Quin és el resultat de la suma entre "+numAleat1+" i "+numAleat2);
            //Resposta de l'usuari.
            int sumaUsuari = sc.nextInt();
            
            //Valor de la suma correcta.
            int suma = numAleat1+numAleat2;
            
            //Si la suma correcta i el valor introduït per l'usuari coincideixen.
            if (sumaUsuari==suma){
                //Sumem encert i informem a l'usuari.
                encert++;
                System.out.println("Molt bé! El resultat és correcte.");
            //Si no.
            } else {
                //Sumem l'error i informem a l'usuari.
                error++;
                if (error<5){
                System.out.println("El resultat no és correcte, portes "+error+" errors, al 5è seràs eliminat."); 
                }
            }
            //Si ha comés 5 errors.
            if (error == 5){
                //El bucle es termina i s'informa a l'usuari.
                System.out.println("GAME OVER");
                continuar = false;
            }
            
            //Si el nombre de errors és diferent a 5.
            if (error != 5){
                //Es preguntarà si vol continuar practicant
                System.out.println("Vols continuar practicant? (SI/NO)");
                //Resposta de l'usuari.
            String seguir = sc.next().toUpperCase();
            //Switch per classificar els Strings.
            switch (seguir){
                case "SI":
                    //Continuarà al bucle.
                    continuar = true;
                    break;
                case "NO":
                    //Si no vol continuar sortirà del bucle.
                    continuar = false;
                    break;
                default:
                    //Si la dada introduïda és incorrecta.
                    System.out.println("Has d'introduïr o SI o NO.");      
            }
                              
            }
            
        } while (continuar);
        //El bucle funcionarà mentre la variable continuar = true.
        }
        }
        System.out.println("Has comés "+error+" errors.");
        System.out.println("Has encertat "+encert+" sumes.");
        System.out.println("El programa ha finalitzat.");
    }
    
}
