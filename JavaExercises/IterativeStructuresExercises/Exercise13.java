import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;
/**
 * En aquest programa l'usuari pensa un número i el programa ha d'endevinar-lo.
 * Quan el programa digui un número, l'usuari haurà de dir-li si és més gran,
 * més petit o si és igual.
 * Si és més gran, el límit mínim serà l'últim número que ha introduït el programa,
 * i si és més petit el contrari.
 * Si és igual el programa haurà endevinat el número
 * @author vimago
 */

public class Exercise13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxim = 100;
        int minim = 1;
        Random ran = new Random();
        int numAleatori = ran.nextInt(minim,maxim);
        boolean endevinat = false;
        do {
            System.out.println("El número en el que penses és més gran (G), més petit(P) o igual (I) que "+numAleatori+"?");
            String resposta = sc.next().toUpperCase();
                    switch (resposta) {
                        case "G": 
                            minim = numAleatori;
                            numAleatori = ran.nextInt(minim,maxim);
                        break; 
                        case "P":
                            maxim = numAleatori;
                            numAleatori = ran.nextInt(minim,maxim);
                        break;
                        case "I":
                            endevinat = true;
                        break;    
                        default:
                        System.out.println("Opció no vàlida, has d'introduir SI o NO.");
                    }
                    
        } while (!endevinat);
        
        System.out.println("HE ENDEVINAT EL NÚMERO!");
    }
    
}