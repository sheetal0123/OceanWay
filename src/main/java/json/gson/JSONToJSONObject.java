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

//Json to String using JsonElement
public class JSONToJSONObject {

	public static JsonObject getJsonAsJsonElement(Gson gson) {

		Reader reader = null;

		try {
			reader = new FileReader(".\\src\\main\\java\\json\\gson\\input_director.json");
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

		// Fetch Hardcoded element from JsonObject
		String id = jsonObject.get("ID").getAsString();
		String name = jsonObject.get("Name").getAsString();
		JsonArray arraySkills = jsonObject.getAsJsonArray("Skills");

		@SuppressWarnings("unchecked")
		List<String> list = gson.fromJson(arraySkills, ArrayList.class);

		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Skills: " + list);
	}

}
