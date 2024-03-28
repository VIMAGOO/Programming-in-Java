package vehicles;

/**
 *
 * @author vimago
 */
public class Bicycle extends Vehicle {
    private String color;

    public Bicycle(Traction traction, Axles axles, String color) {
        super(traction, axles);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
