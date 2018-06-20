package yaml.snake;

import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

public class Xyz {
	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();

		InputStream in = Xyz.class.getResourceAsStream("C:\\Users\\e075583\\Documents\\myworkspace\\OceanWay\\src\\main\\java\\yaml\\snake\\abc.yaml");
		Object obj = yaml.load(in);
		in.close();
		
		System.out.println("Loaded object type:" + obj.getClass());
		String strYAML = obj.toString();

		System.out.println(strYAML);

		//further value can be fetched from String
		String[] arr = strYAML.split(",");
		System.out.println(arr[1]);
	}
}
