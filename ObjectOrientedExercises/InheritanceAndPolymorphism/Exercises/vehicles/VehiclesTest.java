package vehicles;

/**
 *
 * @author vimago
 */
public class VehiclesTest {
     public static void main(String[] args) {
        Axles tricycleAxles = new Axles(3);
        Tricycle tricycle = new Tricycle(Traction.HUMAN, tricycleAxles, "Foldable");
        System.out.println("Tricycle Traction: " + tricycle.getTraction());
        System.out.println("Tricycle Axles: " + tricycle.getAxles().getNumber());
        System.out.println("Tricycle Special Feature: " + tricycle.getSpecialFeature());

        Axles bicycleAxles = new Axles(2);
        Bicycle bicycle = new Bicycle(Traction.HUMAN, bicycleAxles, "Red");
        System.out.println("Bicycle Traction: " + bicycle.getTraction());
        System.out.println("Bicycle Axles: " + bicycle.getAxles().getNumber());
        System.out.println("Bicycle Color: " + bicycle.getColor());

        Axles carAxles = new Axles(4);
        Car car = new Car(Traction.MOTOR, carAxles, "SUV");
        System.out.println("Car Traction: " + car.getTraction());
        System.out.println("Car Axles: " + car.getAxles().getNumber());
        System.out.println("Car Model: " + car.getModel());
    }
}
