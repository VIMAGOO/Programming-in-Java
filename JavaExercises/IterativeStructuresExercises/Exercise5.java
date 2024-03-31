import java.util.Scanner;
/**
 * Aquest programa demana 10 números a l'usuari
 * diu si s'han trobat números negatius i quants han sigut.
 * @author vimago
 */
public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numneg = 0;
        boolean negatiu = false;
        for (int i = 1; i<=10; i++){
            System.out.println("Introdueix el número de posició "+i);
            int num = sc.nextInt();
            if (num<0){
                negatiu = true;
                numneg++;
            }
        }
        if (negatiu==true){
            System.out.println("S'han trobat números negatius.");
            System.out.println("NÚMEROS NEGATIUS: "+numneg);
        } else {
            System.out.println("No s'han trobat números negatius.");
        }
        
    }
    
}