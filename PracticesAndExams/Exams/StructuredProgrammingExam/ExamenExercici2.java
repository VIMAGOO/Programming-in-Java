import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari un número enter positiu, 
 * aquests seran els números que entrarà futurament.
 * Després el programa rebrà un número llindar.
 * L'usuari anirà introduïnt números fins que el nombre de números 
 * sigui igual al valor que va introduïr inicialment.
 * Si és negatiu, el programa continuarà demanant un número fins que 
 * sigui positiu.
 * Una vegada es compleixi amb la quantitat de números, es mostraràn
 * els números totals entrats,
 * el valor del número llindar,
 * quants números són iguals o més grans que el número llindar.
 * @author vima2670
 */
public class ExamenExercici2 {

    public static void main(String[] args) {
        //Inicialitzem el lector.
        Scanner sc = new Scanner(System.in);
        //Creem missatges, un per contextualitzar i altre per demanar
        //a l'usuari quants números vol entrar.
        System.out.println("PROGRAMA LLINDAR:");
        System.out.println("Quants números vols entrar?");
        //Resposta de l'usuari.
        int numEntrar = sc.nextInt();
        //Missatge per demanar a l'usuari el valor del llindar.
        System.out.println("Quin número vols posar com a llindar?");
        //Resposta de l'usuari.
        int llindar = sc.nextInt();
        
        //Variables que utilitzarem al bucle.
        int num;
        int llindarAmuntIgual = 0;
        int numTotal = 0;
        
        //He triat fer-lo amb bucle for perquè sabem quantes iteracions hem
        //de fer, les que demani l'usuari.
        //bucle for.
        for (int i = 1; i<=numEntrar; i++){
            //Missatge per demanar els números a l'usuari,
            //per a que l'usuari sàpiga quants números li queden
            //posem la variable "i".
            System.out.println("Introdueix el número de posició "+i+":");
            //resposta de l'usuari.
            num = sc.nextInt();
            //Si el número és més gran o igual a 0
            if (num>=0){
                //Si el número és més gran o igual al llindar.
                if (num>=llindar){
                    //Afegim un punt més a la variable
                    //és més gran o igual.
                    //Afegim un punt més al total de números entrat.
                    llindarAmuntIgual++;
                    numTotal++;
                //Si és més petit al llindar.
                } else {
                    //Afegim també un punt més al total de números entrat.
                    numTotal++;
                }
            //Si no és més gran a 0, és negatiu.
            } else {
                //Creem un missatge
                System.out.println("No pots introduïr números negatius! Prova una altra vegada.");
                //Restem a les iteracions 1 perquè el valor negatiu no compti
                //i solament comptin els positius.
                i--;
            }
        }
        //Finalment, quan surti del bucle, aquests missatges els rebrà l'usuari.
        System.out.println("DADES NÚMEROS INTRODUÏTS: ");
        System.out.println("Números entrats: "+numTotal);
        System.out.println("Número llindar: "+llindar);
        System.out.println("Números entrats més grans o iguals al llindar: "+llindarAmuntIgual);
        
        
    }
    
}
