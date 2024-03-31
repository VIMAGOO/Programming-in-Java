import java.util.Scanner;

/**
 * Aquest programa demana a l'usuari inicialment 
 * la temporada en la que es troba
 * i el tipus d'entrada que té.
 * Depenent de la temporada que entri l'usuari (alta, mitjana o baixa) 
 * i del tipus d'entrada que tingui (ordinària o reduïda),
 * el preu a pagar serà diferent.
 * Finalment es mostraran a l'usuari 
 * el preu de l'entrada,
 * la temporada escollida
 * i el tipus d'entrada escollida.
 * @author vima2670
 */
public class ExamenExercici1 {

    public static void main(String[] args) {
        //Inicialitzem el lector.
        Scanner sc = new Scanner(System.in);
        //Creem dos missatge, el primer per contextualitzar.
        //El segon per demanar a l'usuari el tipus de temporada.
        System.out.println("MENÚ: ENTRADES DEL MUSEU");
        System.out.println("Introdueix la temporada on et trobes: alta, mitjana o baixa.");
        //Resposta que rebrem de l'usuari.
        String temporada = sc.next().toUpperCase();
        
        //Variables que utilitzarem en un futur al nostre switch.
        double preu = 0;
        String misTemp = null;
        String misEntr = null;
        boolean dadesCorrectes = false;
        
        //He escollit el switch perquè crec que era la opció menys complicada,
        //ja que estem treballant amb opcions limitades (3 i 2) que pot escollir l'usuari
        //i amb variables String, amb valor no numèric.
        
        //Tots els switch terminaran amb break; per a que no s'executin els altres.
        
        //switch temporada
        switch (temporada){
            //Si l'usuari posa "alta" per referir-se a temporada alta.
            case "ALTA":
                //Preguntem de quin tipus es la seva entrada.
                System.out.println("De quin tipus és la teva entrada de temporada alta?");
                System.out.println("O=Ordinària; R=Reduïda");
                //Resposta que rebrem de l'usuari.
                String temporadaAlta = sc.next().toUpperCase();
                //switch temporadaAlta
                switch (temporadaAlta){
                    //Si l'usuari posa O d'ordinària.
                    case "O":
                        //Posem les variables prèviament creades 
                        //però amb un valor personalitzat per a cada cas.
                        preu = 18.5;
                        misTemp = "Temporada alta";
                        misEntr = "Ordinària";
                        dadesCorrectes = true;
                        break;
                    //Si l'usuari posa R de Reduïda.
                    case "R":
                        //Posem les variables prèviament creades 
                        //però amb un valor personalitzat per a cada cas.
                        preu = 16.20;
                        misTemp = "Temporada alta";
                        misEntr = "Reduïda";
                        dadesCorrectes = true;
                        break;
                    default:
                        //Missatge per si l'usuari entra una dada no vàlida
                        System.out.println("Has d'introduïr O (Ordinària) o R (Reduïda).");
                }
                break;
            //Si l'usuari posa "mitjana" per referir-se a temporada mitjana.
            case "MITJANA":
                //Preguntem de quin tipus es la seva entrada.
                System.out.println("De quin tipus és la teva entrada de temporada mitjana?");
                System.out.println("O=Ordinària; R=Reduïda");
                //Resposta que rebrem de l'usuari.
                String temporadaMitjana = sc.next().toUpperCase();
                //switch temporadaMitjana
                switch (temporadaMitjana){
                    case "O":
                        //Posem les variables prèviament creades 
                        //però amb un valor personalitzat per a cada cas.
                        preu = 15.5;
                        misTemp = "Temporada mitjana";
                        misEntr = "Ordinària";
                        dadesCorrectes = true;
                        break;
                    case "R":
                        //Posem les variables prèviament creades 
                        //però amb un valor personalitzat per a cada cas.
                        preu = 12.5;
                        misTemp = "Temporada mitjana";
                        misEntr = "Reduïda";
                        dadesCorrectes = true;
                        break;
                    default:
                        //Missatge per si l'usuari entra una dada no vàlida
                        System.out.println("Has d'introduïr O (Ordinària) o R (Reduïda).");
                }
                break;
            //Si l'usuari posa "baixa" per referir-se a temporada baixa.
            case "BAIXA":
                //Preguntem de quin tipus es la seva entrada.
                System.out.println("De quin tipus és la teva entrada de temporada baixa?");
                System.out.println("O=Ordinària; R=Reduïda");
                //Resposta que rebrem de l'usuari.
                String temporadaBaixa = sc.next().toUpperCase();
                //switch temporadaBaixa
                switch (temporadaBaixa){
                    case "O":
                        //Posem les variables prèviament creades 
                        //però amb un valor personalitzat per a cada cas.
                        preu = 10.5;
                        misTemp = "Temporada baixa";
                        misEntr = "Ordinària";
                        dadesCorrectes = true;
                        break;
                    case "R":
                        //Posem les variables prèviament creades 
                        //però amb un valor personalitzat per a cada cas.
                        preu = 8;
                        misTemp = "Temporada baixa";
                        misEntr = "Reduïda";
                        dadesCorrectes = true;
                        break;
                    default:
                        //Missatge per si l'usuari entra una dada no vàlida
                        System.out.println("Has d'introduïr O (Ordinària) o R (Reduïda).");
                }
                break;
            default:
                //Missatge per si l'usuari entra una dada no vàlida
                System.out.println("Has d'introduïr una dada vàlida (alta, mitjana o baixa).");
        }
        //Missatge que únicament sortirà si totes les dades introduïdes
        //són correctes.
        if (dadesCorrectes == true){
        System.out.println("INFORMACIÓ DE LA COMPRA: ");
        System.out.println("Temporada: "+misTemp);
        System.out.println("Entrada: "+misEntr);
        System.out.println("Preu de l'entrada: "+preu+"€");   
        }
        
    }
    
}
