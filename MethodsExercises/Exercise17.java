import java.util.Scanner;

/**
 * Programa que llegeix la base Imposable de l’IRPF d’una persona i imprimeix la
 * quota a pagar segons la següent taula. 
 * 
 * base imposable:
 * 
 * Entre 0 i 10.000 €, entre 10.001 i 15.000 €, entre 15.001 i 30.000 €,  
 * entre 30.001 i 60.000 € més de 60.000 €.
 *
 * % a aplicar 5% 8% 12% 20% 25%.
 *
 * Si la persona es discapacitada està exempta de l’impost (el programa ha de
 * preguntar si ho és). Les persones de 65 o més anys d’edat tenen una reducció
 * de 250 € (el programa ha de preguntar l’edat). La quota a pagar no pot ser
 * negativa.
 *
 * El programa llegirà les dades de la persona, determinarà si està o no exempta
 * i mostrarà un missatge. Després obtindrà la quota amb la funció
 * calculaQuota() i els paràmetres adients i mostrarà el resultat per pantalla.
 *
 * @author vimago
 *
 */
public class Exercise17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina és la teva imposable?");
        double baseImposable = sc.nextDouble();
        System.out.println("Ets una persona discapacitada?");
        String persona = sc.next().toUpperCase();
        System.out.println("Quina és la teva edat?");
        int edat = (int) sc.nextDouble();
        
        double quota = calculaQuota (baseImposable, persona, edat);
        
        System.out.println("La teva quota és: "+quota+"€");
    }

    public static double calculaQuota(double baseImposable, String persona, int edat) {
        
        double quota = 0;
        
        //SWITCH PERSONA:
        switch (persona) {
            case "SI":
                quota = baseImposable;
                break;
            case "NO":
                //CÀLCUL BASE IMPOSABLE:
                if (0 <= baseImposable && baseImposable <= 10000) {
                    quota = baseImposable + (baseImposable * 0.05);
                } else {
                    if (10001 <= baseImposable && baseImposable <= 15000) {
                        quota = baseImposable + (baseImposable * 0.08);
                    } else {
                        if (15001 <= baseImposable && baseImposable <= 30000) {
                            quota = baseImposable + (baseImposable * 0.12);
                        } else {
                            if (30001 <= baseImposable && baseImposable <= 60000) {
                                quota = baseImposable + (baseImposable * 0.20);
                            } else {
                                if (baseImposable > 60000) {
                                    quota = baseImposable + (baseImposable * 0.25);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("No has respost correctament a la segona pregunta (SI o NO).");
                break;
        }
        //CÀLCUL EDAT
        if (edat>=65) {
            quota = quota - 250;
        }
        return quota;
    }
}