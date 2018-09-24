package singleton;


/**
 * Using cloning also we can break simple singleton logic	
 */

public class Singleton4 implements Cloneable {
	
	private static Singleton4 instance = null;
	
	private Singleton4(){
		
	}
	
	public static Singleton4 getInstance(){
		if(instance == null){
			instance = new Singleton4();
		}
		return instance;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}



class TestClass4{

	public static void printme(String name, Singleton4 obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws CloneNotSupportedException {
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton4 obj1 = Singleton4.getInstance();
		Singleton4 obj2 = Singleton4.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
		
		//Breaking singleton code using cloning:
		Singleton4 obj3 = (Singleton4) obj1.clone();
		
		printme("obj3", obj3);   //     obj3, 1311053135
		System.out.println(obj1.equals(obj3));   // false
		
	}

	/**
	 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using cloning we can break simple singleton logic
	 */
	
	
}