import java.util.Scanner;
/**
 * Aquest programa donarà a escollir tres productes
 * del producte escollit quants litres vol comprar
 * i finalment si vol continuar comprant.
 * Quan no volgui comprar més, donarà el preu total a pagar
 * i els litres que ha comprat de cada producte.
 * @author vimago
 */

public class Exercise18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRODUCTES:");
        System.out.println("1. Oli de girasol (3€/litre)");
        System.out.println("2. Oli d'oliva (10€/litre)");
        System.out.println("3. Oli d'oliva verge extra (15€/litre)");
        boolean continuar = true;
        boolean activarMissatge = false;
        //Preu
        double preutotal = 0;
        double preugir = 0;
        double preuoliv = 0;
        double preuolivaverge = 0;
        
        //Litres
        double litresgir = 0;
        double litresoliv = 0;
        double litresolivaverge = 0;
           
        while (continuar){
            System.out.println("Escull el producte que vols comprar:");
            int producte = sc.nextInt();
            switch (producte) {
                case 1: 
                    System.out.println("Quants litres vols comprar?");
                    litresgir = sc.nextDouble();
                    
                    preugir = Math.abs(litresgir) * 3;
                    System.out.println("El preu de l'oli de girasol és "+preugir+" €");
                    activarMissatge = true;
                break;
                case 2:
                    System.out.println("Quants litres vols comprar?");
                    litresoliv = sc.nextDouble();
                    preuoliv = Math.abs(litresoliv) * 10;
                    System.out.println("El preu de l'oli d'oliva és "+preuoliv+" €");
                    activarMissatge = true;
                break;
                case 3:
                    System.out.println("Quants litres vols comprar?");
                    litresolivaverge = sc.nextDouble();
                    preuolivaverge = Math.abs(litresolivaverge) * 15;
                    System.out.println("El preu de l'oliva verge extra és "+preuolivaverge+" €");
                    activarMissatge = true;       
                break;
                default:
                    System.out.println("S'ha introduït una dada incorrecta.");
                }
                if (activarMissatge == true){
                    System.out.println("Vols continuar comprant? (Si/No)");
                    String resposta = sc.next().toUpperCase();
                    switch (resposta){
                        case "SI": 
                            continuar = true;
                        break;
                        case "NO":
                            continuar = false;
                        break;
                        default:
                            System.out.println("No s'ha introduït una dada correcta.");
                            continuar = true;
                        break;
                        }
                }
        }
        
        preutotal = preugir+preuoliv+preuolivaverge;     
        
        System.out.println("El preu total a pagar és "+preutotal+" €.");
        System.out.println("LITRES OLI DE GIRASOL a 3€/L: "+litresgir);
        System.out.println("LITRES OLI D'OLIVA a 10€/L: "+litresoliv);
        System.out.println("LITRES OLI D'OLIVA VERGE EXTRA a 15€/L: "+litresolivaverge);
        }
        }