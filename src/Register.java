import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by sabil on 13/05/14.
 */
public class Register extends JFrame {
    private JFormattedTextField formattedTextField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton validateButton;
    public JPanel Register;
    private JCheckBox managerCheckBox;

    public Register() throws HeadlessException {
        super("Register");
        setContentPane(Register);

        final Register capture_this = this;

        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SocketClient sck = new SocketClient();
                    PrintStream out = sck.out();
                    out.println("REGISTER");
                    out.println(formattedTextField1.getText());
                    out.println(managerCheckBox.isSelected() ? "MANAGER" : "EMPLOYEE");
                    if(sck.request(Login.encryptPassword(new String(passwordField1.getPassword()))).equals("ACCEPTED")){
                        JFrame frame = new DashboardAll();
                        frame.setLocationRelativeTo(null);
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
}
