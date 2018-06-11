package yaml.snake;

import java.io.IOException;
import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

/*
 * No POJO required
 */
public class BasicTest2 {

	public static void main(String[] args) throws IOException {
		Yaml yaml = new Yaml();

		try (InputStream in = BasicTest2.class.getResourceAsStream("\\src\\main\\java\\yaml\\snake\\set1.yaml")) {
			Iterable<Object> itr = yaml.loadAll(in);
			System.out.println(itr.toString());
			for (Object o : itr) {
				System.out.println("Class Type: " + o.getClass());
				System.out.println(o);
			}

		}

	}
}
