package products;

import products.exceptions.StockException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Interacció amb l'usuari
 *
 * @author vima2670
 */
public class StoreMain {

    private Store myStore;
    private Scanner sc;

    public StoreMain() {
    }

    public static void main(String[] args) {
        StoreMain sm = new StoreMain();
        sm.run();
    }

    private void run() {
        myStore = new Store();
        sc = new Scanner(System.in);
        myStore.generateData();
        StoreMenu menu = createMenu();
        boolean exit = false;
        do {
            int option = menu.displayMenuAndGetOption();
            switch (option) {
                case 0: //exit the program
                    exit = doExit();
                    break;
                case 1: //search all products
                    dolistAllProducts();
                    break;
                case 2: //search product by code
                    doListProductByCode();
                    break;
                case 3: //search products with low stock
                    doSearchProductsWithLowStock();
                    //todo
                    break;
                case 4: //add a new product
                    doAddNewProduct();
                    break;
                case 5: //modify a product 
                    doModifyProduct();
                    break;
                case 6: //removes a product
                    doRemoveProduct();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            //menu
            //switchcase
        } while (!exit);
    }

    private boolean doExit() {
        boolean exit = false;
        System.out.println("Are you sure you want to exit? (Y/N)");
        String option = sc.next().toUpperCase();
        switch (option) {
            case "Y":
                exit = true;
                break;
            case "N":
                exit = false;
                break;
            default:
                System.out.println("Select a correct option: Y/N");
        }
        return exit;
    }

    /**
     * Create the menu options
     *
     * @return the menu with the options
     */
    private StoreMenu createMenu() {
        StoreMenu menu = new StoreMenu("Store application");
        menu.addOption("Exit");
        menu.addOption("Search all products");
        menu.addOption("Search product by code");
        menu.addOption("Search products with low stock");
        menu.addOption("Add product");
        menu.addOption("Modify product");
        menu.addOption("Remove product");
        return menu;
    }

    private void displayAllProductsList(List<Product> data) {
        for (Product product : data) {
            System.out.println(product.toString());
        }
        System.out.format("%d products listed \n", data.size());
    }

    /**
     * Gets all products from the list and displays all of them
     */
    private void dolistAllProducts() {
        displayAllProductsList(myStore.searchAllProducts());
    }

    /**
     * Ask the user the code Searches a product with that code if found displays
     * the product if not found it reports that to the user
     */
    private void doListProductByCode() {
        //ask the code
        String code = readString("Input the code: ");
        //search product
        Product productFound = myStore.searchProduct(code);
        if (productFound != null) {
            System.out.println(productFound.toString());
        } else {
            System.out.println("Your product hasn't been found.");
        }
    }

    /**
     * reads from user data for the new product, if correctly read, adds the
     * product to the list. and reports the result to the user.
     */
    private void doAddNewProduct() {
        //read product
        Product product = readProduct();
        if (product != null) {
            boolean success = myStore.addProduct(product);
            if (success) {
                System.out.println("Product successfully added.");
            } else {
                System.out.println("Product unsuccessfully added.");
            }
        } else { //error reading
            System.out.println("Invalid data reading the product.");
        }
    }

    /**
     * Asks the current product and the new product
     */
    private void doModifyProduct() {
        String currentProductCode = readString("Input the current product code: ");
        Product currentProduct = myStore.searchProduct(currentProductCode);
        if (currentProduct != null) {
            System.out.println("Create the new product: ");
            Product newProduct = readProduct();
            if (newProduct != null) {
                boolean success = myStore.modifyProduct(currentProduct, newProduct);
                if (success) {
                    System.out.println("The product has been modified successfully.");
                } else {
                    System.out.println("The product has been modified unsuccessfully.");
                }
            } else {
                System.out.println("The current product has been not found.");
            }
        } else {
            System.out.println("The new product has been unsuccessfully read.");
        }
    }

    /**
     * Asks the code of the product Searches the product Displays product if
     * found, report error if not ask for confirmation Removes the product if it
     * has been found
     */
    private void doRemoveProduct() {
        //ask the code
        String code = readString("Input the code: ");
        Product product = myStore.searchProduct(code);
        if (product != null) {
            System.out.println(product.toString());
            System.out.println("Are you sure you want to remove the product? (Y/N)");
            switch (sc.next().toUpperCase()) {
                case "Y":
                    boolean success = myStore.removeProduct(product);
                    if (success) {
                        System.out.println("Product successfully removed.");
                    } else {
                        System.out.println("Product unsuccessfully removed.");
                    }
                    break;
                case "N":
                    System.out.println("Okey! The product will not be removed.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Product has not been found.");
        }
    }

    /**
     * Asks the user to input the stock (if the input is wrong then a exception
     * turns out) Searches the products that has a stock lower than the inputed
     * Prints them.
     */
    private void doSearchProductsWithLowStock() {
        try {
            int stock = Integer.parseInt(readString("Input the stock: "));
            if (stock < 0) {
                throw new StockException("Wrong stock input.");
            }
            List<Product> productLowerStock = myStore.searchProductsWithLowStock(stock);
            displayAllProductsList(productLowerStock);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid stock.");
        } catch (StockException se) {
            System.out.println(se.getMessage());
        }
    }

    /**
     * Reads from the user data for a product
     *
     * @return a product with entered data or null in case of error
     */
    private Product readProduct() {
        Product product = null;
        try {
            String code = readString("Input the code: ");
            String name = readString("Input the name: ");
            double price = Double.parseDouble(readString("Input the price: "));
            int stock = Integer.parseInt(readString("Input the stock: "));
            if (stock < 0) {
                throw new StockException("Wrong stock input.");
            }
            product = new Product(code, name, price, stock);
        } catch (InputMismatchException | NumberFormatException e) {
            product = null;
        } catch (StockException se) {
            System.out.println(se.getMessage());
        }
        return product;
    }

    /**
     * Reads an string
     *
     * @param message the message
     * @return the string the user input
     */
    private String readString(String message) {
        System.out.println(message);
        return sc.next();
    }
}
