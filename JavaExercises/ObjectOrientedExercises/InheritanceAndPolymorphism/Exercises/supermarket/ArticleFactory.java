package supermarket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class ArticleFactory {
    /**
     * Selects the type of article depending of the user selection
     * @param type the type of article
     * @return the type of article read
     */
    public static Article readArticle(int type) {
        Article a = null;
        //showmenu
        switch (type) {
            case 1:
                a = readFood();
                break;
            case 2:
                a = readClothes();
            case 3:
                a = readCooleadFood();
            default:
        }
        return a;
    }
    
    /**
     * Reads the information of the food
     * @return returns the object filled with the info the user wrote
     */
    public static Article readFood() {
        Scanner sc = new Scanner(System.in);
        Food a = null;
        System.out.println("==FOOD ARTICLE==");
        try {
        System.out.println("Data: ");
        String data = sc.next();
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Maker: ");
        String maker = sc.next();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("EAN Code: ");
        String eanCode = sc.next();
        a = new Food(data, name, maker, price, eanCode);
        } catch (InputMismatchException e) {
            a = null;
        }
        return a;
    }
    
    /**
     * Reads the information of the clothes
     * @return returns the object filled with the info the user wrote
     */
    private static Article readClothes() {
        Scanner sc = new Scanner(System.in);
        Clothes a = null;
        System.out.println("==CLOTHES ARTICLE==");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Maker: ");
        String maker = sc.next();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("EAN Code: ");
        String eanCode = sc.next();
        System.out.println("Size: ");
        double size = sc.nextDouble();
        a = new Clothes(name, maker, price, eanCode, size);
        return a;
    }
    
    /**
     * Reads the information of the coolead food
     * @return returns the object filled with the info the user wrote
     */
    private static Article readCooleadFood() {
        Scanner sc = new Scanner(System.in);
        CooleadFood a = null;
        System.out.println("==COOLEADFOOD ARTICLE==");
        System.out.println("Data: ");
        String data = sc.next();
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Maker: ");
        String maker = sc.next();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("EAN Code: ");
        String eanCode = sc.next();
        System.out.println("Temperature: ");
        double temperature = sc.nextDouble();
        a = new CooleadFood(temperature, data, name, maker, price, eanCode);
        return a;
    }
}
