package car;


/**
 *
 * @author vimago
 */
public class CarMain {

    private Concessionaire MyCar;
    public static void main(String[] args) {
        
        CarMain ap = new CarMain();
        ap.run();
        
    }
    public void run() {
        Car[] cars = generateData();
        MyCar = new Concessionaire("AutoScout", cars);
        printCars(MyCar.getCars());
        String tuitionToSearch = "2345 JDJ";
        
        Car result = MyCar.searchCars(tuitionToSearch);
        if (result != null) {
            System.out.println("result: "+result);
        } else {
            System.out.println("No s'ha trobat.");
        }
        
        boolean estat;
        
        estat = cars[1].start();
        System.out.println("Cotxe 2:"+cars[1].toString());
        
        estat = cars[1].close();
        System.out.println("Cotxe 2:"+cars[1].toString());
    }
    
    public void printCars (Car[] cars) {
        for (Car elem: cars) {
            System.out.println(elem.toString());
        }
    }
    private Car[] generateData() {
        Car[] cars = new Car[5];
        cars[0] = new Car("2345 JDJ", "Mercedes", "GLA", FuelType.Petrol, 7);
        cars[1] = new Car("5432 DFC", "Mini", "Cooper", FuelType.Gas, 6);
        cars[2] = new Car("4587 DFG", "BMW", "M5", FuelType.Petrol, 6);
        cars[3] = new Car("3210 GFD", "Nissan", "GTR", FuelType.Biodiesel, 5);
        cars[4] = new Car("2135 JDT", "Renault", "Scenic", FuelType.Diesel, 6);
        return cars;
    }
    
    
    
}
