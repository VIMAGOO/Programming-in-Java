package cat.proven.store.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vimago
 */
public class Store {
    private String name;
    private List<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Store() {
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public boolean addProduct(Product product) {
        boolean result = false;
        if (!products.contains(product)) {
            products.add(product);
            result = true;
        }
        return result;
    }
}
