import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Szerelem extends JFrame {
    private JButton ourMemoriesFromNowButton;
    private JButton whatHappenedYearsAgoButton;
    private JButton memoriesFromTheBeginningButton;
    private JLabel labelRights;
    private JLabel labelWelcome;
    private JPanel lovePanel;
    private JLabel labelhowcanihelp;
    private JLabel BgLabel;
    private SimpleDateFormat displayFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Szerelem()
    {
        setContentPane(lovePanel);
        setTitle("TimeMachine");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //BgLabel = new JLabel(new ImageIcon(this.getClass().getResource("artifacts\\bg.jpg")));
        BgLabel.setSize(1920,1080);
        lovePanel.setOpaque(false);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        TimeTravel idout = new TimeTravel();
        Szerelem loveunk = new Szerelem();
        loveunk.labelWelcome.setText(loveunk.labelWelcome.getText() + loveunk.displayFormat.format(idout.revertedTime));
    }
}
