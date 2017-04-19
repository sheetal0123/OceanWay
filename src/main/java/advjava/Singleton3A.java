package advjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Using readResolve() we can handle serialization code which break singleton code
 */

public class Singleton3A implements Serializable {
	
	private static Singleton3A instance = null;
	
	private Singleton3A(){
		
	}
	
	public static Singleton3A getInstance(){
		if(instance == null){
			instance = new Singleton3A();
		}
		return instance;
	}
	
	/*
	 * readResolve can be used to change the data that is serialized through readObject method
	 * this method called after readObject() and we can change things here
	 * 
	 * When we read object back from serialization using readObject() method, then readResolve() get called and it replaces the 
	 * current read object with singleton instance we have, hence singleton pattern maintains
	 * 
	 * http://stackoverflow.com/questions/1168348/java-serialization-readobject-vs-readresolve
	 */
	private Object readResolve() throws ObjectStreamException{
		System.out.println("READ RESOLVE...");
		return instance;
	}
	
	
}



class TestClass3A{

	public static void printme(String name, Singleton3A obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton3A obj1 = Singleton3A.getInstance();
		Singleton3A obj2 = Singleton3A.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
		
		//Breaking singleton code using serialization:
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/abc.txt"));
		oos.writeObject(obj1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/abc.txt"));
		Singleton3A obj3 = (Singleton3A) ois.readObject();
		
		printme("obj3", obj3);   //     obj3, 2018699554
		System.out.println(obj1.equals(obj3));   // true
		
	}

	/**
	 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using serialization we can break simple singleton logic
	 */
	
	
}