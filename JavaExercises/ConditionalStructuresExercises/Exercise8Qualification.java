/**
 * Aquest programa s'encarrega de donar una calificació a l'usuari
 * quan introdueix un número de l'1 al 10.
 */
import java.util.Scanner;

public class Exercise8Qualification {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix la nota:");
        double nota = lector.nextDouble();
String missatge = null;

if (nota>10){
    missatge = "La nota no pot ser superior a 10.";
} else {
    if (nota<0){
         missatge = "La nota no pot ser inferior a 0.";
    } else {
        if (nota>=9){
             missatge = "Has obtingut una nota excel·lent.";
        } else {
            if (nota>=7){
                missatge = "Has obtingut una nota notable.";
            } else {
                if (nota>=6){
                    missatge = "Has obtingut un bé com a nota.";
                } else {
                    if (nota>=5){
                        missatge = "Has obtingut una nota suficient.";
                    } else {
                        if (nota>=3){
                          missatge = "Has obtingut una nota deficient.";
                        } else {
                            if (nota>=0) {
                                missatge = "Has obtingut una nota molt deficient";
                            }
                }
                }
                }
            }
                
                        
        }
           
        
    }       
    
                
               
}
   System.out.println(missatge); 
    }
    
}