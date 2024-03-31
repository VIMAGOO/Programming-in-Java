
import java.util.Scanner;

/**
 * Aquest programa rebrà de l'usuari el seu sou i el número de pagues que té. El
 * programa calcularà el percentatge de retenció que té el seu sou brut,
 * l'import de retenció, i el sou net mensual. Al final del programa es
 * mostrarán a l'usuari aquestes dades.
 *
 * @author vima2670
 */
public class ExerciciIRPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lector
        Scanner sc = new Scanner(System.in);

        //Variables que utilitzarem al bucle
        double souBrut;
        int pagues;
        //Bucle do-while, vull que s'executi al menys una vegada, al final
        //Comprovarem si les dades són o no correctes. Si no són correctes les tornarem
        //a preguntar totes
        do {
            //Missatge sou brut amb dada usuari
            System.out.println("Quin és el teu sou brut?");
            souBrut = sc.nextDouble();
            //Missatge pagues amb dada usuari
            System.out.println("Quantes pagues tens?");
            pagues = sc.nextInt();
            //La condició del bucle, no s'accepten sous negatius i únicament 12 i 14 pagues
        } while (souBrut < 0 || pagues != 12 && pagues != 14);

        //Mostrem el percentatge que aplicarem al sou
        double percentatge = calculPercentatgeIRPF(souBrut);
        System.out.println("S'aplicarà el següent percentatge de retenció al teu sou: " + percentatge + "%");

        //Es calcula l'import de retenció
        double importRet = calculaRetencio(souBrut, percentatge);

        //Mostrem totes les dades
        String mostrarDades = mostrarResultats(souBrut, importRet, pagues);

    }

    /**
     * Aquest mètode calcularà el percentatge que li correspon al sou brut de
     * l'usuari
     *
     * @param souBrut --> sou brut de l'usuari
     * @return --> el percentatge (%)
     */
    public static double calculPercentatgeIRPF(double souBrut) {
        //if per donar amb el percentatge adient
        if (souBrut >= 45000.0) {
            return 22;
        } else {
            if (souBrut >= 30000.0) {
                return 18.5;
            } else {
                if (souBrut >= 15000.0) {
                    return 15;
                } else {
                    if (souBrut >= 10000.0) {
                        return 11.5;
                    } else {
                        if (souBrut >= 0) {
                            return 2;
                        }
                    }
                }
            }
        }
        return 0;

    }

    /**
     * Aquest mètode calcula l'import de retenció
     *
     * @param souBrut --> el sou brut de l'usuari
     * @param percentatge --> el percentatge de retenció
     * @return --> import de retenció del sou brut de l'usuari
     */
    public static double calculaRetencio(double souBrut, double percentatge) {
        return (souBrut * percentatge / 100);
    }

    /**
     * Aquest mètode mostrarà totes les dades a l'usuari
     *
     * @param souBrut --> el sou brut de l'usuari
     * @param importRet --> l'import de retenció
     * @param pagues --> les pagues de l'usuari
     * @return --> retornem un missatge amb totes les dades
     */
    public static String mostrarResultats(double souBrut, double importRet, int pagues) {
        //Missatge a l'usuari
        System.out.println("Sou brut: " + souBrut);
        System.out.println("Import de la retenció: " + importRet);
        System.out.println("Nombre de pagues: " + pagues);
        double souNetMens = (souBrut - importRet) / pagues;
        System.out.println("Sou net mensual: " + souNetMens + "€");
        return null;
    }
}
