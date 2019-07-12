package json.gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

//Json to String using JsonElement
public class JSONToJavaObject2 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		Reader reader = null;
		
		try {
			reader = new FileReader(".\\src\\main\\java\\json\\gson\\input_director.json");
		}catch (IOException e) {
            e.printStackTrace();
        }
		
		JsonElement je = gson.fromJson(reader, JsonElement.class);
		String str = gson.toJson(je);
		System.out.println(str);
	}

}
