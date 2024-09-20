package cat.proven.store.persist;

import cat.proven.store.model.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vimago
 */
public class ProductFileCsv implements ProductFileInterface {

    @Override
    public int save(String filename, List<Product> products) {
        int counter = 0;
        System.out.println("Saving data to CSV file");
        try (PrintStream out = new PrintStream(filename)) {
            for (Product product : products) {
                out.print(toCsv(product));
                counter++;
            }
                    
        } catch (FileNotFoundException ex) {
            counter = 0;
        } catch (IOException io) {
            counter = 0;
        }
        return counter;
    }
    
    /**
     * toCsv() Converts object to CSV.
     *
     * @param obj: object to be converted.
     * @param delimiter: delimiter to be used between fields.
     * @return String with object data in CSV format.
     */
    public static String toCsv(Product obj) {
        return String.format("%s;%s;%s;%s", obj.getCode(), obj.getPrice(), obj.getStock(), obj.isFood());
    }
    @Override
    public List<Product> load(String filename) {
        List<Product> data = new ArrayList<>();
        System.out.println("Loading data from CSV file");
        try ( BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ( (line = br.readLine()) != null ) {
                Product p = fromCsv(line);
                if (p != null) {
                    data.add(p);
                }
            }
        } catch (FileNotFoundException ex) {
            data = null;
        } catch (IOException ex) {
            data = null;
        }
        return data;
    }

    /**
     * converts a csv format into a Product object
     * @param line the csv line
     * @return a product or null in case of error
     */
    private Product fromCsv(String line) {
        Product p = null;
        String[] fields = line.split(";");
        if (fields.length == 4) {
            try {
                String code = fields[0];
                double price = Double.parseDouble(fields[1]);
                int stock = Integer.parseInt(fields[2]);
                boolean food = Boolean.parseBoolean(fields[3]);
                p = new Product(code, price, stock, food);
            } catch (NumberFormatException ex) {
                p = null;
            }
        }
        return p;
    }

}
