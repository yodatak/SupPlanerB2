import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by yodatak on 13/05/14.
 */
public class DashboardAll extends JFrame {
    private JButton newProjectButton;
    private JButton logoutButton;
    private JTable table1;
    private JPanel Dash;

    public DashboardAll(final Login loginFrame){
        super("Dashboard For All Projects");
        setContentPane(Dash);

        final DashboardAll capture_this = this;

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginFrame.setVisible(true);
                capture_this.processWindowEvent(new WindowEvent(capture_this, WindowEvent.WINDOW_CLOSING));
            }
        });
        newProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new NewProject();
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
                //capture_this.setVisible(false);
            }
        });
    }

}
