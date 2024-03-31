import java.util.Scanner;


/**
 * Programa que pregunta a l’usuari preus d’articles fins que decideix no 
 * continuar (cal preguntar a cada iteració) i mostra el preu amb IVA (21 %). 
 * Implementa el mètode float preuAmbIva(float preu).
 * 
 * @author vimago
 */
public class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    boolean continuar = true;
        do {
            System.out.println("Introdueix el preu de l'article (€): ");
            float preu = sc.nextFloat();
            float preuAmbIva = preuAmbIva(preu);
        
            System.out.println("El preu del teu article amb IVA és "+preuAmbIva+ "€");
            
            System.out.println("Vols continuar? (SI/NO)");
            String resposta = sc.next().toUpperCase();
            switch (resposta){
                case "SI":
                    continuar = true;
                    break;
                case "NO":
                    System.out.println("D'acord! Gràcies per utilitzar el programa.");
                    continuar = false;
                    break;
                default:
                    System.out.println("La dada no és vàlida.");
                    break;
            }
        
        } while (continuar);
    }
    public static float preuAmbIva(float preu){
       float preuAmbIva = (float) (preu + (preu*0.21));
       return preuAmbIva;
    }
}