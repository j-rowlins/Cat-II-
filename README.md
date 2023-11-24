import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, usernameField, emailField, phoneField, addressField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton submitButton, resetButton, closeButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addLabelAndTextField("Name:", nameField = new JTextField());
        addLabelAndTextField("Username:", usernameField = new JTextField());
        addLabelAndTextField("Password:", passwordField = new JPasswordField());
        addLabelAndTextField("Confirm Password:", confirmPasswordField = new JPasswordField());
        addLabelAndTextField("Email:", emailField = new JTextField());
        addLabelAndTextField("Phone:", phoneField = new JTextField());
        addLabelAndTextField("Address:", addressField = new JTextField());

        submitButton = addButton("Submit");
        resetButton = addButton("Reset");
        closeButton = addButton("Close");

        // Set up action listeners
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        closeButton.addActionListener(this);
    }

    private void addLabelAndTextField(String labelText, JTextField textField) {
        add(new JLabel(labelText));
        add(textField);
    }

    private JButton addButton(String label) {
        JButton button = new JButton(label);
        add(button);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("Registration details submitted!");
        } else if (e.getSource() == resetButton) {
            resetFields();
        } else if (e.getSource() == closeButton) {
            System.exit(0);
        }
    }

    private void resetFields() {
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        emailField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationForm registrationForm = new RegistrationForm();
            registrationForm.setVisible(true);
        });
    }
}
