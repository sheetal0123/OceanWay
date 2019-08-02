package yaml.jackson.yaml2pojo.completeyaml;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class TestYamlMe {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		YamlMe ymlme = null;
		try {
			File file = new File(".\\src\\main\\java\\yaml\\jackson\\yaml2pojo\\completeyaml\\person.yaml");
			ymlme = objectMapper.readValue(file, YamlMe.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		System.out.println("\n");
		System.out.println(ymlme.getPerson().getHobbies());  // List<String>
		
		System.out.println("\n");
		System.out.println(ymlme.getPerson().getMovies());   // List<String>
		
		System.out.println("\n");
		System.out.println(ymlme.getPerson().getSignature()); // String

		System.out.println("\n");
		System.out.println(ymlme.getPerson().getSummary());  // String
		
		System.out.println("\n");
		System.out.println(ymlme.getPerson().getFavNum()); // int 

		System.out.println("\nAdd Properties of Person:     "+ymlme.getAdditionalProperties()+"\n");
		System.out.println(ymlme.getPerson().toString());		
		
		
		System.out.println("\n");
		System.out.println(ymlme.getPerson().getFriends());
		
		//Not working
//		System.out.println("\n");
//		System.out.println(ymlme.getPerson().getSchoolfriends());
	}
}
