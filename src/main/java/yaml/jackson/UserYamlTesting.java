package yaml.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;


public class UserYamlTesting {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		User user = null;
		try {
			File file = new File(".\\src\\main\\java\\yaml\\jackson\\userjack.yaml");
			user = objectMapper.readValue(file, User.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(user.getAge());

	}

}
