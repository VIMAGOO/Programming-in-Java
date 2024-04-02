package products.exceptions;

/**
 *
 * @author vima2670
 */
public class StockException extends Exception {

    public StockException(String wrong_stock_input) {
        super(wrong_stock_input);
    }

}
