package yaml.snake;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.yaml.snakeyaml.Yaml;
/**
 * 
https://bitbucket.org/asomov/snakeyaml/wiki/Documentation#markdown-header-installation
https://confluence.atlassian.com/get-started-with-bitbucket/git-and-mercurial-commands-860009656.html
 *
 */
public class Yaml1 {
	
	//Yaml Str to Map  yaml.load(String)
	public void testLoadFromString() {
	    Yaml yaml = new Yaml();
	    String document = "hello: 25";
	    Map<String, Integer> map = yaml.load(document);
	    Assert.assertEquals("{hello=25}", map.toString());
	    Assert.assertEquals(new Integer(25), map.get("hello"));
	    
	    int i = map.get("hello");
	    System.out.println(i);
	    System.out.println("pass");
	}
	
	
	// Multiple str line to Map
	public void test2() {
		Yaml yaml = new Yaml();
		String s = 	  "name: Joe\n" 
					+ "phone: 111-111-1111\n"
					+ "address: Park Dr, Charlie Hill";
		Object obj = yaml.load(s);
		System.out.println("Loaded object type: " + obj.getClass());
		System.out.println(obj);

		
		//now complete string is into map
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) obj;

		System.out.println(map.get("phone"));
	}
	
	
	public void test3() throws IOException{
		Yaml yaml = new Yaml();
	      try (InputStream in = Yaml1.class.getResourceAsStream("/person.yml")) {
	          Object obj = yaml.load(in);
	          System.out.println("Loaded object type:" + obj.getClass());
	          System.out.println(obj);
	      }
	}
	
	
	
	public void test4() throws FileNotFoundException{
		Yaml yaml = new Yaml();
		
		System.out.println(yaml.dump(yaml.load(new FileInputStream(new File(
				"./src/test/resources/person.yaml")))));

//		Map<String, Map<String, String>> values = (Map<String, Map<String, String>>) yaml
//				.load(new FileInputStream(new File("./src/test/resources/person.yaml")));
//
//		for (String key : values.keySet()) {
//			Map<String, String> subValues = values.get(key);
//			System.out.println(key);
//
//			for (String subValueKey : subValues.keySet()) {
//				System.out.println(String.format("\t%s = %s",
//						subValueKey, subValues.get(subValueKey)));
//			}
//		}
		
		
		Map<String, String> map = (Map<String, String>) yaml.load(new FileInputStream(new File("./src/test/resources/person.yaml")));
		System.out.println(map.get("name"));
		System.out.println(map.get("phone"));
		System.out.println(map.get("address"));
	}
	
	public  static void main(String [] args) throws IOException{
		Yaml1 obj = new Yaml1();
//		obj.testLoadFromString();
//		obj.test2();
		//obj.test3();
		obj.test4();
	}

}
