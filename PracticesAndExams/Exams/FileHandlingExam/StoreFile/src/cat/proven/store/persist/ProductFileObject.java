package cat.proven.store.persist;

import cat.proven.store.model.Product;
import cat.proven.store.persist.ProductFileInterface;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductFileObject implements ProductFileInterface {

    @Override
    public int save(String filename, List<Product> products) {
        int counter = 0;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            // Write each product object to the file
            for (Product product : products) {
                oos.writeObject(product);
                counter++;
            }
            System.out.println("Saving data to object file");
        } catch (IOException ex) {
            Logger.getLogger(ProductFileObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return counter;
    }

    @Override
    public List<Product> load(String filename) {
        List<Product> data = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            // Read objects from the file until EOFException is caught
            while (true) {
                try {
                    Product product = (Product) ois.readObject();
                    // Add product to the list or do whatever you want with it
                } catch (EOFException e) {
                    break; // Reached end of file
                }
            }
            System.out.println("Loading data from object file");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductFileObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProductFileObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
