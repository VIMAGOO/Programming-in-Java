import java.util.Scanner;
/**Aquest programa demanarà a l'usuari que introdueixi un número
 * fins que no volgui continuar,
 * després del missatge de no voler continuar farà 
 * la mitjana dels nombres introduïts,
 * donarà el nombre màxim i el mínim.
 * @author vimago
 */

public class Exercise17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NÚMEROS");
        boolean continuar = true; 
        //Mitjana variables.
        double mitjana = 0;
        double resultat = 0;
        double i = 0;
        //Màxim i mínim.
        double maxim = Double.MIN_VALUE;
        double minim = Double.MAX_VALUE;
        
        // do while hauria estat millor 
        while (continuar) { 
            System.out.println("Insereix un número:");
            double num = sc.nextDouble();
            //Mitjana
            i++;
            resultat = resultat + num;
            mitjana = resultat/i;
            
            //Numero més gran i número més petit.
            maxim = Math.max(maxim, num);
            minim = Math.min(minim, num);
            System.out.println("¿Vols continuar? (SI/NO)");
            String cont1 = sc.next().toUpperCase();
            switch (cont1) {
                case "NO": 
                    continuar = false;
                    break; 
                case "SI": 
                    continuar = true;
                    break; 
                default:
                    System.out.println("Opció no vàlida, has d'introduir SI o NO.");
            }
        }
        System.out.println("MITJANA:"+mitjana);
        System.out.println("MÀXIM:"+maxim);
        System.out.println("MÍNIM:"+minim);
    }
}
    