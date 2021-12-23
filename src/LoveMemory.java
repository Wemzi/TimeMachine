import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoveMemory {
    String lovepicsrc;
    String caption;
    String filename;
    String love_score;
    Date dateoflove;
    BufferedImage lovepic;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getLove_score() {
        return love_score;
    }

    public void setLove_score(String love_score) {
        this.love_score = love_score;
    }

    public String getLovepicsrc() {
        return lovepicsrc;
    }

    public void setLovepicsrc(String lovepicsrc) {
        this.lovepicsrc = lovepicsrc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String memorycaption) {
        this.caption = memorycaption;
    }

    public Date getDateoflove() {
        return dateoflove;
    }

    public void setDateoflove(Date dateoflove) {
        this.dateoflove = dateoflove;
    }

    public BufferedImage getLovepic() {
        return lovepic;
    }

    public void setLovepic(BufferedImage lovepic) {
        this.lovepic = lovepic;
    }

    LoveMemory(File image, String memoryCaption, String dateofLove) throws Exception
    {
        //szeretleeeeeeeeeeek shit
        lovepic = ImageIO.read(image);
        this.caption = memoryCaption;
        this.dateoflove=new SimpleDateFormat("yyyyMMdd").parse(dateofLove);
    }
}
