package cat.proven.calculator.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author vimago
 */
public class HomePanel extends JPanel {

    public HomePanel() {
        initComponents();
    }

    private void initComponents() {
        //Set the border layout
        setLayout(new BorderLayout());
        //Set the background in black
        setBackground(Color.GRAY);
        //Create a title label
        JLabel title = new JLabel("Welcome to calculator application");
        //Set the color of the title
        title.setForeground(Color.WHITE);
        //Set the font
        title.setFont(new Font("Arial", 3, 30));
        //Set the position
        title.setHorizontalAlignment(SwingConstants.CENTER);
        //Add the title
        add(title);
    }

}
