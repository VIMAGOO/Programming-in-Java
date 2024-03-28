package cat.proven.xifrat;

/**
 *
 * @author vimago
 */
public class CaesarCipher {

    private static String lletres = "abcdefghijklmnñopqrstuvwxyz1234567890 ,.!?%:_-()=&#@";

    /**
     * xifra el missatge amb l'algorisme de desplaçament
     *
     * @param missatge el missatge a xifrar
     * @param desp el desplaçament a aplicar
     * @return el missatge xifrat
     */
    public static String xifrarCesar(String missatge, int desp) {
        String result = "";
        //String lletres = "abcdefghijklmnñopqrstuvwxyz1234567890 ,.!?%:_-()=&#@";
        for (int i = 0; i < missatge.length(); i++) {
            //c és el caràcter del missatge que introdueixi l'usuari, en cada iteració el valor de c
            //canviarà per la lletra següent del missatge
            char c1 = missatge.charAt(i);
            //busquem amb index1 la posició de la lletra que té en aquell moment c
            int index1 = lletres.indexOf(c1);
            //index2 serà la posició de la lletra que conté c més el desplaçament que l'usuari ha introduït
            int index2 = (index1 + desp) % lletres.length();
            //finalment c2 serà la lletra amb el desplaçament a l'String lletres
            char c2 = lletres.charAt(index2);
            result += c2;
        }

        return result;
    }

    /**
     * desxifra el missatge amb l'algorisme de desplaçament
     *
     * @param missatge el missatge a desxifrar
     * @param desp el desplaçament a aplicar
     * @return el missatge desxifrat
     */
    public static String desxifrarCesar(String missatge, int desp) {
        String result = "";
        //String lletres = "abcdefghijklmnñopqrstuvwxyz1234567890 ,.!?%:_-()=&#@";
        for (int i = 0; i < missatge.length(); i++) {
            //c és el caràcter del missatge que introdueixi l'usuari, en cada iteració el valor de c
            //canviarà per la lletra següent del missatge
            char c1 = missatge.charAt(i);
            //busquem amb index1 la posició de la lletra que té en aquell moment c
            int index1 = lletres.indexOf(c1);
            //index2 serà la posició de la lletra que conté c més el desplaçament que l'usuari ha introduït
            int index2 = (index1 - desp) % lletres.length();
            if (index2 < 0) {
                index2 += lletres.length();
            }
            //finalment c2 serà la lletra amb el desplaçament a l'String lletres
            char c2 = lletres.charAt(index2);
            result += c2;
        }

        return result;
    }
}
