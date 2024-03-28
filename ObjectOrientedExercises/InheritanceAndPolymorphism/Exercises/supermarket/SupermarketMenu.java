package supermarket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class SupermarketMenu {
    private String title;
    private String[] options = {"1.Add an article.",
        "2.Delete an article",
        "3.Search an article",
        "4.List all articles",
        "5.Exit"};
    private String[] optionsType = {"1.Food",
        "2.Clothes",
        "3.Coolead food"};
    public SupermarketMenu(String title) {
        this.title = title;
    }
    
    /**
     * displays menu and reads option number from user
     * @return the option the user selected, in case of error it returns -1
     */
    public int showMenu() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.format("%s %n", title);
        for (int i = 0; i < options.length; i++) {
            System.out.format("%s%n", options[i]);
        }
        try {
        System.out.println("Select an option: ");
        option = sc.nextInt();
        //validate interval
        if(option > options.length || option < 1) {
            option = -1;
        }
        } catch (InputMismatchException e) {
            sc.next();
            option = -1;
        }
        return option;
    }
    
    /**
     * Shows the menu of the type of article
     * @return the option type of the user
     */
    public int showMenuType() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.format("%s %n", title);
        for (int i = 0; i < optionsType.length; i++) {
            System.out.format("%s%n", optionsType[i]);
        }
        try {
        System.out.println("Select an option: ");
        option = sc.nextInt();
        //validate interval
        if(option > optionsType.length || option < 1) {
            option = -1;
        }
        } catch (InputMismatchException e) {
            sc.next();
            option = -1;
        }
        return option;
    }
    
}
