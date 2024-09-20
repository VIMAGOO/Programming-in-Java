package cat.proven.currencyconverter;

import cat.proven.currencyconverter.model.CurrencyConverter;
import cat.proven.currencyconverter.views.MainFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author vimago
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverter model = new CurrencyConverter();
            MainFrame mainFrame = new MainFrame(model);
            mainFrame.setVisible(true);
        });
    }
    
}
