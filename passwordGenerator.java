package passwordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class passwordGenerator extends JFrame {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERIC_CHARACTERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+=<>?";

    private JTextField passwordField;
    private JCheckBox lowercaseCheckBox;
    private JCheckBox uppercaseCheckBox;
    private JCheckBox numbersCheckBox;
    private JCheckBox specialCharsCheckBox;
    private JButton generateButton;

    public passwordGenerator() {
        setTitle("Password Generator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(5, 1));

        lowercaseCheckBox = new JCheckBox("Include lowercase letters");
        uppercaseCheckBox = new JCheckBox("Include uppercase letters");
        numbersCheckBox = new JCheckBox("Include numbers");
        specialCharsCheckBox = new JCheckBox("Include special characters");

        passwordField = new JTextField();
        passwordField.setEditable(false);

        generateButton = new JButton("Generate Password");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generatePassword();
            }
        });

        add(lowercaseCheckBox);
        add(uppercaseCheckBox);
        add(numbersCheckBox);
        add(specialCharsCheckBox);
        add(generateButton);
        add(passwordField);

        setVisible(true);
    }

    private void generatePassword() {
        StringBuilder password = new StringBuilder();
        String characters = "";

        if (lowercaseCheckBox.isSelected()) {
            characters += LOWERCASE_CHARACTERS;
        }
        if (uppercaseCheckBox.isSelected()) {
            characters += UPPERCASE_CHARACTERS;
        }
        if (numbersCheckBox.isSelected()) {
            characters += NUMERIC_CHARACTERS;
        }
        if (specialCharsCheckBox.isSelected()) {
            characters += SPECIAL_CHARACTERS;
        }

        if (characters.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select at least one option", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int passwordLength = 12; // You can customize the password length as needed
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        passwordField.setText(password.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new passwordGenerator();
            }
        });
    }
}
