import javax.swing.*;
import java.awt.*;

/**
 * Created by yodatak on 14/05/2014.
 */
public class NewProject extends JFrame{
    private JPanel NewProject;
    private JTextField textField1;
    private JButton GOButton;

    public NewProject() throws HeadlessException {
        super("NewProject"); //Le titre de la fenetre
        setContentPane(NewProject);
    }
}
