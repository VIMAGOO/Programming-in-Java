import java.util.Scanner;
/**
 * Aquest programa llegeix de l'usuari el dia, el mes i l'any.
 * El programa estableix distints paràmetres per determinar si la data és o no vàlida.
 * L'any ha de ser inferior a 1900.
 * Solament hi ha 12 mesos en un any.
 * Depenent del mes hi ha com a màxim diferents dies (28, 30 o 31).
 * @author vima2670
 */
public class PracticaExercici1 {

    public static void main(String[] args) {
        //scanner.
        Scanner scanner = new Scanner(System.in);
        //Establim el missatge de sortida que rebrà l'usuari.
        //Establim les variables perque el programa pogui llegir les dades introduïdes.
        System.out.println("DATA:");
        System.out.println("Introdueix el dia:");
        int dia = scanner.nextInt();
        System.out.println("Introdueix el mes (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Introdueix l'any:");
        int any = scanner.nextInt();
        
        //Paràmetre any: l'any no pot ser inferior a 1900.
        if (any<1900){
            //Si és inferior.
            System.out.println("L'any "+any+" és menor a 1900, has d'introduir un any igual o superior a 1900.");
        } else {
            //Si no és inferior.
            //Paràmetre mesos: els mesos estan dins l'interval (1-12).
            if (mes<1 || mes>12){
                //Si no són dins l'interval.
                System.out.println("El mes introduït ("+mes+") no és vàlid, solament hi ha 12 mesos.");
            } else { 
                //Si són dins l'inverval.
                //Paràmetre dies: (1-31, depenent del mes).
                if (dia<1 || dia>31){
                    //Si no són dins l'interval.
                    System.out.println("Els dies introduits ("+dia+") no són vàlids, has de posar com a màxim 31 dies, i com a mínim 1.");
                } else {
                    //Si són dins l'interval.
                    //Mesos que no poden tenir 31 dies.
                    if (dia==31 && mes==4 || mes==6 || mes==9 || mes==11){
                        System.out.println("El mes introduït ("+mes+") no té 31 dies!");
                    } else { 
                        //Mes que no pot tenir ni 29 ni 30 dies.
                        if (dia==30 || dia==29 || dia==31 && mes==2){
                            System.out.println("El mes de febrer té únicament 28 dies! Introdueix una altra vegada la data.");
                        } else {
                            //Si els anys, dies i mesos compleixen els paràmetres es mostrarà això.
                            //Els if han d'estar un dins l'altra perquè totes les dades han de ser vàlides
                            //per mostrar el resultat:
                            System.out.println("La data és vàlida.");
                            System.out.println("DATA:"+dia+"/"+mes+"/"+any+".");
                        }
                    }
                }
            }
        }
    }   
}
