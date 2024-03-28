package supermarket;

/**
 *
 * @author vimago
 */
public class CooleadFood extends Food {

    private double temperature;

    public CooleadFood(double temperature, String data, String name, String maker, double price, String eanCode) {
        super(data, name, maker, price, eanCode);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Article{");
        sb.append("name=").append(name);
        sb.append(", maker=").append(maker);
        sb.append(", price=").append(price);
        sb.append(", eanCode=").append(eanCode);
        sb.append("Food{");
        sb.append("data=").append(data);
        sb.append("CooleadFood{");
        sb.append("temperature=").append(temperature);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * If the food product is in good conditions or not
     * @param temp the maximum temperature the producte can have before it rots
     * @return true if the temperature is proper, false if not
     */
    public boolean itRot(double temp) {
        boolean adequat = false;
        if (temperature >= temp) {
            adequat = true;
        }
        return adequat;
    }

}
