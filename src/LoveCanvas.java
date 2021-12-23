import java.awt.*;

public class LoveCanvas extends Canvas {
    Image i;
    LoveCanvas(Image i)
    {
        this.i=i;
    }

    public Image getI() {
        return i;
    }

    public void setI(Image i) {
        this.i = i;
    }

    @Override
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        g.drawImage(i,640,480,null);
    }
}
