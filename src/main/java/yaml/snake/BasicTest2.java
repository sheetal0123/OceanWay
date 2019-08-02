package yaml.snake;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

/*
 * No POJO required
 */
public class BasicTest2 {

	public void readYamlIntoMap() {
		
		String dataFile = "\\src\\main\\java\\yaml\\snake\\set1.yaml";
		String strFile = System.getProperty("user.dir") + dataFile;
		System.out.println(strFile);
		
		Yaml yaml = new Yaml();
		InputStream inputStream = this.getClass()
		  .getClassLoader()
		  .getResourceAsStream("customer.yaml");
		Map<String, Object> obj = yaml.load(inputStream);
		System.out.println(obj);
				
	}
	
	
	public static void main(String[] args) throws IOException {

		BasicTest2 obj = new BasicTest2();
		obj.readYamlIntoMap();
		
		
//		try (InputStream in = ) {
//		//try (InputStream in = BasicTest2.class.getResourceAsStream(strFile)) {
//			Iterable<Object> itr = yaml.loadAll(in);
//			System.out.println(itr.toString());
//			for (Object o : itr) {
//				System.out.println("Class Type: " + o.getClass());
//				System.out.println(o);
//			}
//			in.close();
//		}

	}
}
