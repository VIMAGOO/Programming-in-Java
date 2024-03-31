import java.util.Scanner;


public class Exercise2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teva edat:");
        int edat = sc.nextInt();
        boolean majorEdat = esMajorEdat(edat);
        if (majorEdat == true){
            System.out.println("Ets major d'edat.");
        } else {
            System.out.println("Ets menor d'edat.");
        }
    }
    public static boolean esMajorEdat (int edat){
        boolean esMajorEdat;
        if (edat >=18){
            esMajorEdat = true;
        } else {
            esMajorEdat = false;
        }
        return esMajorEdat;
    }
}