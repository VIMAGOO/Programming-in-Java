package supermarket;

/**
 *
 * @author vimago
 */
public class Clothes extends Article {

    private double size;

    public Clothes(String name, String maker, double price, String eanCode, double size) {
        super(name, maker, price, eanCode);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Article{");
        sb.append("name=").append(name);
        sb.append(", maker=").append(maker);
        sb.append(", price=").append(price);
        sb.append(", eanCode=").append(eanCode);
        sb.append("Clothes");
        sb.append("size=").append(size);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * Adds the price a tax depending of the size
     * @return the price with the tax added
     */
    @Override
    public double getPVP() {
        if (size > 20 && size < 30) {
            price = price * 0.9;
        } else if (size > 30 && size < 40) {
            price = price * 0.8;
        }
        return price;
    }

}
