import java.util.Scanner;


/**
 * Programa que demana tres nombres enters i informa de si compleixen la
 * desigualtat triangular. Cal implementar un mètode que rebi aquests valors 
 * i retorni un booleà.
 * @author vimago
 */
public class Exercise15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer nombre: ");
        int enter1 = sc.nextInt();
        System.out.println("Introdueix el segon nombre: ");
        int enter2 = sc.nextInt();
        System.out.println("Introdueix el tercer nombre: ");
        int enter3 = sc.nextInt();
        
        boolean desTriang = desigualtatTriangular(enter1, enter2, enter3);
        
        if (desTriang == true){
            System.out.println("Hi ha desigualtat triangular.");
        } else {
            System.out.println("No hi ha desigualtat triangular.");
        }
    }
    
    public static boolean desigualtatTriangular(int enter1,int enter2,int enter3){
        boolean desigualtatTriangular;
        if (enter1 + enter2 > enter3 && enter2 + enter3 > enter1 && enter1 + enter3 > enter2){
            desigualtatTriangular = true;
        } else {
            desigualtatTriangular = false;
        }
        return desigualtatTriangular;
    }
}
