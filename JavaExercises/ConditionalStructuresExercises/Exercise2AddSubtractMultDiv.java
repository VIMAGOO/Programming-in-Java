import java.util.Scanner;
/**
 * Aquest programa que el farà serà el següent:
 * Llegirà dos números (numero1 i numero 2)
 * Farà les següents operacions: suma, resta, multiplicació i divisió.
 * En el cas que numero1 i numero2 sigui zero, no donarà la resposta.
 * En el cas que únicament numero2 sigui zero, no donarà la resposta.
 * @author vimago
 */


public class Exercise2AddSubtractMultDiv {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       System.out.print("Introdueix el primer número");
       double numero1 = lector.nextDouble();
       System.out.println("Introdueix el segon número");
       double numero2 = lector.nextDouble();
       
       //Establim les variables de les operacions.
       
        double suma = numero1+numero2;
        double resta = numero1-numero2;
        double mult = numero1*numero2;
        double div = numero1/numero2;
  //Condicional pare: numero1 és igual a 0?
  //Si és així:
  if (numero1==0){
      //Si numero1=0, numero2 també és igual a 0?
      //Si es així mostrarà el primer missatge.
      if (numero2==0){
            System.out.format("Tingues en compte que estàs intentant dividir 0 entre 0.");
      //Si no mostrarà el segon missatge.
      } else {
            System.out.format("La suma dona"+suma+", la resta"+resta+", la multiplicació"+mult+"y la divisió"+div);
      }
  //Si no és així:
  } else {
      //Si numero1 no és igual a 0, numero2 continua sent 0?
      //Si és així mostrarà el primer missatge.
       if (numero2==0) {
            System.out.format("Tingues en compte que estàs intentant dividir entre 0!!");
      //Si no és així mostrarà el segon missatge.
       } else {
            System.out.format("La suma dona"+suma+", la resta"+resta+", la multiplicació"+mult+"y la divisió"+div);
   }
  }
  
  
    }
}