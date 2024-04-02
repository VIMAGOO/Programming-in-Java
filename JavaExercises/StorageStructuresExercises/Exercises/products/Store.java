package products;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Manipulació de la llista de productes
 *
 * @author vima2670
 */
public class Store {

    private final List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    /**
     * Adds a product to the list avoiding null products and products with
     * existing code or null code.
     *
     * @param product
     * @return true if the product has been added, false if not
     */
    public boolean addProduct(Product product) {
        boolean success = false;
        if (product != null) {
            if (product.getCode() != null) {
                boolean codeRepeats = false;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getCode().equalsIgnoreCase(product.getCode())) {
                        codeRepeats = true;
                    }
                }
                if (!codeRepeats) {
                    products.add(product);
                    success = true;
                }
            }
        }
        return success;
    }

    /**
     * Removes a product which is in the list if the code of the product has
     * been found
     *
     * @param product the product that has to be removed
     * @return true if the removing has been done, false if not
     */
    public boolean removeProduct(Product product) {
        return products.remove(product);
    }

    /**
     * Modifies the current product with the new product
     *
     * @param currentProduct the product that is in the list of products
     * @param newProduct a new product which is not on the list
     * @return success if both products are not nulls, if both codes are not
     * nulls and if the code of the new product does not exist and the current
     * product exists
     */
    public boolean modifyProduct(Product currentProduct, Product newProduct) {
        boolean success = false;
        if (currentProduct != null && newProduct != null) {
            if (currentProduct.getCode() != null && newProduct.getCode() != null) {
                boolean codeRepeats = false;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getCode().equalsIgnoreCase(newProduct.getCode())) {
                        codeRepeats = true;
                    }
                }
                if (!codeRepeats) {
                    products.set(products.indexOf(currentProduct), newProduct);
                    success = true;
                }
            }
        }

        return success;
    }

    /**
     * Searches a product with the product code provided
     *
     * @param code the code of the product
     * @return the product that has been found, null if not
     */
    public Product searchProduct(String code) {
        Product productFound = null;
        int index = products.indexOf(new Product(code));
        if (index != -1) {
            productFound = products.get(index);
        }
        return productFound;
    }

    /**
     * Creates a list with all the products of the store
     *
     * @return the list of all products, null if there are not products
     */
    public List<Product> searchAllProducts() {
        List<Product> productsList = new ArrayList<>(products);
        return productsList;
    }

    /**
     * Adds a product to the list if the stock of it is lower than the stock
     * parameter
     *
     * @param stock the stock
     * @return the list with all the products lower than the stock
     */
    public List<Product> searchProductsWithLowStock(int stock) {
        List<Product> productsLowStock = new ArrayList();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getStock() <= stock) {
                productsLowStock.add(products.get(i));
            }
        }
        return productsLowStock;
    }

    /**
     * Generates the data for the store
     */
    public void generateData() {
        for (int i = 0; i < 1000000; i++) {
            String name = String.format("Name%02d", i + 1);
            String code = String.format("Code%02d", i + 1);
            Random ran = new Random();
            int stock = ran.nextInt(0, 11);
            int price = ran.nextInt(10, 60);
            products.add(new Product(code, name, price, stock));
        }
    }
}
