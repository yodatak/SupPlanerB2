import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by yodatak on 13/05/14.
 */
public class Login extends JFrame{
    private JButton registerButton;
    private JButton loginButton;
    private JFormattedTextField myemailGmailComFormattedTextField;
    private JPasswordField passwordPasswordField;
    private JPanel Login;

    public Login() {
        super("Login");
        this.setContentPane(Login);

        final Login capture_this = this;

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new Register();
                frame.pack();
                frame.setVisible(true);
                capture_this.setVisible(false);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SocketClient sck = new SocketClient();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
