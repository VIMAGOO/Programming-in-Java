/**
 *
 * @author vimago
 */
public class StringBuilderExample {

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("En un lugar de la Mancha");
         System.out.println(sb.toString());
         //per concatenar utilitzem append
         sb.append(" de cuyo nombre no quiero acordarme");
         System.out.println(sb.toString());
         //per afegir un string en un punt de sb
         sb.insert(12, "(esto es del Quijote)");
         System.out.println(sb.toString());
         //per trobar caràcters
         int index1 = sb.indexOf("(");
         int index2 = sb.indexOf(")", index1);
         //per esborrar des d'un caràcter fins a un altre
         sb.delete(index1, index2+1);
         System.out.println(sb.toString());
         //per mostrar al revés tot el text
         System.out.println(sb.reverse());
         StringBuilder sb2 = new StringBuilder();
         //length i capacitat inicial
         System.out.println("Length inicial sb2: "+sb2.length());
         System.out.println("Capacitat inicial sb2: "+sb2.capacity());
         String nom = "Manolo";
         int edat = 64;
         //es poden afegir més apartats
         sb2.append("Hola, ")
                 .append(nom)
                 .append("! Tens ")
                 .append(edat)
                 .append(" anys.");
         System.out.println(sb2.toString());
         //length i capacitat final
         System.out.println("Length final sb2: "+sb2.length());
         System.out.println("Capacitat final sb2: "+sb2.capacity());
         
         
         
    }
    
}
