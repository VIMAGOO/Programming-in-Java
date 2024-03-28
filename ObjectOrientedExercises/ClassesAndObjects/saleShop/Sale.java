package saleShop;

/**
 *
 * @author vimago
 */
public class Sale {
    private Client client;
    private SaleLine[] lines;
    
    
    public Sale(Client client, SaleLine[] lines) {
        this.client = client;
        this.lines = lines;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public SaleLine[] getLines() {
        return lines;
    }

    public void setLines(SaleLine[] lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sale{");
        sb.append("client=").append(client);
        sb.append(", lines=").append(lines);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
