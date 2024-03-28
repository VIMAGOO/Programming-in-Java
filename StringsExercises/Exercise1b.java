package stringexercicis;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix una cadena de text: ");
        String cadena = sc.next();
        //String cadena = sc.nextLine();
        System.out.println("La cadena que has entrat és: "+cadena);
        char esp = ' ';
        Scanner strScan = new Scanner(cadena);
        strScan.useDelimiter(String.valueOf(esp));
        while (strScan.hasNext()) {
            String paraula = strScan.next();
            System.out.println(paraula);
        }
    }
    
}
