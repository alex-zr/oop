package session2;

import javax.swing.JOptionPane;

public class InputExample {
    public static void main(String[] args) {
        double number;
        for (; ;) {
            try {
                number = Double.valueOf(JOptionPane.showInputDialog("Input double " +
                        "number"));
                break;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Error number format");
            }
        }
        System.out.println(number);
    }
}