package temperatureConvert;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tempConvertwithGUI extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public tempConvertwithGUI() {
        // Set up the JFrame
        setTitle("Temperature Converter");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create components
        inputField = new JTextField(15);
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ");

        // Set font size for labels and button
        Font labelFont = new Font("Arial", Font.PLAIN, 14);
        Font buttonFont = new Font("Arial", Font.BOLD, 14);

        // Set font for components
        inputField.setFont(labelFont);
        resultLabel.setFont(labelFont);
        convertButton.setFont(buttonFont);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        // Add components to the frame
        add(new JLabel("Enter temperature in Celcius:"));
        add(inputField);
        add(convertButton);
        add(resultLabel);

        // Set the frame visible
        setVisible(true);
    }

    private void convertTemperature() {
        try {
            // Get the temperature in Celcius from the input field
            double celcius = Double.parseDouble(inputField.getText());

            // Convert Celcius to Fahrenheit
            double fahrenheit = (celcius * 9 / 5) + 32;

            // Display the result
            resultLabel.setText("Result: " + String.format("%.2f", fahrenheit) + " Fahrenheit.");
        } catch (NumberFormatException ex) {
            // Handle the invalid input
            resultLabel.setText("Invalid input. Please enter the valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tempConvertwithGUI() ;
            }
        });
    }
}