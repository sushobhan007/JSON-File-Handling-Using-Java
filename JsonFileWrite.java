package com.company;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWrite {
    public static void main(String[] args) throws JSONException, IOException {
        JSONObject root = new JSONObject();
        JSONObject javaGrade = new JSONObject();
        JSONObject dsGrade = new JSONObject();
        JSONArray result = new JSONArray();

        root.put("Name","John Doe");
        root.put("Occupation","Student");
        javaGrade.put("Subject","Java");
        javaGrade.put("Grade","A+");
        result.put(javaGrade);
        dsGrade.put("Subject","Data Structures");
        dsGrade.put("Grade","A");
        result.put(dsGrade);
        root.put("Result",result);

        FileWriter fileWriter = new FileWriter("my_data1.json");
        fileWriter.write(root.toString());
        fileWriter.flush();
        fileWriter.close();
    }
}
