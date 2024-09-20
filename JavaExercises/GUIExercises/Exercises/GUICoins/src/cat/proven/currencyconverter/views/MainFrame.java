package cat.proven.currencyconverter.views;

import cat.proven.currencyconverter.model.CurrencyConverter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vimago
 */
public class MainFrame extends JFrame implements ActionListener {
    
    private CurrencyConverter model;
    private ConversionPanel conversionPanel;
    private WelcomePanel welcomePanel;
    private ActionListener listener;
    
    public MainFrame(CurrencyConverter model) {
        this.model = model;
        this.listener = this;
        initComponents();
    }

    private void initComponents() {
        setTitle("Currency converter application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //TODO add a windows listener
        JMenuBar menuBar = setUpMenuBar();
        setJMenuBar(menuBar);
        displayWelcomePanel();
        
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void displayWelcomePanel() {
        welcomePanel = new WelcomePanel();
        setContentPane(welcomePanel);
        validate();
    }

    private JMenuBar setUpMenuBar()  {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem menuItem;
        
        menu = new JMenu("File");
            menuItem = new JMenuItem("Exit");
            menuItem.setActionCommand("exit");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
        menuBar.add(menu);
        
        menu = new JMenu("Panels");
        menuItem = new JMenuItem("Home");
            menuItem.setActionCommand("home");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
            menuItem = new JMenuItem("Converter");
            menuItem.setActionCommand("converter");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
        menuBar.add(menu);
        
        menu = new JMenu("Help");
            menuItem = new JMenuItem("About");
            menuItem.setActionCommand("about");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
        menuBar.add(menu);
        
        
        
        return menuBar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch(action) {
            case "home":
                doGoHome();
                break;
            case "exit":
                doExit();
                break;
            case "converter":
                doGoConverter();
                break;
            case "about":
                doAbout();
                break;
            default:
        }
    }

    private void doGoHome() {
        welcomePanel = new WelcomePanel();
        setContentPane(welcomePanel);
        validate();
    }

    private void doExit() {
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.OK_OPTION);
        if (answer == 0) {
            System.exit(0);
        }
    }

    private void doGoConverter() {
        conversionPanel = new ConversionPanel(model);
        setContentPane(conversionPanel);
        validate();
    }

    private void doAbout() {
        JOptionPane.showMessageDialog(this, "This is an application for transforming EUR to other coin.");
    }
}
