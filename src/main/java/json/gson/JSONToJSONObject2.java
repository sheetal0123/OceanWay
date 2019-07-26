package json.gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;

public class JSONToJSONObject2 {

	public static JsonObject getJsonAsJsonElement(Gson gson) {

		Reader reader = null;

		try {
			reader = new FileReader(".\\src\\main\\java\\json\\gson\\array.json");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Json Element
		JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);

		// Json String
		String jsonString = gson.toJson(jsonElement);
		System.out.println(jsonString);

		// Json Object
		JsonObject jsonObject = jsonElement.getAsJsonObject();

		return jsonObject;
	}

	
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		JsonObject jsonObject = getJsonAsJsonElement(gson);

		JsonArray jsonArray = jsonObject.getAsJsonArray("Data");

//		@SuppressWarnings("unchecked")
//		List<String> list = gson.fromJson(arraySkills, ArrayList.class);
//		System.out.println(list);
//		System.out.println(list.size());
//		

		
		
		
	}

}
