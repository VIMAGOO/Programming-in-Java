package form;


import javax.swing.SwingUtilities;

public class BmiMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        BmiFrame frame = new BmiFrame();
        frame.setVisible(true);
        });
    }  
}