package stringexercicis;

import java.util.Scanner;
import cat.proven.xifrat.EncriptacioCesar;

/**
 *
 * @author vimago
 */
public class EncryptMessages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        //
        System.out.println("Introdueix el missatge a xifrar: ");
        String missatgeAXifrar = sc.next();
        System.out.println("Missatge a xifrar: "+missatgeAXifrar);
        //
        System.out.println("Introdueix el desplaçament: ");
        int desplacament = sc.nextInt();
        //
        String missatgeXifrat = EncriptacioCesar.xifrarCesar(missatgeAXifrar, desplacament);
        System.out.println("El teu missatge xifrat és: "+missatgeXifrat);
        //
        String missatgeDesxifrat = EncriptacioCesar.desxifrarCesar(missatgeXifrat, desplacament);
        System.out.println("El teu missatge desxifrat és: "+missatgeDesxifrat);
    }
    
}
