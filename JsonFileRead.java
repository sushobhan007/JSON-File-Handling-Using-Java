package com.company;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonFileRead {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("my_data1.json"));
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject);
        System.out.println("Name is: " + jsonObject.get("Name"));
        System.out.println("Occupation is: " + jsonObject.get("Occupation"));
        System.out.println("Result: " + jsonObject.get("Result"));
    }
}
