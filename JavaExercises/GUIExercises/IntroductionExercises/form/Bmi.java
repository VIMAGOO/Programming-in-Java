package form;

/**
 *
 * @author vimago
 */
public class Bmi {
    public double calcBmi(double weight, double height) {
        double bmi = 0;
        bmi = weight/(height * height);
        return bmi;
    }
}
