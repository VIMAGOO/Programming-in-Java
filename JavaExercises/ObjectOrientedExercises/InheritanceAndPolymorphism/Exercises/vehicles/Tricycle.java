package vehicles;

/**
 *
 * @author vimago
 */
public class Tricycle extends Vehicle {
    private String specialFeature;

    public Tricycle(Traction traction, Axles axles, String specialFeature) {
        super(traction, axles);
        this.specialFeature = specialFeature;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }
}
