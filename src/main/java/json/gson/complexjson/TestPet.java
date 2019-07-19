package json.gson.complexjson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;


public class TestPet {

	
	public static PetsBase getJsonDataAsObj() {
		Gson gson = new Gson();
		PetsBase petsbase = null;
		
		try (Reader reader = new FileReader(".\\src\\main\\java\\json\\gson\\complexjson\\pet.json")) {
			petsbase = gson.fromJson(reader, PetsBase.class);
			
		}catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println(petsbase.toString());

		return petsbase;	
	}
	
	
	
	public static void fetchDetailsFromObj(PetsBase baseObj) {
		
		
		
	}
	
	public static void main(String[] args) {
		fetchDetailsFromObj(getJsonDataAsObj());
		
	}

}
