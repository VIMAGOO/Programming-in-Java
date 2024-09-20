package cat.proven.currencyconverter.model;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author vimago
 */
public class CurrencyConverter {
    private Map<String, Double> ratios;

    public CurrencyConverter() {
        ratios = new HashMap<>();
        loadRatios();
    }

    private void loadRatios() {
        ratios.put("USD", 0.92);
        ratios.put("GBP", 1.15);
        ratios.put("ARS", 965.24);
        ratios.put("CHF", 0.99);
    }
    
    public double fromEuro(String currency, double amount) {
        double value = 0.0;
        switch(currency.toUpperCase()) {
            case "GBP":
                value = amount / 1.15;
                break;
            case "USD":
                value = amount / 0.92;
                break;
            case "ARS":
                value = amount / 965.24;
                break;
            case "CHF":
                value = amount / 0.99;
                break;
             
        }
        return value;
    }
    
    public double toEuro(String currency, double amount) {
        double value = 0.0;
        switch(currency.toUpperCase()) {
            case "GBP":
                value = amount * 1.15;
                break;
            case "USD":
                value = amount * 0.92;
                break;
            case "ARS":
                value = amount * 965.24;
                break;
            case "CHF":
                value = amount * 0.99;
                break;
        }
        return value;
    }
    
    public Set<String> getCurrencyName() {
        return ratios.keySet();
    }
}
