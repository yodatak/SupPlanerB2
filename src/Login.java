import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintStream;

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
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
                capture_this.setVisible(false);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SocketClient sck = new SocketClient();
                    PrintStream out = sck.out();
                    out.println("CONNECT");
                    out.println(myemailGmailComFormattedTextField.getText());
                    if(sck.request(new String(passwordPasswordField.getPassword())).equals("ACCEPTED")){
                        JFrame frame = new DashboardAll();
                        frame.setLocationRelativeTo(null);
                        frame.pack();
                        frame.setVisible(true);
                        capture_this.setVisible(false);
                    }

                    JFrame frame = new DashboardAll();
                    frame.pack();
                    frame.setVisible(true);
                    capture_this.setVisible(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Login();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
