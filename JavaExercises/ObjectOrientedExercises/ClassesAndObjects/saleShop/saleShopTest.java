package saleShop;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class saleShopTest {

    private Article[] articles;
    private SaleLine[] lines;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        saleShopTest ap = new saleShopTest();
        ap.run();
    }

    public void run() {
        articles = generateArticles();
        boolean exit = false;

        do {
            Client client = readClient();
            System.out.println(client.toString());
            int maxArticles = Integer.parseInt(readString("Number of articles: "));
            SaleLine[] lines = readLines(maxArticles);
           
            System.out.println(lines.toString());
            System.out.println("Another client? (Y/N)");
            String answer = sc.next().toLowerCase();
            exit = answer.equalsIgnoreCase("n");
        } while (!exit);

    }

    private void printBill(Sale sale) {
        sale.toString();
    }

    private Article[] generateArticles() {
        Article[] articles = new Article[5];
        articles[0] = new Article("ABCD1", "SpiderMan", 10.5);
        articles[1] = new Article("ABCD2", "BatMan", 14.5);
        articles[2] = new Article("ABCD3", "Neuralink", 16.5);
        articles[3] = new Article("ABCD4", "Tesla", 15.5);
        articles[4] = new Article("ABCD5", "Amazon", 13.5);
        return articles;
    }

//    private SaleLine[] generateLines(Article[] articles) {
//        SaleLine[] lines = new SaleLine[5];
//        lines[0] = new SaleLine(articles[0], 5);
//        lines[1] = new SaleLine(articles[1], 5);
//        lines[2] = new SaleLine(articles[2], 5);
//        lines[3] = new SaleLine(articles[3], 5);
//        lines[4] = new SaleLine(articles[4], 5);
//        return lines;
//    }

    private Client readClient() {
        Client client = null;
        String nif = readString("Client nif: ");
        String name = readString("Client name: ");
        client = new Client(nif, name);
        return client;
    }

    private String readString(String message) {
        System.out.println(message);
        return sc.next();
    }

    private SaleLine[] readLines(int maxArticles) {
        SaleLine[] lines = new SaleLine[maxArticles];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = readLine();
        }
        return lines;
    }

    private SaleLine readLine() {
        SaleLine line = null;
        String code = readString("Article code: ");
        int quant = Integer.parseInt(readString("Quantity: "));
        Article article = findArticle(code);
        if (article != null) {
            line = new SaleLine(article, quant);
        }
       return line;
    }

    private Article findArticle(String code) {
        Article found = null;
        for(int i = 0; i < articles.length; i++) {
            Article elem = articles[i];
            if(elem.getCode().equals(code)) {
                found = elem;
                break;
            }
        }
        return found;
    }

}
