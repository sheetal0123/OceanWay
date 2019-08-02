package yaml.snake.dumpobjinyaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.yaml.snakeyaml.Yaml;

public class TestPerson {

	public static List<Person> createData(){
		List<Person> ls = new ArrayList<>();
		
		Person p = new Person();
		Education e = new Education();
		PlayGroup pg = new PlayGroup();

		pg.setPgName("Euro Kids");
		pg.setPgStudentCount(20);
		pg.setPgEstYear("2015");
		pg.setFullyGovtFunded(false);
		
		e.setMonitor(false);
		e.setPlaygroup(pg);
		
		p.setPersonName("prithvi");
		p.setPersonAge(3);
		p.setGender(Gender.MALE);
		p.setEducation(e);
		
		ls.add(p);
		
		
		return ls;
	}
	
	
	public static void dumpData(List<Person> ls){
		Yaml yaml = new Yaml();
		try {
			String dataFile = "\\src\\main\\java\\yaml\\snake\\dumpobjinyaml\\person.yaml";
			String strFile = System.getProperty("user.dir") + dataFile;
			yaml.dump(ls, new FileWriter(new File(strFile)));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done: Data has been dumped into person.yaml");
	}
	
	
	public static void main(String[] args) {
		List<Person> ls = TestPerson.createData();
		TestPerson.dumpData(ls);
		
		
	
	}
}
