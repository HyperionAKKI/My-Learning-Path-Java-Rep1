import javax.swing.*;
public class Swing {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Add Two Numbers");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create components
        JTextField num1 = new JTextField();
        num1.setBounds(50, 20, 80, 30);
        JTextField num2 = new JTextField();
        num2.setBounds(150, 20, 80, 30);

        JButton addButton = new JButton("Ok");
        addButton.setBounds(50, 60, 80, 30);
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(150, 60, 100, 30);


        // Action listener for addition
        addButton.addActionListener(e -> {
            int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
            resultLabel.setText("Result: " + sum);
        });

        // Add components to frame
        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(resultLabel);

        // Set visibility
        frame.setVisible(true);
    }
}