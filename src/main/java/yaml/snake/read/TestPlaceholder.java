package yaml.snake.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.yaml.snakeyaml.Yaml;


public class TestPlaceholder {

	public static void main(String[] args) {
		String yamlPath = ".\\src\\main\\java\\yaml\\snake\\read\\child.yaml";
		
		Yaml yaml = new Yaml();
		Placeholder placeholder = null; 
		try {
			placeholder = yaml.loadAs(new FileReader(new File(yamlPath)), Placeholder.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(placeholder);

	}

}
