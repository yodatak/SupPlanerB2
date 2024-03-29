import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

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
                JFrame frame = new Register(capture_this);
                frame.setLocationRelativeTo(null);//ici on centre la fenetre
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
                    if(sck.request(encryptPassword(new String(passwordPasswordField.getPassword()))).equals("ACCEPTED")){ //On encrypt le pass en SHA1
                        JFrame frame = new DashboardAll(capture_this);
                        frame.setLocationRelativeTo(null);//ici on centre la fenetre
                        frame.pack();
                        frame.setVisible(true);
                        capture_this.setVisible(false);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public static String encryptPassword(String password) //Notre fonction Pour encrypter le mot de passe en sha1
    {
        String sha1 = "";
        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));//Un peux d'unicode ^^
            sha1 = byteToHex(crypt.digest());
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return sha1; //on retourne la string en SHA1
    }

    private static String byteToHex(final byte[] hash) //fonction qui convertie notre string en Hexa pour le pass SHA1
    {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
