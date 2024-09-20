package cat.proven.currencyconverter.views;

import cat.proven.currencyconverter.model.CurrencyConverter;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel de conversión de divisas mejorado.
 * 
 * @autor vimago
 */
public class ConversionPanel extends JPanel implements ActionListener {
    private CurrencyConverter model;
    private ActionListener listener;

    private JTextField tfCoin;
    private JTextField tfOtherCoin;

    private JButton bFromCoin;
    private JButton bToCoin;

    private JComboBox<String> cbCoins;

    public ConversionPanel(CurrencyConverter model) {
        this.model = model;
        this.listener = this;
        initComponents();
        customizeComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // EUR Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("EUR:"), gbc);

        // EUR TextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        tfCoin = new JTextField(10);
        add(tfCoin, gbc);

        // From EUR Button
        gbc.gridx = 2;
        gbc.gridy = 0;
        bFromCoin = new JButton("From EUR");
        bFromCoin.setActionCommand("fromEur");
        bFromCoin.addActionListener(listener);
        add(bFromCoin, gbc);

        // To EUR Button
        gbc.gridx = 2;
        gbc.gridy = 1;
        bToCoin = new JButton("To EUR");
        bToCoin.setActionCommand("toEur");
        bToCoin.addActionListener(listener);
        add(bToCoin, gbc);

        // Other Coin ComboBox
        gbc.gridx = 0;
        gbc.gridy = 1;
        cbCoins = createCurrencyComboBox();
        cbCoins.setActionCommand("coinChanged");
        cbCoins.addActionListener(listener);
        add(cbCoins, gbc);

        // Other Coin TextField
        gbc.gridx = 1;
        gbc.gridy = 1;
        tfOtherCoin = new JTextField(10);
        add(tfOtherCoin, gbc);
    }

    private void customizeComponents() {
        // Personaliza los JLabel
        for (int i = 0; i < getComponentCount(); i++) {
            if (getComponent(i) instanceof JLabel) {
                JLabel label = (JLabel) getComponent(i);
                label.setFont(new Font("Arial", Font.BOLD, 14));
                label.setForeground(new Color(25, 25, 112)); // Azul oscuro
            }
        }

        // Personaliza los JTextField
        tfCoin.setFont(new Font("Arial", Font.PLAIN, 14));
        tfOtherCoin.setFont(new Font("Arial", Font.PLAIN, 14));

        // Personaliza los JButton
        bFromCoin.setBackground(new Color(135, 206, 250)); // Azul claro
        bFromCoin.setForeground(Color.BLACK);
        bFromCoin.setFont(new Font("Arial", Font.BOLD, 12));

        bToCoin.setBackground(new Color(135, 206, 250)); // Azul claro
        bToCoin.setForeground(Color.BLACK);
        bToCoin.setFont(new Font("Arial", Font.BOLD, 12));

        // Personaliza el JComboBox
        cbCoins.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "fromEur":
                doFromEur();
                break;
            case "toEur":
                doToEur();
                break;
            case "coinChanged":
                doFromEur();
                break;
            default:
                // Do nothing
        }
    }

    private JComboBox<String> createCurrencyComboBox() {
        JComboBox<String> cbCoins = new JComboBox<>();
        Set<String> coins = model.getCurrencyName();
        for (String coin : coins) {
            cbCoins.addItem(coin);
        }
        return cbCoins;
    }

    private void doFromEur() {
        try {
            double coinEur = Double.parseDouble(tfCoin.getText());
            String value = String.format("%1.2f",model.fromEuro(cbCoins.getSelectedItem().toString(), coinEur));
            tfOtherCoin.setText(value);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Validation error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void doToEur() {
        try {
            double coinOther = Double.parseDouble(tfOtherCoin.getText());
            String value = String.format("%1.2f",model.toEuro(cbCoins.getSelectedItem().toString(), coinOther));
            tfCoin.setText(value);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid data", "Validation error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
