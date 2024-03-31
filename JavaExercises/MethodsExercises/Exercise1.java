import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer nombre:");
        double num1 = sc.nextDouble();
        System.out.println("Introdueix el segon nombre:");
        double num2 = sc.nextDouble();
        
        double resultat = multiplica(num1,num2);
        System.out.println("Resultat: "+resultat);
    }
    
    public static double multiplica(double a, double b){
        double mult = a * b;
        return mult;
    }
}