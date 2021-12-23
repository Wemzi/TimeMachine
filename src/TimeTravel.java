import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TimeTravel {
    public ArrayList<LoveMemory> memories = new ArrayList<>();
    TimeTravel() throws Exception
    {
        File emlekekMappa = new File("artifacts\\images");
        File[] emlekek = emlekekMappa.listFiles();
        String jsondata = new String(Files.readAllBytes(Paths.get("artifacts\\memories.json")), StandardCharsets.UTF_8);
        System.out.println(jsondata);

        //JSONObject dataParsed = new JSONObject(jsondata);
        //JSONArray memories = dataParsed.getJSONObjects("memories");
        //System.out.println(dataParsed.toString());
        Gson gson = new Gson();
        LoveMemory[] memories = gson.fromJson(jsondata,LoveMemory[].class);
        int idx = 0;
        for(LoveMemory memory : memories)
        {
            String dateString = memory.filename.split(".jpg")[0];
            memory.filename = "artifacts\\images\\"+memory.filename;

            this.memories.add(new LoveMemory(new File(memory.filename),memory.caption,dateString));

        }
    }



}
