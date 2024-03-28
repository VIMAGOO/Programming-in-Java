import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari el nombre d'alumnes,
 * donarà un missatge perquè introdueixi la nota de l'alumne fins l'últim.
 * Al final de programa donarà com a resposta quants han aprobat
 * quants han suspès 
 * i quants han tret un 10.
 * @author vimago
 */
public class Exercise9 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el número d'alumnes:");
        int alumnes = sc.nextInt();
        int deu = 0;
        int supcinc = 0;
        int suspes = 0;

        for (int i = 1;i<=alumnes;i++) {
            System.out.println("Introdueix la nota de l'alumne "+i);
            double nota = sc.nextDouble();
        if (nota<0 || nota>10) {
        System.out.println("La nota introduïda no és vàlida");
        } else {
            if (nota>=5||nota<=10){
                supcinc++;
            } 
            if (nota==10){
                deu++;
            }
            if (nota<5) {
                suspes++;
            }    
        }
            
            }
        
    
    System.out.println("NOTES:");
    System.out.println("10:"+deu);
    System.out.println("Aprovats:"+supcinc);
    System.out.println("Suspesos: "+suspes);
    
}
}