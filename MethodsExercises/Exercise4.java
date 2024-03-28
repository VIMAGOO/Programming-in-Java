import java.util.Scanner;


public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre enter:");
        int enter = sc.nextInt();
        
        int signe = obteSigne(enter);
        if (signe == 1){
            System.out.println("El nombre és positiu.");
        }
        if (signe == -1){
            System.out.println("El nombre és negatiu.");
        }
        if (signe == 0){
            System.out.println("El nombre és 0.");
        }
    }
    public static int obteSigne(int x){
        int signe = 0;
        if (x>0){
            signe = 1;
        }
        if (x<0){
            signe = -1;
        }
        if (x==0){
            signe = 0;
        }
        return signe;
    }
    
}