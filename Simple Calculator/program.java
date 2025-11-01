import java.awt.Color;

import javax.swing.*;

class GUI_cal extends JFrame {
    GUI_cal() {
        setTitle("Simple Calculator");
        setSize(600, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.yellow);

        JLabel leb1 = new JLabel("Number 1:");
        leb1.setBounds(120, 120, 80, 100);
        add(leb1);
        JLabel leb2 = new JLabel("Number 2:");
        leb2.setBounds(120, 165, 80, 100);
        add(leb2);

        JTextField field1 = new JTextField();
        field1.setBounds(220, 145, 80, 40);
        add(field1);
        JTextField field2 = new JTextField();
        field2.setBounds(220, 195, 80, 40);
        add(field2);

        JLabel result = new JLabel("Result here");
        result.setBounds(330, 165, 180, 40);
        add(result);

        JButton sumButton = new JButton("ADD");
        sumButton.setBounds(170, 245, 80, 40);
        add(sumButton);

        JButton DiffButton = new JButton("Diff");
        DiffButton.setBounds(170, 295, 80, 40);
        add(DiffButton);

        JButton ProdButton = new JButton("Multiply");
        ProdButton.setBounds(255, 245, 100, 40);
        add(ProdButton);

        JButton DiviButton = new JButton("Divide");
        DiviButton.setBounds(255, 295, 100, 40);
        add(DiviButton);

        JButton ModButton = new JButton("Modulus");
        ModButton.setBounds(200 ,345, 100, 40);
        add(ModButton);

        sumButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int sum = num1 + num2;

                result.setText("The Sum is: " + sum);
            } catch (NumberFormatException e1) {
                result.setText("Enter valid number");
            }
        });
        DiffButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int Diff = num1 - num2;

                result.setText("The Difference is: " + Diff);
            } catch (NumberFormatException e2) {
                result.setText("Enter Valid number");
            }
        });
        ProdButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());
                int Product = num1 * num2;

                result.setText("The Product is: " + Product);
            } catch (NumberFormatException e2) {
                result.setText("Enter Valid number");
            }
        });
        DiviButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());

                if (num2 == 0) {
                    result.setText("Cannot divide by zero!");
                } else {
                    int Divide = num1 / num2;
                    result.setText("The quotient is: " + Divide);
                }
            } catch (NumberFormatException e2) {
                result.setText("Enter valid numbers!");
            } catch (Exception e3) {
                result.setText("Something went wrong!");
            }
        });
        ModButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(field1.getText());
                int num2 = Integer.parseInt(field2.getText());

                if (num2 == 0) {
                    result.setText("Cannot mod by zero!");
                } else {
                    int modulus = num1 % num2;
                    result.setText("The remainder is: " + modulus);
                }
            } catch (NumberFormatException e2) {
                result.setText("Enter valid numbers!");
            } catch (Exception e3) {
                result.setText("Something went wrong!");
            }
        });

        setVisible(true);// always in last
    }
}

public class program {
    public static void main(String[] args) {
        new GUI_cal();
    }
}
