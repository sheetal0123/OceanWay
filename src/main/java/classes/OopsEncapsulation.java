package classes;

/*
 * encapsulation: variable shd be private and method should be public
 */
public class OopsEncapsulation {
	private int age;
	private String name;
	private String empid;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return empid;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		empid = newId;
	}
}
