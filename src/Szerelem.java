import javax.swing.*;
import java.io.File;
import java.sql.Time;
import java.util.Date;

public class Szerelem extends JFrame {
    private JButton ourMemoriesFromNowButton;
    private JButton whatHappenedYearsAgoButton;
    private JButton memoriesFromTheBeginningButton;
    private JLabel labelRights;
    private JLabel labelWelcome;
    private JPanel lovePanel;
    private JLabel labelhowcanihelp;

    public Szerelem()
    {
        setContentPane(lovePanel);
        setTitle("TimeMachine");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        File offset = new File("artifacts\\offset.txt");
        offset.
        new Szerelem();
    }
}
