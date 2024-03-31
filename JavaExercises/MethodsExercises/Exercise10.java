import java.util.Scanner;


/**
 * Programa que demana a l’usuari una data (any, mes, dia) i informa de si és 
 * o no correcta. Per simplificar, suposarem que tots els mesos tenen 30 dies. 
 * Cal implementar un mètode que rebi les dades i retorni un booleà.
 * @author vimago
 */
public class Exercise10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----DATA----");
        System.out.println("Introdueix l'any: ");
        int any = sc.nextInt();
        System.out.println("Introdueix el mes: ");
        int mes = sc.nextInt();
        System.out.println("Introdueix el dia: ");
        int dia = sc.nextInt();
        
        boolean dataCorrecta = dataCorrecta(dia, mes);
        if (dataCorrecta == true){
            System.out.println("Totes les dades són correctes.");
        } else {
            System.out.println("La data introduïda no és correcta.");
        }
    }
    
    public static boolean dataCorrecta(int dia, int mes){
        boolean correcta = true;
        
        if (dia>30 || dia<1 || mes>12 || mes<1){
            correcta = false;
        } else {
            correcta = true;
        }
        return correcta;
    }
    
}