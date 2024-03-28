package vehicles;

/**
 *
 * @author vimago
 */
public class Car extends Vehicle {
    private String model;

    public Car(Traction traction, Axles axles, String model) {
        super(traction, axles);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
