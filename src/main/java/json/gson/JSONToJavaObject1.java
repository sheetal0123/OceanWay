package json.gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

//Json to Java Object
public class JSONToJavaObject1 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		DirectorPojo dir = null;
		
		try (Reader reader = new FileReader(".\\src\\main\\java\\json\\gson\\input_director.json")) {
			dir = gson.fromJson(reader, DirectorPojo.class);
			
		}catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println(dir.toString());
	}
}
