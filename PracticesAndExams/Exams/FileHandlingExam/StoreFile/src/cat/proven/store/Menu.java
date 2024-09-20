package cat.proven.store;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Menu {

    private String title;
    private List<String> options;

    public Menu(String title) {
        this.title = title;
        this.options = new ArrayList<>();
    }

    public void addOption(String option) {
        options.add(option);
    }

    /**
     * displays menu and reads user's option
     *
     * @return option number selected by user or -1 if invalid option
     */
    public int displayMenuAndGetOption() {
        int opt;
        Scanner sc = new Scanner(System.in);
        //display title
        System.out.println("=======" + title + "=======");
        //display options
        for (int i = 0; i < options.size(); i++) {
            System.out.printf("%d. %s%n", i, options.get(i));
        }
        try {
            System.out.print("Select an option: ");
            opt = sc.nextInt();
            if ((opt < 0) || (opt >= options.size())) {
                opt = -1;
            }
        } catch (InputMismatchException ex) {
            sc.next();
            opt = -1;
        }
        return opt;
    }
}
