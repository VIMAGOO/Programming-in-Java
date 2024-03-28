package supermarket;

/**
 *
 * @author vimago
 */
public class Food extends Article {

    protected String data;
    protected final static double ALIMENTARY_IVA = 0.04;

    public Food(String data, String name, String maker, double price, String eanCode) {
        super(name, maker, price, eanCode);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Article: \n");
        sb.append("\tName: ").append(name+"\n");
        sb.append("\tMaker: ").append(maker+"\n");
        sb.append("\tPrice: ").append(price+"\n");
        sb.append("\tEanCode: ").append(eanCode+"\n");
        sb.append("\tData: ").append(data+"\n");
        return sb.toString();
    }
    
    /**
     * Adds the price an IVA
     * @return the price with IVA
     */
    @Override
    public double getPVP() {
        return price * (1 + ALIMENTARY_IVA);
    }

}
