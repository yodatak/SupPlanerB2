import javax.swing.*;
import java.awt.*;

/**
 * Created by sabil on 13/05/14.
 */
public class Register extends JFrame {
    private JFormattedTextField formattedTextField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JRadioButton employeeRadioButton;
    private JRadioButton managerRadioButton;
    private JButton validateButton;
    public JPanel Register;

    public Register() throws HeadlessException {
        super("Register");
        setContentPane(Register);
    }
}
