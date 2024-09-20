package form;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BmiPanel3 extends JPanel {
    
    private JTextField tfWeight;
    private JTextField tfHeight;
    private JTextField tfBmi;

    private ActionListener listener;
    
    public BmiPanel3() {
        initComponents();
        doClear();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        //create header label
        JLabel lbHeader = new JLabel("BMI calculation form");
        lbHeader.setHorizontalAlignment(JLabel.CENTER);
        add(lbHeader, BorderLayout.NORTH);
        //create calculation form
        JPanel form = createBmiForm();
        add(form, BorderLayout.CENTER);
    }
    
    private JPanel createBmiForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,2));
        //
        panel.add(new JLabel("Weight:"));
        tfWeight = new JTextField(20);
        panel.add(tfWeight);
        //
        panel.add(new JLabel("Height:"));
        tfHeight = new JTextField(20);
        panel.add(tfHeight);
        //
        JButton btClear = new JButton("Clear");
        btClear.setActionCommand("clear");
        panel.add(btClear);
        JButton btCalc = new JButton("Calculate");
        btCalc.setActionCommand("calculate");
        panel.add(btCalc);
        //
        panel.add(new JLabel("Body mass index:"));
        tfBmi = new JTextField(20);
        tfBmi.setEditable(false);
        panel.add(tfBmi);
        //
        return panel;
    }

    private void doClear() {
        tfWeight.setText("0.0");
        tfHeight.setText("0.0");
        tfBmi.setText("0.0");        
    }

}