import java.util.Scanner;
/**
 * L'usuari haurà d'introduïr una edat, 
 * si la edat és incorrecta, tornarà a preguntar l'edat fins que sigui vàlida.
 * @author vimago
 */
public class Exercise19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        while (!valida){
            System.out.println("Quina es la teva edat?");
            int edat = sc.nextInt();
            if (edat>100 || edat<1){
                System.out.println("L'edat no és vàlida.");
            } else {
                valida = true;
            }
        }
        System.out.println("L'edat és vàlida.");
    }
    
}