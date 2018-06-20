package yaml.snake;

import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

public class ABC {
	public static void main(String[] args) throws IOException {
//		Yaml yaml = new Yaml();
//
//		InputStream in = ABC.class.getResourceAsStream("C:\\Users\\e075583\\Documents\\myworkspace\\OceanWay\\src\\main\\java\\yaml\\snake\\abc.yaml");
//		Object obj = yaml.load(in);
//		System.out.println("Loaded object type:" + obj.getClass());
//		String strYAML = obj.toString();
//
//		System.out.println(strYAML);
//
//		//further value can be fetched from String
//		String[] arr = strYAML.split(",");
//		System.out.println(arr[1]);
		
		
		User user = null;
        
        Yaml yaml = new Yaml();
        try(InputStream in = ClassLoader.getSystemResourceAsStream("set1.yml")) {
            user = yaml.loadAs(in, User.class);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
       
	}
}
