package json.jackson.dynamicjson;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  refer: https://www.baeldung.com/jackson-mapping-dynamic-object
 */
public class TestProduct {

	private static void verifyDynamicJson1() throws IOException, JsonParseException, JsonMappingException {
		String jsonString = "{\r\n    \"name\": \"Nokia 300\",\r\n    \"category\": \"cellphone\",\r\n    \"details\": {\r\n        \"displayAspectRatio\": \"97:3\",\r\n        \"audioConnector\": \"none\"\r\n    }\r\n}";

		ObjectMapper objectMapper = new ObjectMapper();
		ProductJsonNode product = objectMapper.readValue(jsonString, ProductJsonNode.class);

		System.out.println(product.getName());
		System.out.println(product.getCategory());
		System.out.println(product.getDetails().get("audioConnector").asText());
		System.out.println(product.getDetails().get("displayAspectRatio").asText());
		System.out.println("-------------------------------");
	}

		
	
	private static void verifyDynamicJson2() throws IOException, JsonParseException, JsonMappingException {
		String jsonString = "{\r\n    \"name\": \"Bata 500\",\r\n    \"category\": \"shoes\",\r\n    \"details\": {\r\n        \"size\": \"9\",\r\n        \"color\": \"black\",\r\n        \"material\": \"rubber\"\r\n    }\r\n}";

		ObjectMapper objectMapper = new ObjectMapper();
		ProductJsonNode product = objectMapper.readValue(jsonString, ProductJsonNode.class);

		System.out.println(product.getName());
		System.out.println(product.getCategory());
		System.out.println(product.getDetails().get("size").asText());
		System.out.println(product.getDetails().get("color").asText());
		System.out.println(product.getDetails().get("material").asText());
		System.out.println("-------------------------------");
	}
	
	
	
	private static void verifyDynamicJson3() throws IOException, JsonParseException, JsonMappingException {
		String jsonString = "{\r\n    \"name\": \"Bata 500\",\r\n    \"category\": \"shoes\",\r\n    \"details\": {\r\n        \"size\": \"9\",\r\n        \"color\": \"black\",\r\n        \"material\": \"rubber\"\r\n    }\r\n}";

		ObjectMapper objectMapper = new ObjectMapper();
		ProductMap product = objectMapper.readValue(jsonString, ProductMap.class);

		System.out.println(product.getName());
		System.out.println(product.getCategory());
		System.out.println(product.getDetails().get("size"));
		System.out.println(product.getDetails().get("color"));
		System.out.println(product.getDetails().get("material"));
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		verifyDynamicJson1();
		verifyDynamicJson2();
		
		//using Map - not working
		//verifyDynamicJson3();
		
		

	}

}
