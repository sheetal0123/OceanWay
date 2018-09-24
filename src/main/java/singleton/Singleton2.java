package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Using reflection we can break simple singleton logic	
 */

public class Singleton2 {
	
	//create a static class level instance using lazy loading concept
	//rather than initializing instance here, we can do in getInstance()
	private static Singleton2 instance = null;
	
	//private const make sure no one can create other obj using new keyword
	private Singleton2(){
		System.out.println("I am private constructor");
	}
	
	//public method ensure anyone can access it
	//initialize instance only when this method will get called
	public static Singleton2 getInstance(){
		
		if(instance == null){
			instance = new Singleton2();
		}
		
		return instance;
	}

}



class TestClass2{

	public static void printme(String name, Singleton2 obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton2 obj1 = Singleton2.getInstance();
		Singleton2 obj2 = Singleton2.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
		
		//Breaking singleton code using reflection:
		Class cls = Class.forName("advjava.Singleton2");
		Constructor<Singleton2> constr = cls.getDeclaredConstructor();	
		constr.setAccessible(true); // class constructor become accessible
		
		Singleton2 obj3 = constr.newInstance(); // new object created
		printme("obj3", obj3);   //     obj3, 1311053135
		
		System.out.println(obj1.equals(obj3));   // false
		
	}

	/**
	 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using reflection we can break simple singleton logic
	 */
	
	
}