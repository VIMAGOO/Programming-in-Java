package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class BmiFrame extends JFrame implements ActionListener{
    
    //Listener
    private ActionListener listener;
    private String aboutMessage;
    
    private BmiPanel bmiPanel;
    private WelcomePanel welcomePanel;
    
    public BmiFrame() {
        initComponents();
        listener = this;
        aboutMessage = "<html><p>BMI Application</p><p>(c) ProvenSoft 2024</p></html>";
    }
    
    private void initComponents() {
        //set window title
        setTitle("BMI Application");
        //set default close operation when close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
        });
        //configure menu bar
        setUpMenu();
        //set window size
        bmiPanel = new BmiPanel();
        getContentPane().add(bmiPanel);
        setSize(400, 300);
        //set window location
        setLocationRelativeTo(null);  //center in screen
        welcomePanel = new WelcomePanel();
    }

    private void setUpMenu() {
        //Create the MenuBar object
        JMenuBar menuBar = new JMenuBar();
        //Create the menu and the menu item variables in order to generate the menu bar
        JMenu menu;
        JMenuItem menuItem;
        
        menu = new JMenu("Panels");
        menuItem = new JMenuItem("Calc. BMI");
        menuItem.setActionCommand("bmi");
        menuItem.addActionListener(listener);
        menu.add(menuItem);
        menuBar.add(menu);
        //First menu
        menu = new JMenu("File");
            //Menu items for File
            menuItem = new JMenuItem("Exit");
            menuItem.setActionCommand("exit");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
             menuItem = new JMenuItem("Home");
            menuItem.setActionCommand("home");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
            //Add menu to menuBar
        menuBar.add(menu);
        //Second menu
        menu = new JMenu("Help");
            //Menu items for Help
            menuItem = new JMenuItem("About");
            menuItem.setActionCommand("about");
            menuItem.addActionListener(listener);
            menu.add(menuItem);
            //Add menu to menuBar
        menuBar.add(menu);
        //Set menuBar as the MenuBar
        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "exit":
                doExit();
                break;
            case "about":
                doAbout();
                break;
            case "bmi":
                doShowBmiPanel();
                break;
            case "home":
                doShowWelcomePanel();
                break;
            default:
                //throw new AssertionError();
        }
        //System.out.println(e.getActionCommand());
        
    }

    private void doExit() {
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

    private void doAbout() {
        JOptionPane.showMessageDialog(this, aboutMessage);
    }

    private void doShowBmiPanel() {
        bmiPanel = new BmiPanel();
        setContentPane(bmiPanel);
        validate();
    }

    private void doShowWelcomePanel() {
        welcomePanel = new WelcomePanel();
        setContentPane(welcomePanel);
        validate();
    }
    
}