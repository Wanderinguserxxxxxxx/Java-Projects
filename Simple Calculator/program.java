import javax.swing.*;
import java.awt.*;

abstract class PanelImplementation extends JFrame {
    protected JPanel panel, panel2, panel3;
    protected JTextField t1, t2;
    protected JLabel result;

    PanelImplementation() {
        // --- Input Panel ---
        panel = new JPanel(new GridLayout(2, 2, 20, 10));
        JLabel l1 = new JLabel("Enter first number: ");
        JLabel l2 = new JLabel("Enter second number: ");
        t1 = new JTextField();
        t2 = new JTextField();
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.setBackground(Color.ORANGE);

        // --- Buttons Panel ---
        panel2 = new JPanel(new GridLayout(3, 3, 20, 10));
        JButton bAdd = new JButton("ADD");
        JButton bSub = new JButton("SUBTRACT");
        JButton bMul = new JButton("MULTIPLY");
        JButton bDiv = new JButton("DIVIDE");
        JButton bMod = new JButton("MODULUS");
        JButton bSq = new JButton("SQUARE");
        JButton bClear = new JButton("CLEAR");
        JButton bExit = new JButton("EXIT");

        // Add buttons neatly
        panel2.add(bAdd);
        panel2.add(bSub);
        panel2.add(bMul);
        panel2.add(bDiv);
        panel2.add(bMod);
        panel2.add(bSq);
        panel2.add(bClear);
        panel2.add(bExit);

        // --- Result Panel ---
        panel3 = new JPanel(new GridLayout(1, 1, 20, 20));
        result = new JLabel("RESULT WILL BE SHOWN HERE", SwingConstants.CENTER);
        result.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        panel3.add(result);

        // --- Button Actions ---
        bAdd.addActionListener(e -> calculate("add"));
        bSub.addActionListener(e -> calculate("sub"));
        bMul.addActionListener(e -> calculate("mul"));
        bDiv.addActionListener(e -> calculate("div"));
        bMod.addActionListener(e -> calculate("mod"));
        bSq.addActionListener(e -> calculate("sq"));

        //  Clear button
        bClear.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            result.setText("RESULT WILL BE SHOWN HERE");
        });

        // Exit button
        bExit.addActionListener(e -> System.exit(0));
    }

    // --- Helper method to avoid repetition ---
    protected void calculate(String op) {
        try {
            int num1 = Integer.parseInt(t1.getText().trim());
            int num2 = Integer.parseInt(t2.getText().trim());

            switch (op) {
                case "add" -> result.setText("Sum: " + (num1 + num2));
                case "sub" -> result.setText("Difference: " + (num1 - num2));
                case "mul" -> result.setText("Product: " + (num1 * num2));
                case "div" -> result.setText(num2 == 0 ? "Can't divide by 0" : "Quotient: " + (num1 / num2));
                case "mod" -> result.setText("Modulus: " + (num1 % num2));
                case "sq" -> result.setText("Square of " + num1 + " = " + (num1 * num1) +
                                            " | Square of " + num2 + " = " + (num2 * num2));
            }
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers!");
        }
    }
}

class calculator_onceAgain extends PanelImplementation {
    calculator_onceAgain() {
        setSize(600, 800);
        setLayout(new FlowLayout(FlowLayout.CENTER, 60, 40));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.ORANGE);
        setTitle("CALCULATOR ONCE AGAIN");
        add(panel);
        add(panel2);
        add(panel3);
        setVisible(true);
    }
}

public class program {
    public static void main(String[] args) {
        new calculator_onceAgain();
    }
}
