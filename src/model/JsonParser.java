package model;

import com.google.gson.*;
import java.util.LinkedList;
import java.io.*;

public class JsonParser {
	
	private Gson gson;
	
	public JsonParser() {
		this.gson = new Gson();
	}
	
	public LinkedList parseFile(String fileName, Class theClass) {
		LinkedList object = null;
		String nextLine = "";
		String jsonFile;
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((nextLine = reader.readLine()) != null) {
				sb.append(nextLine);
			}
			jsonFile = sb.toString();
			if (jsonFile.indexOf("{") == 0) {
				jsonFile = jsonFile.substring(1, jsonFile.length()-1);
			}
			object = (LinkedList)gson.fromJson(jsonFile, theClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
}