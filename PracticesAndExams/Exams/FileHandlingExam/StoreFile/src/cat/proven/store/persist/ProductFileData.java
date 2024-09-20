import cat.proven.store.model.Product;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductFileData implements ProductFileInterface {

    @Override
    public int save(String filename, List<Product> products) {
        int counter = 0;
        System.out.println("Saving data to data file");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (Product product : products) {
                dos.writeUTF(product.getCode());
                dos.writeDouble(product.getPrice());
                dos.writeInt(product.getStock());
                dos.writeBoolean(product.isFood());
                counter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductFileData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return counter;
    }

    @Override
    public List<Product> load(String filename) {
        List<Product> data = null;
        System.out.println("Loading data from data file");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            // Read data from the file and create products
            while (dis.available() > 0) {
                String code = dis.readUTF();
                double price = dis.readDouble();
                int stock = dis.readInt();
                boolean food = dis.readBoolean();
                Product product = new Product(code, price, stock, food);
                data.add(product);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductFileData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
