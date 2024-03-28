
/**
 *
 * @author vimago
 */
public class ExamplesStrings {

    public static void main(String[] args) {
        
        System.out.println("==VARIABLES==");
        String nom1 = new String("Paco");
        String nom2 = nom1;
        String nom3 = new String(nom1);
        System.out.println("nom1: " + nom1);
        System.out.println("nom2: " + nom2);
        System.out.println("nom3: " + nom3);

        System.out.println("");
        System.out.println("==COMPARACIONS==");
        //nom2 és una copia de nom1, valen el mateix tant en valor com en ID
        System.out.println("nom1 igual a nom2? " + (nom1 == nom2));
        //nom3 és un nou objecte amb el mateix valor que nom1 però amb diferent ID
        System.out.println("nom1 igual a nom3? " + (nom1 == nom3));
        //comparem el valor, no el ID, per tant, nom1 i nom3 són iguals
        System.out.println("nom1 i nom3 comparat amb equals: " + nom1.equals(nom3));

        System.out.println("");
        System.out.println("==LONGITUDS==");
        //quants caràcters té nom1
        System.out.println("Longitud de nom1: " + nom1.length());
        //recórrer els caràcters i imprimir-los

        System.out.println("");
        System.out.println("==RECORREGUT AMB BUCLE==");
        for (int i = 0; i < nom1.length(); i++) {
            char c = nom1.charAt(i);
            System.out.println(c);
        }
        //caràcter posició 10, però no hi ha posició 10
        //System.out.println("Caràcter en la posició 10: "+nom1.charAt(10));

        System.out.println("");
        System.out.println("==COMPARE TO==");
        String nom4 = "paco";
        int comp = nom1.compareTo(nom4);
        System.out.println("nom1.compareTo(nom4): " + comp);
        int comp2 = nom1.compareToIgnoreCase(nom4);
        System.out.println("nom1.compareToIgnoreCase(nom4): " + comp2);

        System.out.println("");
        System.out.println("==CONCATENACIONS==");
        String salutacio = "Hola ";
        String salutacioNom = salutacio.concat(nom1);
        System.out.println(salutacioNom);
        System.out.println("*AMB FORMAT");
        String formated1 = String.format("%s%s", salutacio, nom1);
        System.out.println(formated1);
        int edat = 18;
        String formated2 = String.format("Hola %s tens %d anys.", nom1, edat);
        System.out.println(formated2);
        System.out.println("");
        System.out.println("==MINÚSCULES/MAJÚSCULES==");
        System.out.println("nom1 en majúscules: "+nom1.toUpperCase());
        System.out.println("nom1 en minúscules: "+nom1.toLowerCase());
        
        System.out.println("");
        System.out.println("==POSICIÓ I INTERCANVI DE STRINGS==");
        String frase = "En un lugar de la mancha de cuyo nombre no quiero acordarme";
        System.out.println("Comença per En? "+frase.startsWith("En"));
        System.out.println("Termina per me? "+frase.endsWith("me"));
        System.out.println("On apareix el string 'd'? "+frase.indexOf("d"));
        System.out.println("La última vegada que ha aparegut 'no': "+frase.lastIndexOf("no"));
        System.out.println("Agafar un tros de l'string: "+frase.substring(5, 25));
        System.out.println("Canviar caràcter 'e' per el '3': "+frase.replace("e","3"));

    }

}
