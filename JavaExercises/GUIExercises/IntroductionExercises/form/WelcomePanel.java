package form;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author vimago
 */
public class WelcomePanel extends JPanel {

    public WelcomePanel() {
        initComponents();
        
    }

    private void initComponents() {
        setBackground(Color.BLACK);
        JLabel lbWelcome = new JLabel("Welcom to BMI Application");
        lbWelcome.setSize(30, 40);
    }
    
    
    
}
