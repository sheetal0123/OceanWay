package yaml.snake;

import java.io.IOException;
import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

/*
 * No POJO required
 */
public class BasicTest1 {

	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();

		InputStream in = BasicTest1.class.getResourceAsStream("/set1.yaml");
		Object obj = yaml.load(in);
		System.out.println("Loaded object type:" + obj.getClass());
		String strYAML = obj.toString();

		System.out.println(strYAML);

		//further value can be fetched from String
		String[] arr = strYAML.split(",");
		System.out.println(arr[1]);
	}
}
