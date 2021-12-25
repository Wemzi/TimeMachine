import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Szerelem extends JFrame {
    private JButton whatHappenedYearsAgoButton;
    private JButton memoriesFromTheBeginningButton;
    private JLabel labelRights;
    private JLabel labelWelcome;
    private JPanel lovePanel;
    private JLabel labelhowcanihelp;
    private JButton ourMemoriesFromNowButton;
    public static TimeTravel idout;
    private SimpleDateFormat displayFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Szerelem() throws Exception {
        lovePanel = new PanelWithBackgroundImage(ImageIO.read(new File("artifacts\\bg.png")));
        lovePanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        labelRights = new JLabel();
        labelRights.setHorizontalAlignment(0);
        labelRights.setText("All rights reserved. Made by David Lukacs in 2021.");
        labelRights.setVerticalAlignment(3);
        labelRights.setVerticalTextPosition(0);
        lovePanel.add(labelRights, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelhowcanihelp = new JLabel();
        labelhowcanihelp.setText("How can I help you?");
        lovePanel.add(labelhowcanihelp, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        whatHappenedYearsAgoButton = new JButton();
        whatHappenedYearsAgoButton.setText("What happened...years ago?");
        whatHappenedYearsAgoButton.putClientProperty("hideActionText", Boolean.FALSE);
        lovePanel.add(whatHappenedYearsAgoButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, 100), new Dimension(200, 150), new Dimension(200, 150), 0, false));
        ourMemoriesFromNowButton = new JButton();
        ourMemoriesFromNowButton.setText("Our memories from now");
        lovePanel.add(ourMemoriesFromNowButton, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, 100), new Dimension(200, 150), new Dimension(200, 150), 0, false));
        memoriesFromTheBeginningButton = new JButton();
        memoriesFromTheBeginningButton.setHideActionText(false);
        memoriesFromTheBeginningButton.setText("Memories from the beginning");
        lovePanel.add(memoriesFromTheBeginningButton, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, 100), new Dimension(200, 150), new Dimension(200, 150), 0, false));
        labelWelcome = new JLabel();
        labelWelcome.setText("The Current Date is:");
        lovePanel.add(labelWelcome, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        setResizable(false);
        setTitle("TimeMachine");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(lovePanel);
        setContentPane(lovePanel);
        setSize(1280, 720);
        idout = new TimeTravel();
        ourMemoriesFromNowButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new MemorySelector(idout,idout.GetClosestMemory(idout.revertedTime).idx);
                labelWelcome.setText("The current date is: "+ displayFormat.format(idout.revertedTime));
            }

        });
        memoriesFromTheBeginningButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new MemorySelector(idout,0);
                labelWelcome.setText("The current date is: "+ displayFormat.format(idout.revertedTime));
            }

        });
        whatHappenedYearsAgoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String number = JOptionPane.showInputDialog("Enter number of years, you want to go back from current date");
                int num = Integer.parseInt(number);
                Date in = idout.revertedTime;
                Calendar c = Calendar.getInstance();
                c.setTime(in);
                c.add(Calendar.YEAR,-1 * num);
                Date out = c.getTime();
                System.out.println(new SimpleDateFormat("yyyyMMdd").format(out));
                new MemorySelector(idout,idout.GetClosestMemory(out).idx);
                labelWelcome.setText("The current date is: "+ displayFormat.format(idout.revertedTime));
            }

        });
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Szerelem loveunk = new Szerelem();
        loveunk.labelWelcome.setText(loveunk.labelWelcome.getText() + loveunk.displayFormat.format(idout.revertedTime));
    }
}
