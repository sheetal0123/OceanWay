package classes;

public class InterfaceClonableEg implements Cloneable {

	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// Overriding clone() method of Object class
	public Object clone() throws CloneNotSupportedException {
		return (InterfaceClonableEg) super.clone();
	}

	public static void main(String[] args) {
		InterfaceClonableEg obj1 = new InterfaceClonableEg();
		try {
			obj1.setDname("Dog1");
			// Cloning obj1 into obj2
			InterfaceClonableEg obj2 = (InterfaceClonableEg) obj1.clone();

			// Displaying both the objects content
			System.out.println(obj1.getDname());
			System.out.println(obj2.getDname());

			// Setting up name in obj2
			obj1.setDname("Dog2");

			// Displaying both the objects content
			System.out.println(obj1.getDname());
			System.out.println(obj2.getDname());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}


//Dog1
//Dog1
//Dog2
//Dog1