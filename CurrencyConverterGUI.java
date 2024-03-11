package currencyConvert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverterGUI {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("IDR", 15395.0); // Example exchange rate for IDR, you should update this with the actual rate
        // Add more currencies as needed
    }

    private static final String[] currencyCodes = {"USD", "EUR", "GBP", "IDR"};

    public static void main(String[] args) {
        // Swing components should be created and accessed on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Components
        JLabel amountLabel = new JLabel("Enter the amount to convert");
        JTextField amountField = new JTextField();

        JLabel sourceLabel = new JLabel("Select the source currency");
        JComboBox<String> sourceComboBox = createComboBox();
        sourceComboBox.setBorder(new LineBorder(Color.WHITE));

        JLabel targetLabel = new JLabel("Select the target currency");
        JComboBox<String> targetComboBox = createComboBox();
        targetComboBox.setBorder(new LineBorder(Color.WHITE));

        JButton convertButton = new JButton("Convert");

        JLabel resultLabel = new JLabel();

        // Button action listener
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    String sourceCurrency = sourceComboBox.getSelectedItem().toString();
                    String targetCurrency = targetComboBox.getSelectedItem().toString();

                    double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

                    resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, sourceCurrency, convertedAmount, targetCurrency));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter valid numbers.");
                }
            }
        });

        // Add components to the panel
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(sourceLabel);
        panel.add(sourceComboBox);
        panel.add(targetLabel);
        panel.add(targetComboBox);
        panel.add(convertButton);
        panel.add(resultLabel);

        // Set layout manager and add the panel to the frame
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(panel);

        // Set frame properties
        frame.setSize(380, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double sourceRate = exchangeRates.getOrDefault(sourceCurrency, 0.0);
        double targetRate = exchangeRates.getOrDefault(targetCurrency, 0.0);

        if (sourceRate == 0.0 || targetRate == 0.0) {
            JOptionPane.showMessageDialog(null, "Invalid currency code(s). Please check and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        return amount * (targetRate / sourceRate);
    }

    private static JComboBox<String> createComboBox() {
        JComboBox<String> comboBox = new JComboBox<>(currencyCodes);
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                setBackground(isSelected ? Color.BLUE : Color.WHITE);
                setForeground(isSelected ? Color.WHITE : Color.BLACK);
                return this;
            }
        });

        // Use a custom editor to set the background color of the editor component
        comboBox.setEditor(new BasicComboBoxEditor() {
            @Override
            public Component getEditorComponent() {
                Component editorComponent = super.getEditorComponent();
                editorComponent.setBackground(Color.WHITE);
                return editorComponent;
            }
        });

        return comboBox;
    }
}
