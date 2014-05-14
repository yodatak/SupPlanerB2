import dgantt.GanttChart;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yodatak on 13/05/14.
 */
public class ProjectDashboard extends JFrame{
    private JButton backButton;
    private JButton logoutButton;
    private JButton newTaskButton;
    private JButton inviteEmployeeButton;
    private GanttChart ganttChart1;
    public JPanel ProjectDashboard;

    public ProjectDashboard() throws HeadlessException {
        super("ProjectDashboard");
        setContentPane(ProjectDashboard);
    }

    private void createUIComponents() {

    }
}
