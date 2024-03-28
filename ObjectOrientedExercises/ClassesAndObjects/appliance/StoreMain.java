package appliance;


/**
 *
 * @author vimago
 */
public class StoreMain {
    private Store myStore;
    public static void main(String[] args) {
        StoreMain ap = new StoreMain();
        ap.run();
    }
    
    public void run() {
        Appliance[] appliances = generateData();
        this.myStore = new Store("Botiga de Paco", appliances);
        printAppliances(myStore.getAppliances());
        String nameToSearch = "M320";
        Appliance result = myStore.searchAppliance(nameToSearch);
        if (result != null) {
            System.out.println("result: "+result);
        } else {
            System.out.println("No s'ha trobat.");
        }
        
        System.out.println("vat: "+Appliance.vat);
        Appliance ap1 = new Appliance("V4000", "Red", 1000, EnergyType.G, 20);
        Appliance ap2 = new Appliance("V4500", "Purple", 140.5, EnergyType.A, 400);
        System.out.println("ap1: "+ap1);
        System.out.println("ap2: "+ap2);
//        ap2.vat = 0.15;
//        System.out.println("ap1: "+ap1);
//        System.out.println("ap2: "+ap2);
        System.out.println("ap1 with vat: "+ap1.getPriceWithVat());
        System.out.format("Net price %1.2f. price with VAT: %1.2f%n", 100.0, Appliance.calcPriceWithVat(100.0));
        System.out.format("Net price %1.2f. price with VAT: %1.2f%n", ap1.vat, ap1.calcPriceWithVat(ap1.vat));
    }
    
    public void printAppliances (Appliance[] appliances) {
        for (Appliance elem: appliances) {
            System.out.println(elem.toString());
        }
    }
    
    private Appliance[] generateData() {
        Appliance[] devices = new Appliance[5];
        devices[0] = new Appliance("S3000", "Red", 99.99, EnergyType.E, 50);
        devices[1] = new Appliance("S3100", "Blue", 130, EnergyType.E, 50);
        devices[2] = new Appliance("S3200", "Orange", 120.25, EnergyType.E, 50);
        devices[3] = new Appliance("S3000", "Blue", 99.99, EnergyType.E, 50);
        devices[4] = new Appliance("S3100", "Red", 125, EnergyType.E, 50);
        return devices;
    }
    
    
    
}
