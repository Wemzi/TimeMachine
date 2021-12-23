import com.google.gson.Gson;
import sun.java2d.pipe.SpanShapeRenderer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TimeTravel {
    public ArrayList<LoveMemory> memories = new ArrayList<>();
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
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
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


            lastOpened = new SimpleDateFormat("yyyyMMdd").parse(new String(Files.readAllBytes(Paths.get("artifacts\\offset.txt")), StandardCharsets.UTF_8).split(";")[1]);
        }
        else
        {
            new File("artifacts\\offset.txt").createNewFile();
            FileWriter myWriter = new FileWriter("artifacts\\offset.txt");
            myWriter.write(";"+today);
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
}
