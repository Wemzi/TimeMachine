/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AreYouSureDialog extends JDialog {
    JLabel label1;
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    MemorySelector m;

    public AreYouSureDialog(MemorySelector m)
    {

        contentPane = new JPanel();
        label1 = new JLabel();
        label1.setText("Are you sure you want to go back? This means we'll hold our consciousness, so we would know what happened if we did it this way. This means ultimately that we go back to a time where we have made no bad decisions, but own the experience. Choose wisely. ;)");
        contentPane.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        panel1.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        buttonOK = new JButton();
        buttonOK.setText("Yes");
        panel2.add(buttonOK, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonCancel = new JButton();
        buttonCancel.setText("Yes");
        this.m = m;
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {
                try
                {
                    onOK();
                }
                catch(IOException a)
                {
                    a.printStackTrace();
                }

            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {
                try
                {
                    onOK();
                }
                catch(IOException a)
                {
                    a.printStackTrace();
                }
            }
        });

        setVisible(true);

    }

    public void onOK() throws IOException
    {
        m.idout.revertedTime = m.idout.memories.get(MemorySelector.idx).dateoflove;
        String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
        new File("artifacts\\offset.txt").createNewFile();
        FileWriter myWriter = new FileWriter("artifacts\\offset.txt");
        myWriter.write(dateformat.format(m.idout.revertedTime)+";"+today);
        System.out.println("writing data");
        myWriter.close();
    }


    final JDialog dialog = new JDialog(frame,
            "Click a button",
            true);
dialog.setContentPane(optionPane);
dialog.setDefaultCloseOperation(
    JDialog.DO_NOTHING_ON_CLOSE);
dialog.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            setLabel("Thwarted user attempt to close window.");
        }
    });
}*/
