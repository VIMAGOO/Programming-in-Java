package vehicles;

/**
 *
 * @author vimago
 */
public class Vehicle {
    private Traction traction;
    private Axles axles;

    public Vehicle(Traction traction, Axles axles) {
        this.traction = traction;
        this.axles = axles;
    }

    public Traction getTraction() {
        return traction;
    }

    public Axles getAxles() {
        return axles;
    }
}
