import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class UtilsString {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
//declarar i instanciar String (són objectes, cal invocar el constructor)
        String nom = new String("Lluis");
//instanciació i inicialització abreujada amb constant
        String salutacio = "Hola";
//ús de l'operador de concatenació
        String missatge = salutacio + " " + nom;
        System.out.println(missatge);
//obtenir la longitud del string
        System.out.println("La longitud del missatge és " + missatge.length());
//obtenir el caràcter en una posició
        System.out.print("Quin índex? ");
        int index = lector.nextInt();
        try {
            char c = missatge.charAt(index);  //pot llançar StringIndexOutOfBoundsException si l'índex està fora de límits
            System.out.println("El caràcter a la posició " + index + " és " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Índex incorrecte");
        }
//comparar strings (negatiu, zero o positiu segons el resultat de la comparació)
        int comp = "Hola".compareTo("Holo");
        System.out.println(comp);
//ús del mètode concat() per concatenar String
        System.out.println(salutacio.concat(nom));
//mètodes per analitzar el contingut
        String frase = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
        System.out.println("Comença per En? " + frase.startsWith("En"));
        System.out.println("Acaba per rme? " + frase.endsWith("rme"));
//igualtat de strings
        String a = "Taula";
        String b = "taula";
        System.out.println("Son iguals? " + a.equals(b));
        System.out.println("Son iguals (ignorant case)? " + a.equalsIgnoreCase(b));
//ús del mètode format() per obtenir un string amb dades formatades
        int edat = 22;
        double salari = 1800.0;
        String informacio
                = String.format("%s tens %d anys i salari %.2f\n",
                        nom, edat, salari);
        System.out.println(informacio);
//trobar la posició d'un caràcter o string (indexOf(), lastIndexOf)())
        System.out.println("La primera 'u' és a l'índex: " + frase.indexOf('u'));
        System.out.println("La darrera 'u' és a l'índex: " + frase.lastIndexOf('u'));
        System.out.println("La primera 'de' és a l'índex: " + frase.indexOf("de"));
//ús del mètode replace()
        System.out.println(frase.replace('e', '3'));
//extracció de fragments del string (mètodes substring())
        System.out.println(frase.substring(4, 20));
//conversió a majusc/minusc
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

}