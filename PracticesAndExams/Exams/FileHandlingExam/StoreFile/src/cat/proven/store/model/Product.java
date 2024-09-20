package cat.proven.store.model;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Product implement Serialized{
    private String code;
    private double price;
    private int stock;
    private boolean food;

    public Product(String code, double price, int stock, boolean food) {
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.food = food;
    }

    public Product(String code) {
        this.code = code;
    }

    public Product() {
    }

    public Product(Product other) {
        this.code = other.code;
        this.price = other.price;
        this.stock = other.stock;
        this.food = other.food;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.code);
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
        final Product other = (Product) obj;
        return Objects.equals(this.code, other.code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("code=").append(code);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", food=").append(food);
        sb.append('}');
        return sb.toString();
    }
    
}
