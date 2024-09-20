package csv;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * The menu of the store
 *
 * @author vimago
 */
public class Menu {

    private final String title;
    private final List<String> options;

    public Menu(String title) {
        this.title = title;
        this.options = new ArrayList();
    }

    public void addOption(String option) {
        options.add(option);
    }

    /**
     * Displays the menu and gets the option of the user
     *
     * @return the option of the user
     */
    public int displayMenuAndGetOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===" + title + "===");
        for (int i = 0; i < options.size(); i++) {
            System.out.format("%d. %s%n", i, options.get(i));
        }
        int option;
        try {
            System.out.println("Select an option: ");
            option = sc.nextInt();
            //add exceptions, inputmismatch, limit of the answers.
            if (option < 0 || option >= options.size()) {
                option = -1;
            }
        } catch (InputMismatchException ime) {
            sc.next();
            option = -1;
        }
        return option;
    }
}