package apis.json;

import java.util.List;

public class User {

	
	String firstName;
	String lastName;
	Boolean isAlive;
	Integer age;
	
	UserAddress address;
	List<UserPhoneNumbers> phoneNumbers;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Boolean getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public UserAddress getAddress() {
		return address;
	}
	public void setAddress(UserAddress address) {
		this.address = address;
	}
	public List<UserPhoneNumbers> getphoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNo(List<UserPhoneNumbers> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	
	
	
	
}
