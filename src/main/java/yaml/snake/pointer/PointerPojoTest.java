package yaml.snake.pointer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

import yaml.jackson.yaml2pojo.reference.BaseClass;

/**
 * For YAML, Snake lib is best
 */
public class PointerPojoTest {

	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();
		PointerPojo obj = yaml.loadAs(new FileReader(new File(".\\src\\main\\java\\yaml\\snake\\pointer\\pointer.yaml")), PointerPojo.class);
		System.out.println("Off Name:"+ obj.getEmployee1().getOfficialname());
		System.out.println(obj.toString());
	}
}
