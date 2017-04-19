package advjava;

import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;

/**
 * This is the perfect single ton class
 * for thread hack see: https://www.youtube.com/watch?v=GH5_lhFShfU
 * using synchronized we can stop multiple thread to access getInstance() and hence block thread hack
 */

public class Singleton5 {
	
	//create a static class level instance, set to null
	private static Singleton5 instance = null;
	
	//private const make sure no one can create other obj using new keyword
	private Singleton5(){
		if(instance != null){   //this will stop reflection attack
			throw new RuntimeException("One instance already created cant create other");
		}		
		System.out.println("I am private constructor");
	}
	
	
	//add synchronized keyword here to stop multiple thread accessing it
	public static Singleton5 getInstance(){
		if(instance == null){
			instance = new Singleton5();
		}
		return instance;
	}

	//to handle serialization attack
	private Object readResolve() throws ObjectStreamException{
		System.out.println("READ RESOLVE...");
		return instance;
	}
	
	//to handle clone attack
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clonning not supported as this is a singleton class");
	}
}



class TestClass5{

	public static void printme(String name, Singleton5 obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton5 obj1 = Singleton5.getInstance();
		Singleton5 obj2 = Singleton5.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
	}

}