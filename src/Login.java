import javax.swing.*;

/**
 * Created by yodatak on 13/05/14.
 */
public class Login {
    private JButton registerButton;
    private JButton loginButton;
    private JFormattedTextField myemailGmailComFormattedTextField;
    private JPasswordField passwordPasswordField;
    private JPanel Login;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().Login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
