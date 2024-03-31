/**
 * L'usuari introdueix una hora, minut i segon determinat i, a més a més,
 * uns segons. El programa s'encarregarà d'unir els dos temps introduïts i 
 * mostrar-lo en hores, minuts i segons.
 */
import java.util.Scanner;

public class Exercise9HoursMinutesSeconds {

    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix el valor d'hores:");
        int hores = lector.nextInt();
        System.out.println("Introdueix el valor de minuts:");
        int minuts = lector.nextInt();
        System.out.println("Introdueix el valor de segons:");
        int segons = lector.nextInt();
        
        System.out.println("Introdueix els segons que han passat després d'aquest temps.");
        int segonsdespres = lector.nextInt();
        
        int tempsinicial = hores * 3600 + minuts * 60 + segons;
        int tempsfinal = tempsinicial + segonsdespres;
        
        int tempsfinalhores = tempsfinal / 3600;
        int tempsfinalminuts = (tempsfinal % 3600) / 60;
        int tempsfinalsegons = tempsfinal % 60;
        
        System.out.println("Després de "+segonsdespres+" segons l'hora, minuts i segons seràn:");
        System.out.println("Hores:"+tempsfinalhores);
        System.out.println("Minuts:"+tempsfinalminuts);
        System.out.println("Segons:"+tempsfinalsegons);
    }
    
}