package yaml.jackson.yaml2pojo.reference;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;


public class TestBase {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		BaseClass base = null;
		try {
			File file = new File(".\\src\\main\\java\\yaml\\jackson\\yaml2pojo\\reference\\pointer.yaml");
			base = objectMapper.readValue(file, BaseClass.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(base.getEmployee1().getHobbies());
		System.out.println(base.getEmployee2().getHobbies());
		System.out.println(base.getEmployee1().getOfficialname()); // Not working
	}

}
