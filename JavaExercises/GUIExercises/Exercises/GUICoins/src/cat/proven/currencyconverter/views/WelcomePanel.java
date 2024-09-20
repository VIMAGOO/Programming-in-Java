package cat.proven.currencyconverter.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel de bienvenida mejorado para la aplicación de conversión de divisas.
 * 
 * @autor vimago
 */
public class WelcomePanel extends JPanel {

    public WelcomePanel() {
        initComponents();
    }

    private void initComponents() {
        // Establecemos el diseño
        setLayout(new GridBagLayout());
        setBackground(new Color(173, 216, 230)); // Azul claro

        // Configuramos el título
        JLabel title = new JLabel("Welcome to Currency Converter");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(25, 25, 112)); // Azul oscuro

        // Configuramos el subtítulo
        JLabel subtitle = new JLabel("Easily convert currencies with up-to-date rates");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 16));
        subtitle.setForeground(new Color(25, 25, 112)); // Azul oscuro

        // Añadimos los componentes al panel con restricciones de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(title, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(subtitle, gbc);
    }
}
