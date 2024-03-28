import java.util.Scanner;

/**
 * Comptar el número de vegades que una lletra apareix en un text.
 * @author vimago
 */
public class LetterAppearance {

    public static void main(String[] args) {
        //TODO implementar preguntar el text a l'usuari.
        String textAAnalitzar = "En un lugar de la mancha de cuyo nombre no quiero acordarme.";
        Scanner sc = new Scanner(System.in);
        System.out.print("Entra el caràcter a buscar:");
        char caracterABuscar = sc.next().toUpperCase().charAt(0);
        int numAparacions = comptarCharAString(textAAnalitzar, caracterABuscar);
        System.out.format("El caràcter %c apareix %d vegades",caracterABuscar, numAparacions);
        
    }
    /**
     * Compta les aparicions d'un caràcter c en un text
     * @param text --> el text on buscarem el paràmetre.
     * @param c --> el caràcter a buscar.
     * @return --> el nombre de vegades que es troba el caràcter en el text.
     */
    public static int comptarCharAString(String text, char c) {
        int comptador = 0;
        int len = text.length();
        for (int i=0; i < len; i++){ 
          char car = text.toUpperCase().charAt(i);
          if (car == c){
              comptador++;
          }
        }
        return comptador;
    }
}