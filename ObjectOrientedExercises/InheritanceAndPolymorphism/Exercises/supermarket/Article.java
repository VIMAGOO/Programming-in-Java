package supermarket;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Article {

    protected String name;
    protected String maker;
    protected double price;
    protected String eanCode;

    protected final static double IVA_ARTICLE = 0.21;

    public Article(String name, String maker, double price, String eanCode) {
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.eanCode = eanCode;
    }

    public Article() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.eanCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        return Objects.equals(this.eanCode, other.eanCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Article: \n");
        sb.append("\tName: ").append(name+"\n");
        sb.append("\tMaker: ").append(maker+"\n");
        sb.append("\tPrice: ").append(price+"\n");
        sb.append("\tEanCode: ").append(eanCode+"\n");
        return sb.toString();
    }
    
    /**
     * Adds the IVA to the price of the article
     * @return the price with IVA
     */
    public double getPVP() {
        return price * (1 + IVA_ARTICLE);
    }
}
