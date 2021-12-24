import com.google.gson.Gson;
import sun.java2d.pipe.SpanShapeRenderer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeTravel {
    public ArrayList<LoveMemory> memories = new ArrayList<>();
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
    public String today;
    Date revertedTime;
    Date lastOpened;
    String jsondata;
    TimeTravel() throws Exception
    {
        File emlekekMappa = new File("artifacts\\images");
        File[] emlekek = emlekekMappa.listFiles();
        jsondata= new String(Files.readAllBytes(Paths.get("artifacts\\memories.json")), StandardCharsets.UTF_8);
        today = new SimpleDateFormat("yyyyMMdd").format(new Date());
        if(new File("artifacts\\offset.txt").isFile())
        {
            String[] split = new String(Files.readAllBytes(Paths.get("artifacts\\offset.txt")), StandardCharsets.UTF_8).split(";");
            System.out.println(split[0] + "  " + split[1]);
            if(split.length ==2)
            {
                try{
                    revertedTime= dateformat.parse(split[0]);
                } catch(ParseException e)
                {
                    System.out.println("parse failed, probably no revert yet");
                }

                lastOpened = dateformat.parse(split[1]);
            }


            lastOpened = dateformat.parse(new String(Files.readAllBytes(Paths.get("artifacts\\offset.txt")), StandardCharsets.UTF_8).split(";")[1]);
            long diff = new Date().getTime() - lastOpened.getTime();
            TimeUnit time = TimeUnit.DAYS;
            Long i = time.convert(diff, TimeUnit.MILLISECONDS);
            int difference = i.intValue();
            if(difference>0)
            {
                Calendar c = Calendar.getInstance();
                c.setTime(revertedTime);
                c.add(Calendar.DATE,difference);
                revertedTime=c.getTime();
            }
            new File("artifacts\\offset.txt").createNewFile();
            FileWriter myWriter = new FileWriter("artifacts\\offset.txt");
            myWriter.write(dateformat.format(revertedTime)+";"+today);
            myWriter.close();
        }
        else
        {
            new File("artifacts\\offset.txt").createNewFile();
            FileWriter myWriter = new FileWriter("artifacts\\offset.txt");
            myWriter.write(dateformat.format(revertedTime)+";"+today);
            myWriter.close();
        }
        Gson gson = new Gson();
        LoveMemory[] memoriesGson = gson.fromJson(jsondata,LoveMemory[].class);
        int idx = 0;
        for(LoveMemory memory : memoriesGson)
        {
            String dateString = memory.filename.split(".jpg")[0];
            memory.filename = "artifacts\\images\\"+memory.filename;
            this.memories.add(new LoveMemory(new File(memory.filename),memory.caption,dateString));
        }
    }

    LoveMemory GetClosestMemory(Date currentDate)
    {
        long minDiff = -1, currentTime = currentDate.getTime();
        LoveMemory minMem = null;
        for (LoveMemory mem : memories) {
            Date date = mem.dateoflove;
            long diff = Math.abs(currentTime - date.getTime());
            if ((minDiff == -1) || (diff < minDiff)) {
                minDiff = diff;
                 minMem = mem;
            }
        }
        return minMem;
    }
}
