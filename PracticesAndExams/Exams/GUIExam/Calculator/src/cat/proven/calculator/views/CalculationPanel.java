package cat.proven.calculator.views;

import cat.proven.calculator.model.Calculator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
 * @author vimago
 */
public class CalculationPanel extends JPanel implements ActionListener {

    //Attributes
    //Model and listener
    private final Calculator model;
    private ActionListener listener;

    //Buttons
    private JButton bSum;
    private JButton bRes;
    private JButton bMult;
    private JButton bDiv;

    //Text fields
    private JTextField tfFirst;
    private JTextField tfSecond;
    private JTextField tfResult;

    //Constructor
    public CalculationPanel(Calculator model) {
        this.model = model;
        listener = this;
        initComponents();
    }

    //Init components
    private void initComponents() {
        setBackground(Color.GRAY);
        //Set the border layout form which organizes the interface
        setLayout(new BorderLayout());

        //Values form
        JPanel values = createValuesForm();
        add(values, BorderLayout.WEST);

        //Functions form
        JPanel functions = createFunctionsForm();
        add(functions, BorderLayout.EAST);

        //Result form
        JPanel result = createResultForm();
        add(result, BorderLayout.SOUTH);
    }

    /**
     * Creates the values form
     *
     * @return a panel with the form
     */
    private JPanel createValuesForm() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        //Layout with 2 rows and 2 columns
        panel.setLayout(new GridLayout(2, 2));
        //Label
        JLabel firstOperand = new JLabel("First operand: ");
        firstOperand.setBackground(Color.GRAY);

        firstOperand.setForeground(Color.WHITE);
        firstOperand.setFont(new Font("Arial", 1, 20));
        panel.add(firstOperand);
        //Text field
        tfFirst = new JTextField(20);
        panel.add(tfFirst);
        //Label
        JLabel secondOperand = new JLabel("Second operand: ");
        secondOperand.setForeground(Color.WHITE);
        secondOperand.setFont(new Font("Arial", 1, 20));
        panel.add(secondOperand);
        //Text field
        tfSecond = new JTextField(20);
        panel.add(tfSecond);
        return panel;

    }

    /**
     * Creates de functions form
     *
     * @return a panel with the form
     */
    private JPanel createFunctionsForm() {
        JPanel panel = new JPanel();
        //Layout with 4 rows and 1 column
        panel.setLayout(new GridLayout(4, 1));
        //Buttons with their respective action command and listener
        bSum = new JButton("+");
        bSum.setActionCommand("sum");
        bSum.addActionListener(listener);
        panel.add(bSum);
        bRes = new JButton("-");
        bRes.setActionCommand("res");
        bRes.addActionListener(listener);
        panel.add(bRes);
        bMult = new JButton("*");
        bMult.setActionCommand("mult");
        bMult.addActionListener(listener);
        panel.add(bMult);
        bDiv = new JButton("/");
        bDiv.setActionCommand("div");
        bDiv.addActionListener(listener);
        panel.add(bDiv);
        return panel;
    }

    /**
     * Creates the result form
     *
     * @return a panel with the form
     */
    private JPanel createResultForm() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        //Layout with 1 row and 2 columns
        panel.setLayout(new GridLayout(1, 2));
        JLabel result = new JLabel("Result: ");
        result.setFont(new Font("Arial", 1, 20));
        result.setForeground(Color.WHITE);
        panel.add(result);
        tfResult = new JTextField(20);
        //Set tfResult as an non-editable text field
        tfResult.setEditable(false);
        panel.add(tfResult);
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "sum":
                doSum();
                break;
            case "res":
                doRes();
                break;
            case "mult":
                doMult();
                break;
            case "div":
                doDiv();
                break;
        }
    }

    /**
     * Does and assign to the result the sum of the two operands
     */
    private void doSum() {
        try {
            double firstOperand = Double.parseDouble(tfFirst.getText());
            double secondOperand = Double.parseDouble(tfSecond.getText());
            double value = model.getSum(firstOperand, secondOperand);
            String sValue = String.valueOf(value);
            tfResult.setText(sValue);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Does and assign to the result the rest of the two operands
     */
    private void doRes() {
        try {
            double firstOperand = Double.parseDouble(tfFirst.getText());
            double secondOperand = Double.parseDouble(tfSecond.getText());
            double value = model.getRes(firstOperand, secondOperand);
            String sValue = String.valueOf(value);
            tfResult.setText(sValue);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Does and assign to the result the multiplication of the two operands
     */
    private void doMult() {
        try {
            double firstOperand = Double.parseDouble(tfFirst.getText());
            double secondOperand = Double.parseDouble(tfSecond.getText());
            double value = model.getMult(firstOperand, secondOperand);
            String sValue = String.valueOf(value);
            tfResult.setText(sValue);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Does and assign to the result the division of the two operands
     */
    private void doDiv() {
        try {
            double firstOperand = Double.parseDouble(tfFirst.getText());
            double secondOperand = Double.parseDouble(tfSecond.getText());
            double value = model.getDiv(firstOperand, secondOperand);
            String sValue = String.valueOf(value);
            tfResult.setText(sValue);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
