package form;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vima2670
 */
public class BmiPanel extends JPanel implements ActionListener{
    
    private JTextField tfWeight;
    private JTextField tfHeight;
    private JTextField tfBmi;
    private JButton btClear;
    private JButton btCalculate;
    private Bmi bmi;
    public BmiPanel() {
        bmi = new Bmi();
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(4, 2));
        JLabel lb1;
        JLabel lb2;
        JLabel lb3;
        
//La fila
        lb1 = new JLabel("Weight: ");
        add(lb1);
        tfWeight = new JTextField(20);
        add(tfWeight);
        
//La fila
        lb2 = new JLabel("Height: ");
        add(lb2);
        tfHeight = new JTextField(20);
        add(tfHeight);
        
//La fila
        btClear = new JButton("Clear");
        btClear.setActionCommand("clear");
        btClear.addActionListener(this);
        add(btClear);
        btCalculate = new JButton("Calculate");
        btCalculate.setActionCommand("calculate");
        btCalculate.addActionListener(this);
        add(btCalculate);
        
//La fila
        lb3 = new JLabel("BMI: ");
        add(lb3);
        tfBmi = new JTextField(20);
        tfBmi.setEditable(false);
        add(tfBmi);
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch(action) {
            case "clear":
                doClear();
                break;
            case "calculate":
                doCalculate();
                break;
            default:
        }
    }

    private void doClear() {
        tfWeight.setText("");
        tfHeight.setText("");
        tfBmi.setText("");
    }

    private void doCalculate() {
        try {
        double weight = Double.parseDouble(tfWeight.getText());
        double height = Double.parseDouble(tfHeight.getText());
        String text = String.format("%s", bmi.calcBmi(weight,height));
        tfBmi.setText(text);
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Validation error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

