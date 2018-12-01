package session2;

import javax.swing.JOptionPane;

public class InputExample {
    public static void main(String[] args) {
        double number;
        int errorCount = 0;
        for (; ;) {
            try {
                number = Double.valueOf(JOptionPane.showInputDialog("Input double " +
                        "number"));
                break;
            } catch (NumberFormatException nfe) {
                errorCount++;
                JOptionPane.showMessageDialog(null,
                        "Error number format.The count of number error is: " + errorCount);

            }
        }
        System.out.println(number);
        JOptionPane.showMessageDialog(null,
                "The count of number error is: " + errorCount);
    }
}