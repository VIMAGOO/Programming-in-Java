package cat.proven.calculator.views;

import cat.proven.calculator.model.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author vimago
 */
public class MainFrame extends JFrame implements ActionListener {

    private Calculator model;
    private HomePanel homePanel;
    private CalculationPanel calculationPanel;
    private ActionListener listener;
    //TODO add attributes

    public MainFrame(Calculator model) {
        this.model = model;
        this.listener = this;
        initComponents();
    }

    private void initComponents() {
        //Set the title in the page
        setTitle("Calculator program");
        //Ask if the user wants to close
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
        });
        //Create the menu bar
        setUpMenu();
        //Display the home panel as default 
        displayHome();
        //Size of the page
        setSize(600, 400);
        //Position of the page
        setLocationRelativeTo(null);

    }

    /**
     * Sets up the menu bar
     */
    private void setUpMenu() {
        //Create or instance menuBar, menu and menuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem menuItem;

        //Create the different menus as the client wants
        menu = new JMenu("File");
        menuItem = new JMenuItem("Home");
        menuItem.setActionCommand("home");
        menuItem.addActionListener(listener);
        menu.add(menuItem);

        menuItem = new JMenuItem("Exit");
        menuItem.setActionCommand("exit");
        menuItem.addActionListener(listener);
        menu.add(menuItem);
        menuBar.add(menu);

        menu = new JMenu("Panels");
        menuItem = new JMenuItem("Calculation panel");
        menuItem.setActionCommand("calculator");
        menuItem.addActionListener(listener);
        menu.add(menuItem);
        menuBar.add(menu);

        menu = new JMenu("Help");
        menuItem = new JMenuItem("About");
        menuItem.setActionCommand("about");
        menuItem.addActionListener(listener);
        menu.add(menuItem);
        menuBar.add(menu);

        //Set menuBar as the menu bar
        setJMenuBar(menuBar);
    }
    //TODO add methods

    /**
     * Displays home
     */
    private void displayHome() {
        homePanel = new HomePanel();
        setContentPane(homePanel);
        validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "home":
                doHome();
                break;
            case "exit":
                doExit();
                break;
            case "calculator":
                doCalculator();
                break;
            case "about":
                doAbout();
                break;
        }
    }

    /**
     * Displays home
     */
    private void doHome() {
        homePanel = new HomePanel();
        setContentPane(homePanel);
        validate();
    }

    /**
     * Confirms if the user really wants to exit
     */
    private void doExit() {
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "EXIT", JOptionPane.OK_OPTION);
        if (answer == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    /**
     * Displays calculator
     */
    private void doCalculator() {
        calculationPanel = new CalculationPanel(model);
        setContentPane(calculationPanel);
        validate();
    }

    /**
     * Shows a message about the app
     */
    private void doAbout() {
        JOptionPane.showMessageDialog(this, "This is a Calculator App from ProvenSoft");
    }

}
