import java.util.Scanner;
/**
 * Programa que escriu la taula de multiplicació d’un número introduït per 
 * teclat. Cal implementar un mètode que rebi com a paràmetre un enter i 
 * imprimeixi la taula de multiplicació de l’enter rebut.
 * @author vimago
 */
public class Exercise11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====TAULA DE MULTIPLICAR====");
        System.out.println("Introdueix un nombre:");
        int nombre = sc.nextInt();
        
        int multiplicacio = taulaMultiplicar(nombre);
    }
    
    public static int taulaMultiplicar(int enter) {
        int taula = 0;
        for(int i = 1;i<=9;i++) {
            taula = enter * i;
            System.out.println(taula);
        }
        return taula;
    }
}