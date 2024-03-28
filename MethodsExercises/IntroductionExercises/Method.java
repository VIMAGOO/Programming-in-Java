import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        //Entrada radi.
        double radiEsfera = llegirDouble("Entra el radi de l'esfera:");
        System.out.println("El radi de l'esfera és: "+radiEsfera);
        //Calcular àrea esfera.
        double areaEsfera = calculaAreaEsfera(radiEsfera);
        System.out.println("L'àrea de l'esfera és "+areaEsfera);
    }
    /**
     * Calcula l'àrea d'una esfera donat el radi.
     * @param radi --> radi de l'esfera
     * @return --> el valor de l'àrea de l'esfera
     */
    public static double calculaAreaEsfera(double radi) {
        double area = 0.0;
        area = (4.0/3.0) * Math.PI * radi * radi;
        return area;
    }
    /**
     * Pregunta a l'usuari un valor real i el retorna.
     * @param missatge --> el missatge amb la pregunta a fer a l'usuari
     * @return --> el valor real entrat per l'usuari.
     */
    public static double llegirDouble(String missatge) {
        Scanner sc = new Scanner(System.in);
        System.out.print(missatge);
        double resposta = sc.nextDouble();
        return resposta;
    }
    
}