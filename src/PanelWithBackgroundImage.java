import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

class PanelWithBackgroundImage extends JPanel {

    BufferedImage bg;

    PanelWithBackgroundImage(BufferedImage bg) {
        this.bg = bg;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}