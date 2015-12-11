package common.parsers;


import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.testng.annotations.Test;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

import java.util.List;

/**
 * Created by matcievskiy on 03.04.2015.
 */
public class JsonParserPage {

    public static List<PageForJson> pagesFromJson(String json) throws IOException {

        Type listType = new TypeToken<ArrayList<PageForJson>>() {
        }.getType();
        FileInputStream in = new FileInputStream(json);
        List<PageForJson> yourClassList = new Gson().fromJson(new InputStreamReader(in), listType);
        in.close();
        return yourClassList;
    }


}

 




