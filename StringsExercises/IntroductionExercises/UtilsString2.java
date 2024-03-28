
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class UtilsString2 {

    public static void main(String[] args) {
        String s = new String("Hola dawbio!");
        System.out.println("El teu String és: " + s);
        System.out.println("Cónte " + s.length() + " caràcters.");
        System.out.println("Comença amb el caràcter: " + s.charAt(0));
        System.out.println("Acaba amb el caràcter: " + s.charAt(s.length() - 1));

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digues un index per mostrar-te el caràcter: ");
            int idx = sc.nextInt();
            System.out.println("El caràcter de l'índex " + idx + " és " + s.charAt(idx));
//        } catch (InputMismatchException | StringIndexOutOfBoundsException e) {
//            System.out.println("No has introduït un valor correcte o hi ha hagut un error a l'índex.");
        } catch (StringIndexOutOfBoundsException e1) {
            System.out.println("Error índex.");
        } catch (InputMismatchException e3) {
            System.out.println("Has introduït un valor que no és enter.");
        }
        
        String s2 = new String("Aola dawbio!");
        String s3 = new String("Lola dawbio!");
        String s4 = "Hola dawbio!";
        
            
    }

}
