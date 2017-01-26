package classes.interfaces;


/**
 * Object can be cloned using Clonable interface
 * Cloned object doen't change value if original object get change
 *
 */
public class ObjectCloning implements Cloneable {

	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (ObjectCloning) super.clone();
	}

	public static void main(String[] args) {
		ObjectCloning obj1 = new ObjectCloning();
		try {
			
			obj1.setDname("Dog Here");
			ObjectCloning obj2 = (ObjectCloning) obj1.clone();  // Cloning obj1 into obj2
			
			
			// Displaying both the objects content
			System.out.println(obj1.getDname()); 	// Dog Here
			System.out.println(obj2.getDname());	// Dog Here
			

			// updating obj1 value
			obj1.setDname("New Dog Come");

			
			// cloned obj value will not changed because of orig obj value change
			System.out.println(obj1.getDname());	//New Dog Come
			System.out.println(obj2.getDname());	// Dog Here
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

