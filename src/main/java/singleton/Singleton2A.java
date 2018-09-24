package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Here we see how to block reflection from breaking our singleton code
 * simply put a check in constructor
 */

public class Singleton2A {
	
	private static Singleton2A instance = null;
	
	/**
	 * In private constr we check if instance already initialized and then if someone call this constructor then we throw exception
	 * Check in private constructor will block reflection, which made constructor public on runtime
	 */
	private Singleton2A(){
		if(instance != null){
			throw new RuntimeException("One instance already created cant create other");
		}		
		System.out.println("I am private constructor");
	}
	
	public static Singleton2A getInstance(){
		
		if(instance == null){
			instance = new Singleton2A();
		}
		
		return instance;
	}

}



class TestClass2A{

	public static void printme(String name, Singleton2A obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton2A obj1 = Singleton2A.getInstance();
		Singleton2A obj2 = Singleton2A.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
		
		//Breaking singleton code using reflection:
		Class cls = Class.forName("advjava.Singleton2");
		Constructor<Singleton2A> constr = cls.getDeclaredConstructor();	
		constr.setAccessible(true); // call constructor
		
		Singleton2A obj3 = constr.newInstance(); // new object created
		printme("obj3", obj3);   //     obj3, 1311053135
		
		System.out.println(obj1.equals(obj3));   // false
		
	}

	/**
	 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using reflection we can break simple singleton logic
	 */
	
	
}