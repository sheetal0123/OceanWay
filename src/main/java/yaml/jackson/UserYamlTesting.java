package yaml.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserYamlTesting {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		
		try {
			File file = new File(".\\src\\main\\java\\yaml\\jackson\\userjack.yaml");
			User user = objectMapper.readValue(file, User.class));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
