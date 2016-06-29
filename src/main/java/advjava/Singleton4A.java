package advjava;


/**
 * Using cloning also we can break simple singleton logic	
 */

public class Singleton4A implements Cloneable {
	
	private static Singleton4A instance = null;
	
	private Singleton4A(){
		
	}
	
	public static Singleton4A getInstance(){
		if(instance == null){
			instance = new Singleton4A();
		}
		return instance;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clonning not supported as this is a singleton class");
	}
}



class TestClass4A{

	public static void printme(String name, Singleton4A obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws CloneNotSupportedException {
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton4A obj1 = Singleton4A.getInstance();
		Singleton4A obj2 = Singleton4A.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
		
		//Breaking singleton code using cloning:
		Singleton4A obj3 = (Singleton4A) obj1.clone();
		
		printme("obj3", obj3);   //     obj3, 1311053135
		System.out.println(obj1.equals(obj3));   // false
		
	}

	/**
	 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using cloning we can break simple singleton logic
	 */
	
	
}