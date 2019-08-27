package yaml.snake.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

public class TestWrite {

	public static Student createStudent() {
		Student student = new Student();
		student.setLearn("Learning Astronomy");
		student.setAge(20);
		student.setInnovation("Yes They Do");
		student.setSmile("Yes till they are student");
		student.setBestCreature(true);
		return student;
	}
	
	
	public static void main(String[] args) {

		Student student = createStudent();
		
		
		
		Yaml yaml = new Yaml();
		try {
			String dataFile = "\\src\\main\\java\\yaml\\snake\\write\\student.yaml";
			String strFile = System.getProperty("user.dir") + dataFile;
			yaml.dump(student, new FileWriter(new File(strFile)));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
