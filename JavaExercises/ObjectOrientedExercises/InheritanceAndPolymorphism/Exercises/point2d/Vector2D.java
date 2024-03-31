package punt2d;

/**
 *
 * @author vimago
 */
public class Vector2D extends Punt2D {
        // Constructor que accepta dos punts per a la creació d'un vector fix
    public Vector2D(Punt2D startPoint, Punt2D endPoint) {
        super(endPoint.getX() - startPoint.getX(), endPoint.getY() - startPoint.getY());
    }

    // Constructor que accepta les coordenades x i y del vector
    public Vector2D(double x, double y) {
        super(x, y);
    }

    // Mètode per obtenir el mòdul o norma (la longitud) del vector
    public double calcularModul() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    // Mètode per sumar un altre vector al vector actual
    public void sumar(Vector2D otherVector) {
        setX(getX() + otherVector.getX());
        setY(getY() + otherVector.getY());
    }

    // Mètode per restar un altre vector al vector actual
    public void restar(Vector2D otherVector) {
        setX(getX() - otherVector.getX());
        setY(getY() - otherVector.getY());
    }

    // Mètode per calcular el producte d'un vector per un escalar
    public void productePerEscalar(double scalar) {
        setX(getX() * scalar);
        setY(getY() * scalar);
    }

    // Mètode per calcular el producte escalar de dos vectors
    public double producteEscalar(Vector2D otherVector) {
        return getX() * otherVector.getX() + getY() * otherVector.getY();
    }

    // Exemple d'ús
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(3, 4);
        Vector2D vector2 = new Vector2D(6, 8);

        System.out.println("Vector 1: (" + vector1.getX() + ", " + vector1.getY() + ")");
        System.out.println("Vector 2: (" + vector2.getX() + ", " + vector2.getY() + ")");

        // Suma de vectors
        vector1.sumar(vector2);
        System.out.println("Suma de vectors: (" + vector1.getX() + ", " + vector1.getY() + ")");

        // Resta de vectors
        vector1.restar(vector2);
        System.out.println("Resta de vectors: (" + vector1.getX() + ", " + vector1.getY() + ")");

        // Producte per un escalar
        vector2.productePerEscalar(2);
        System.out.println("Producte de vector 2 per 2: (" + vector2.getX() + ", " + vector2.getY() + ")");

        // Producte escalar de dos vectors
        System.out.println("Producte escalar de vectors: " + vector1.producteEscalar(vector2));

        // Mòdul o norma del vector
        System.out.println("Mòdul del vector 1: " + vector1.calcularModul());
    }
}
