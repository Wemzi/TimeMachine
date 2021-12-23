import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
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
    private JLabel imageLabel;
    private SimpleDateFormat displayFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Szerelem() {
        setContentPane(lovePanel);
        setTitle("TimeMachine");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(1600, 900);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        TimeTravel idout = new TimeTravel();
        Szerelem loveunk = new Szerelem();
        loveunk.labelWelcome.setText(loveunk.labelWelcome.getText() + loveunk.displayFormat.format(idout.revertedTime));
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        lovePanel = new JPanel();
        lovePanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 2, new Insets(0, 0, 0, 0), -1, -1));
        labelRights = new JLabel();
        labelRights.setHorizontalAlignment(0);
        labelRights.setText("All rights reserved. Made by David Lukacs in 2021.");
        labelRights.setVerticalAlignment(3);
        labelRights.setVerticalTextPosition(0);
        lovePanel.add(labelRights, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ourMemoriesFromNowButton = new JButton();
        ourMemoriesFromNowButton.setText("Our memories from now");
        lovePanel.add(ourMemoriesFromNowButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, 100), new Dimension(200, 150), new Dimension(200, 150), 0, false));
        memoriesFromTheBeginningButton = new JButton();
        memoriesFromTheBeginningButton.setHideActionText(false);
        memoriesFromTheBeginningButton.setText("Memories from the beginning");
        lovePanel.add(memoriesFromTheBeginningButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, 100), new Dimension(200, 150), new Dimension(200, 150), 0, false));
        whatHappenedYearsAgoButton = new JButton();
        whatHappenedYearsAgoButton.setText("What happened...years ago?");
        whatHappenedYearsAgoButton.putClientProperty("hideActionText", Boolean.FALSE);
        lovePanel.add(whatHappenedYearsAgoButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, 100), new Dimension(200, 150), new Dimension(200, 150), 0, false));
        labelWelcome = new JLabel();
        labelWelcome.setText("Dear Piros! This is the real TimeMachine. The Current Date is:");
        lovePanel.add(labelWelcome, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        imageLabel = new JLabel();
        imageLabel.setText("");
        lovePanel.add(imageLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelhowcanihelp = new JLabel();
        labelhowcanihelp.setText("How can I help you?");
        lovePanel.add(labelhowcanihelp, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return lovePanel;
    }

}
