package supermarket;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class SupermarketMain {

    private Supermarket mySupermarket;
    private Article[] articles;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SupermarketMain sm = new SupermarketMain();
        sm.run();
    }

    private void run() {
        //instantiate supermarket
        mySupermarket = new Supermarket("Mercadona Hospitalet", "1234567H", 5);
        //generate articles
        generateArticles();
        //instantiate menu
        SupermarketMenu menu = new SupermarketMenu("SUPERMARKET MENU");
        //interact loop user
        boolean exit = false;
        do {
            //show menu and read user choice
            int selectedOption = menu.showMenu();
            //process option
            switch (selectedOption) {
                case 1: //add an article
                    doAddNewArticle();
                    break;
                case 2: //delete an article
                    doDeleteArticle();
                    break;
                case 3: //search an article
                    doSearchArticle();
                    break;
                case 4: //list an article
                    doListAllArticles();
                    break;
                case 5: //exit the program
                    exit = true;
                    break;
                default:
                    System.out.println("You haven't introduced a correct option.");
            }
        } while (!exit);
    }
    
    /**
     * Llista els articles que té el supermercat
     */
    private void doListAllArticles() {
        System.out.println(mySupermarket.getNumArticles());
        for (int i = 0; i < mySupermarket.getNumArticles(); i++) {
            System.out.println(articles[i].toString());
        }
    }
    
    /**
     * Generates the data of the articles
     */
    private void generateArticles() {
        articles = new Article[mySupermarket.getMaxArticles()];
        articles[0] = new Article("Tomato", "Mercadona", 50, "ES1");
        articles[1] = new Article("Carrot", "Mercadona", 30, "ES2");
        articles[2] = new Article("Pumpkin", "Mercadona", 10, "ES3");
        articles[3] = new Article("Potato", "Mercadona", 20, "ES4");
        mySupermarket.setNumArticles(4);
    }
    
    /**
     * Adds a new article
     */
    private void doAddNewArticle() {
        System.out.println("Input type: ");
        SupermarketMenu menuType = new SupermarketMenu("TYPE MENU");
        //show menu
        int type = menuType.showMenuType();
        Article articleToAdd = ArticleFactory.readArticle(type);
        if (articleToAdd != null) {
            boolean success = mySupermarket.addArticle(articleToAdd, articles);
            if (success) {
                System.out.println("Article successfully added.");
            } else {
                System.out.println("Article unsuccessfully added.");
            }
        } else {
            System.out.println("Error reading the article.");
        }
    }
    
    /**
     * Deletes an article
     */
    private void doDeleteArticle() {
        System.out.println("Input EAN code: ");
        String eanCode = sc.next();
        mySupermarket.deleteArticle(eanCode, articles);
    }
    
    /**
     * Searches an article
     */
    private void doSearchArticle() {
        System.out.println("Input EAN code: ");
        String eanCode = sc.next();
        Article articleFound = mySupermarket.searchArticle(eanCode, articles);
        if (articleFound != null) {
            System.out.println(articleFound.toString());
        } else {
            System.out.println("Article unsuccessfully found.");
        }
    }


}
