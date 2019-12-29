package api_json.gson.json_to_obj;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

//Json to Java Object
public class DirectorTestClass {

	
	public static void main(String[] args) {
		Gson gson = new Gson();
		Director dir = null;
		String path = ".\\src\\main\\java\\api_json\\gson\\json_to_obj\\director.json";
		
		
		try (Reader reader = new FileReader(path)) {
			dir = gson.fromJson(reader, Director.class);
			
		}catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println(dir.toString());
		System.out.println("Director Name: "+dir.getName());
		
		
	}
}
