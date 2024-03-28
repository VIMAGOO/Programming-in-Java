/**
 * L'usuari introduirà les hores que ha treballat en un mes, i el programa
 * respondrà amb el seu salari mensual net i brut (taxes).
 */
import java.util.Scanner;
public class Exercise10MensualNetSalary {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el nombre d'hores que treballes:");
        int horestreball = lector.nextInt();
        int tempstreballinicial = 130;
        double salari;

if (horestreball<=tempstreballinicial){
    salari = horestreball*15;
    System.out.println("El salari sense impostos és: "+salari+"€(15€/h)");
} else { 
    salari = 130*15+(horestreball-130)*22.5;
    System.out.println("El salari sense impostos és: "+salari+"€(130h cobrant 15€/h, després 22.5€/h)");
}
    
   
if (salari<=500){
    System.out.println("No s'ha aplicat cap impost.");
} else {
    if (salari<=900) {
        salari = (salari-500)-((salari - 500)*0.25);
        System.out.println("S'ha aplicat un impost del 25% entre el seu salari i els 500€:"+salari+"€");
    } else {
        salari = (salari-900) - ((salari-900)*0.45) + (400 - (400*0.25));
        System.out.println("S'ha aplicat un impost del 45% entre el seu salari i 900€, i un impost del 25% entre els 900€ i els 500€:"+salari+"€");
    }
}
    }
}