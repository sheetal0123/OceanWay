package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Using serialization also we can break simple singleton logic	
 * serialization is simply writing objects on any kind of stream and then de-serialize i.e. read object from them
 */

public class Singleton3 implements Serializable {
	
	//create a static class level instance
	private static Singleton3 instance = null;
	
	//private const make sure no one can create other obj using new keyword
	private Singleton3(){
		
	}
	
	//public method ensure anyone can access it, uses lazy loading concept
	public static Singleton3 getInstance(){
		
		if(instance == null){
			instance = new Singleton3();
		}
		
		return instance;
	}

}



class TestClass3{

	public static void printme(String name, Singleton3 obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		//Singleton obj1 = new Singleton();  - compiler error as constr is private and cannot be used from outside class
		Singleton3 obj1 = Singleton3.getInstance();
		Singleton3 obj2 = Singleton3.getInstance();
		
		printme("obj1", obj1);    // 	obj1, 2018699554
		printme("obj2", obj2);    // 	obj2, 2018699554
		
		System.out.println(obj1.equals(obj2));   // true
		
		
		//Breaking singleton code using serialization:
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/abc.txt"));
		oos.writeObject(obj1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/abc.txt"));
		Singleton3 obj3 = (Singleton3) ois.readObject();
		
		printme("obj3", obj3);   //     obj3, 1028566121
		System.out.println(obj1.equals(obj3));   // false
		
	}

	/**
	 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using serialization we can break simple singleton logic
	 */
	
	
}