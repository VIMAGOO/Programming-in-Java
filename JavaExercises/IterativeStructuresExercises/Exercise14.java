import java.util.Scanner;

/**
 * Aquest programa rebrà de l'usuari una quantitat de diners múltiple de 5,
 * el mateix programa s'encarregarà de dividir aquesta quantitat de diners
 * a billets.
 * @author vimago
 */
public class Exercise14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el valor que vols per canviar a billets: ");
        int diners5 = sc.nextInt();
        
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int diners = diners5;
        if (diners>5){
            if (diners%5==0){
                while (diners!=0){
                    if (diners>=500){
                        diners = diners-500;
                        b500++; 
                    } else {
                        if (diners>=200){
                            diners = diners-200;
                            b200++;
                        } else {
                            if (diners>=100){
                                diners = diners-100;
                                b100++;
                            } else {
                                if (diners>=50){
                                    diners = diners-50;
                                    b50++;
                                } else {
                                    if (diners>=20){
                                        diners = diners-20;
                                        b20++;
                                    } else {
                                        if (diners>=10){
                                            diners = diners-10;
                                            b10++;
                                        } else {
                                            if (diners>=5){
                                                diners = diners-5;
                                                b5++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("El número ha de ser múltiple de 5.");
            }
        } else {
            System.out.println("La quantitat ha de ser major a 5€!");
        }
        System.out.println("BILLETS 500: "+b500);
        System.out.println("BILLETS 200: "+b200);
        System.out.println("BILLETS 100: "+b100);
        System.out.println("BILLETS 50: "+b50);
        System.out.println("BILLETS 20: "+b20);
        System.out.println("BILLETS 10: "+b10);
        System.out.println("BILLETS 5: "+b5);
        
    }
    
}