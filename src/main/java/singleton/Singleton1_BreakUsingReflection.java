package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using serialization we can break simple singleton logic
 */

public class Singleton1_BreakUsingReflection {

	public static void printme(String name, Singleton3 obj){
		System.out.println(name +", "+ obj.hashCode());
	}
	
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Singleton3 obj1 = Singleton3.getInstance();
		printme("obj1", obj1);    // 	obj1, 2018699554
		
		//Breaking singleton code using serialization:
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/abc.txt"));
		oos.writeObject(obj1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/abc.txt"));
		Singleton3 obj3 = (Singleton3) ois.readObject();
		
		printme("obj3", obj3);   //     obj3, 1028566121
		System.out.println(obj1.equals(obj3));   // false
		
	}

}
