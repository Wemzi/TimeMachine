import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LovePanel extends JPanel {

    BufferedImage bg;
    LovePanel() throws IOException
    {
        bg = ImageIO.read(new File("artifacts\\bg.png"));
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paint(g);
        g.drawImage(bg,0,0,null);
    }
}
