import java.util.Scanner;

/**
 * Programa que demana a l’usuari un caràcter i un número de línies i 
 * imprimeix un triangle amb el número de línies indicat i el caràcter 
 * especificat. Cal usar un mètode que rebi aquests valors.
Exemple (caràcter ‘a’ i 4 línies):
a
aa
aaa
aaaa
 * 
 * @author vimago
 */
public class Exercise13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el tipus de caràcter:");
        String caracter = sc.next();
        System.out.println("Introdueix el número de línies:");
        int linia = sc.nextInt();
        
        String triangle = triangle (caracter, linia);
    }
    public static String triangle(String caracter, int linia) {
        for(int i = 1; i<=linia; i++){
            
            for(int j = 1; j <= i;j++){
                System.out.print(caracter);
            }
            
            System.out.println("");
        }
        return caracter;
    }
}