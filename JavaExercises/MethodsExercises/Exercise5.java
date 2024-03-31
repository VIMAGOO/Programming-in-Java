import java.util.Scanner;


public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el valor a milles.");
        double milles = sc.nextDouble();
        
        double quilometres = millesAKm(milles);
        System.out.println(milles+" milles són "+quilometres+" quilòmetres.");
    }
    public static double millesAKm(double milles){
        double quilometres = milles * 1.6093;
        return quilometres;
    }
}