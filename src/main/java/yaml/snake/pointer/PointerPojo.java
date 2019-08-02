package yaml.snake.pointer;


public class PointerPojo {

	
	private Employee1 employee1;
	private Employee1 employee2;
	public Employee1 getEmployee1() {
		return employee1;
	}
	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}
	public Employee1 getEmployee2() {
		return employee2;
	}
	public void setEmployee2(Employee1 employee2) {
		this.employee2 = employee2;
	}
	
	@Override
	public String toString() {
		return "PointerPojo [employee1=" + employee1 + ", employee2=" + employee2 + "]";
	}
	
	
}
