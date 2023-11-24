import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {

    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JButton resetButton;
    private JButton closeButton;

    public RegistrationForm() {
        super("Registration Form");
        setLayout(new GridLayout(5, 2));

        nameLabel = new JLabel("Name:");
        add(nameLabel);

        nameField = new JTextField();
        add(nameField);

        emailLabel = new JLabel("Email:");
        add(emailLabel);

        emailField = new JTextField();
        add(emailField);

        passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        passwordField = new JPasswordField();
        add(passwordField);

        registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Insert registration data into the database
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                // Database connection and insertion code goes here

                // Reset form fields after registration
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
            }
        });
        add(registerButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset form fields
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
            }
        });
        add(resetButton);

        closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(closeButton);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
