import java.util.Scanner;

/**
 * Programa per transformar un temps en segons a hores, minuts i segons. 
 * El programa llegirà els segons, cridarà al mètode segonsAhms() 
 * i mostrarà el resultat.
 * @author vimago
 */
public class Exercise18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el temps en segons: ");
        int tempsSegons = sc.nextInt();
        
        String segonsAhms = segonsAhms(tempsSegons);
        
        System.out.println(segonsAhms);
    }
    public static String segonsAhms(int tempsSegons) {
        
        int hores = tempsSegons/3600;
        int minuts = (tempsSegons % 3600)/60;
        int segons = (tempsSegons % 3600)%60;       

        String missatge = "El teu temps són "+hores+" hores, "+minuts+" minuts i "+segons+" segons.";
      
        return missatge;
 
    }
}