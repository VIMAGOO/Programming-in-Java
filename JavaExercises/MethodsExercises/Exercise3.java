import java.util.Scanner;


public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introdueix el segon número:");
        int num2 = sc.nextInt();
        int menor = menor(num1,num2);
        System.out.println("El número més petit és "+menor+".");
    }
    public static int menor(int num1, int num2) {
        int menor = Math.min(num1,num2);
        return menor;
    }
}