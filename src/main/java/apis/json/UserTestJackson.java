package apis.json;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserTestJackson {

	
	@Test
	public void testApiAttributes() throws JsonParseException, JsonMappingException, IOException{
		
		//both path are working
		String path = System.getProperty("user.dir") + "/src/main/java/apis/json/user.json";
		String path1 = "./src/main/java/apis/json/user.json";
		
		System.out.println(path);
		System.out.println(path1);  // ./src/main/java/apis/json/user.json
		
		ObjectMapper objmapper = new ObjectMapper();
		User user = objmapper.readValue(new File(path1), User.class);
		
		Assert.assertEquals(user.getAge().intValue(), 25,"User age is wrong");
		assert user.getphoneNumbers().size() == 3 : "User has more or less phone numbers";
		
	}
}
