package cat.proven.store.persist;

import cat.proven.store.model.Product;
import java.util.List;

/**
 *
 * @author vimago
 */
public interface ProductFileInterface {
    /**
     * saves a list of products to a file
     * @param filename the path to the file
     * @param products the list of products to save
     * @return the number of products actually saved
     */
    public int save(String filename, List<Product> products);
    /**
     * loads from file a list of products
     * @param filename the path to the file
     * @return a list of product read from file or null in case of error
     */
    public List<Product> load(String filename);
}
