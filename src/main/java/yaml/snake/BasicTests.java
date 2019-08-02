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
 * https://bitbucket.org/asomov/snakeyaml/wiki/Documentation#markdown-header-installation
 * https://confluence.atlassian.com/get-started-with-bitbucket/git-and-mercurial-commands-860009656.html
 *
 */
public class BasicTests {

	// Yaml Str to Map yaml.load(String)
	public void testLoadFromString() {
		Yaml yaml = new Yaml();
		String document = "hello: 25";
		Map<String, Integer> map = yaml.load(document);
		Assert.assertEquals(new Integer(25), map.get("hello"));
		System.out.println(map);
	}

	// Multiple str line to Map
	public void readAsMapFromString() {
		Yaml yaml = new Yaml();
		String s = "name: Joe\n" + "phone: 111-111-1111\n" + "address: Park Dr, Charlie Hill";
		Object obj = yaml.load(s);
		System.out.println("Loaded object type: " + obj.getClass());
		System.out.println(obj);

		// now complete string is into map
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) obj;

		System.out.println(map.get("phone"));
	}


	public void readAsMapFromYaml() throws FileNotFoundException {
		Yaml yaml = new Yaml();

		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) yaml
				.load(new FileInputStream(new File(".\\src\\main\\java\\yaml\\snake\\simple.yaml")));
		System.out.println(map.get("name"));
		System.out.println(map.get("phone"));
		System.out.println(map.get("address"));
	}

	public static void main(String[] args) throws IOException {
		BasicTests obj = new BasicTests();
		//obj.testLoadFromString();
		//obj.readAsMapFromString();
		obj.readAsMapFromYaml();
	}

}
