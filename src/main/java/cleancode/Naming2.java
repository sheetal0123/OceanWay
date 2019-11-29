package cleancode;

public class Naming2 {

	int age;
	String firstName;
	String lastName;
	String address;
	public static final String EMP_COUNTRY = "INDIA";

	public Naming2(int age, String firstName, String lastName, String address) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Naming2 [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", EMP_COUNTRY=" + EMP_COUNTRY + "]";
	}
}
