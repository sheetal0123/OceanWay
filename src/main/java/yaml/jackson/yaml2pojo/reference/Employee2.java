package yaml.jackson.yaml2pojo.reference;

import java.util.List;

public class Employee2 {
	String name;
	String age;
	List<String> hobbies;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
	@Override
	public String toString() {
		return "Emp2 [name=" + name + ", age=" + age + ", hobbies=" + hobbies + "]";
	}
}
