import java.util.Scanner;

/**
 * 19. Programa amb un menú de tres opcions: 
 * 0. Sortir. 
 * 1. Càlculs amb rectangles 
 * 2. Càlculs amb cercles
 *
 * El programa presentarà iterativament el menú a l’usuari perquè esculli una de
 * les opcions fins que esculli sortir. Cal crear un mètode void mostraMenu()
 * per mostrar el menú. Per a cada figura es calcularà el perímetre i l’àrea.
 * Cal preguntar a l’usuari les dimensions de la figura i invocar mètodes
 * específics per a cada càlcul.
 *
 * @author vimago
 */
public class Exercise19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = mostraMenu();
        boolean continuar = true;
        String missatge;
        do {
        System.out.println("On vols anar? (0/1/2)");
        int resposta = sc.nextInt();
        switch (resposta) {
            case 0:
                System.out.println("D'acord! Ens veiem!");
                continuar = false;
                break;
            case 1:
                System.out.println("Quan mesuren els costats del teu rectangle?");
                System.out.println("Costat 1: ");
                double costat1 = sc.nextDouble();
                System.out.println("Costat 2: ");
                double costat2 = sc.nextDouble();
                
                missatge = AreaPeriRect(costat1, costat2);
                System.out.println(missatge);
                break;
            case 2:
                System.out.println("Quan mesura el radi del teu cercle?");
                double radi = sc.nextDouble();
                missatge = AreaPeriCercle(radi);
                System.out.println(missatge);
                break;
            default:
                System.out.println("Has d'introduir una dada vàlida! (0/1/2)");
                break;
        }
        } while (continuar);
    }
    
    public static String AreaPeriRect(double costat1, double costat2) {
        double area = costat1*costat2;
        double perimetre = 2*costat1 + 2*costat2;
        
        String missatge = "El teu rectangle té aquest perímetre: "+perimetre+", i aquesta àrea: "+area;
        
        return missatge;
    }
    
    public static String AreaPeriCercle (double radi) {
        double area = Math.PI * radi * radi;
        double perimetre = 2 * Math.PI * radi;
        
        String missatge = "El teu cercle de radi "+radi+" té aquest perímetre: "+perimetre+", i aquesta àrea: "+area;
        
        return missatge;
    }
    
    public static String mostraMenu(){
        System.out.println("===MENÚ===");
        System.out.println("0. Sortir");
        System.out.println("1. Càlculs amb rectangles");
        System.out.println("2. Càlculs amb cercles");
        
        return null;
    }

}