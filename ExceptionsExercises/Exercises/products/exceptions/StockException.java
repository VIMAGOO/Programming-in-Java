package products.exceptions;

/**
 *
 * @author vimago
 */
public class StockException extends Exception {

    public StockException(String wrong_stock_input) {
        super(wrong_stock_input);
    }

}
