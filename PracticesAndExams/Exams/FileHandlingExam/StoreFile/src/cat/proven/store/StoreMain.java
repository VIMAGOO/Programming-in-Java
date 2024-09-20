package cat.proven.store;

import cat.proven.store.model.Product;
import cat.proven.store.model.Store;
import cat.proven.store.persist.ProductFileCsv;
import cat.proven.store.persist.ProductFileData;
import cat.proven.store.persist.ProductFileInterface;
import cat.proven.store.persist.ProductFileObject;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class StoreMain {

    private Store myStore;
    private boolean exit;
    private Menu fileFormatsMenu;
    
    public static void main(String[] args) {
        StoreMain ap = new StoreMain();
        ap.run();
    }

    private void run() {
        myStore = new Store("La meva botigueta");
        fileFormatsMenu = createFileFormatsMenu();
        exit = false;
        Menu menu = createMenu();
        do {            
            int option = menu.displayMenuAndGetOption();
            switch (option) {
                case 0:  //exit
                    doExit();
                    break;
                case 1:  //list all products
                    doListAllProducts();
                    break;
                case 2:  //save products to file
                    doSaveProductsToFile();
                    break;
                case 3:  //load products from file
                    doLoadProductsFromFile();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (!exit);
    }

    private Menu createMenu() {
        Menu menu = new Menu("Store application main menu");
        menu.addOption("Exit");
        menu.addOption("List all products");
        menu.addOption("Save products to file");
        menu.addOption("Load products from file");
        return menu;
    }

    private void doExit() {
        //TODO ask for confirmation
        exit = true;
    }

    private void doListAllProducts() {
        for (Product p : myStore.getProducts()) {
            System.out.println(p);
        }
        System.out.format("%d products displayed%n", 
                myStore.getProducts().size());
    }

    /**
     * asks the user the format of the file and the filename,
     * writes products to file,
     * and displays the number of products saved
     */
    private void doSaveProductsToFile() {
        //read file name
        Scanner scan = new Scanner(System.in);
        System.out.print("Filename: ");
        String filename = scan.next();
        //read file format
        ProductFileInterface prodFilePersist;
        int format = fileFormatsMenu.displayMenuAndGetOption();
        switch (format) {
            case 0:
                prodFilePersist = new ProductFileCsv();
                break;
            case 1:
                prodFilePersist = new ProductFileData();
                break;
            case 2:
                prodFilePersist = new ProductFileObject();
                break;
            default:
                prodFilePersist = new ProductFileCsv();
        }
        int counter = prodFilePersist.save(filename, myStore.getProducts());
        System.out.println("Number of products saved: "+counter);
    }

    /**
     * asks the user the format of the file and the filename,
     * reads products from file,
     * sets products to store
     * and displays read products
     */
    private void doLoadProductsFromFile() {
        //read file name
        Scanner scan = new Scanner(System.in);
        System.out.print("Filename: ");
        String filename = scan.next();
        //read file format
        ProductFileInterface prodFilePersist;
        int format = fileFormatsMenu.displayMenuAndGetOption();
        switch (format) {
            case 0:
                prodFilePersist = new ProductFileCsv();
                break;
            case 1:
                prodFilePersist = new ProductFileData();
                break;
            case 2:
                prodFilePersist = new ProductFileObject();
                break;
            default:
                prodFilePersist = new ProductFileCsv();
        }
        List<Product> data = prodFilePersist.load(filename);
        if (data != null) {
            myStore.setProducts(data);
        } else {
            System.out.println("Error reading products");
        }

    }

    private Menu createFileFormatsMenu() {
        Menu m = new Menu("File formats menu");
        m.addOption("CSV");
        m.addOption("Data");
        m.addOption("Object");
        return m;
    }
    
}
