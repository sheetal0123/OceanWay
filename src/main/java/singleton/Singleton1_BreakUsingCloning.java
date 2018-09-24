package singleton;

/**
 * As we can see obj3 has different hashcode and hence cannot pass equals
 * test. So using cloning we can break simple singleton logic
 */

public class Singleton1_BreakUsingCloning {
	public static void printme(String name, SimpleSingleton obj) {
		System.out.println(name + ", " + obj.hashCode());
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SimpleSingleton obj1 = SimpleSingleton.getInstance();

		// Breaking singleton code using cloning:
		SimpleSingleton obj3 = (SimpleSingleton) obj1.clone();

		
		printme("obj3", obj3); // obj3, 1311053135
		System.out.println(obj1.equals(obj3)); // false

	}
}


//same logic as singleton1.java
class SimpleSingleton implements Cloneable {
	
	private static SimpleSingleton instance = null;
	
	private SimpleSingleton(){
		
	}
	
	public static SimpleSingleton getInstance(){
		if(instance == null){
			instance = new SimpleSingleton();
		}
		return instance;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
