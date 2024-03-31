package series;

/**
 *
 * @author vimago
 */
public class SeriesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test Arithmetic Progression
        Series arithmeticSeries = new ArithmeticProgression(2, 3);
        System.out.println("Arithmetic Progression:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arithmeticSeries.getNext() + " ");
        }
        System.out.println();
        arithmeticSeries.reset();

        // Test Geometric Progression
        Series geometricSeries = new GeometricProgression(2, 3);
        System.out.println("Geometric Progression:");
        for (int i = 0; i < 5; i++) {
            System.out.print(geometricSeries.getNext() + " ");
        }
        System.out.println();
        geometricSeries.reset();
    }
}
