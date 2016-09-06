package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/*
 * Serialization for primitive values of object
 * 
 * static var cannot be serialized
 * to stop a var from getting serialized add a keyword 'transient'
 * Serializable interface don't have any method, it is just to inform JVM that class objects can be serialized else run time exception will come
 * transient variable re initialize with default values ie. obj = null, int = 0 etc
 * in case of a object referencing another object and so on then whole object graph will be serialized
 * complete class is not sending along with serialization as it will impact performance of network, using RMI we get class information like path for .class file
 * 
 */
class Demo implements Serializable {
	String s;
	int i;

	Demo(String s, int i) {
		this.s = s;
		this.i = i;
	}

	public String toString() {
		return "s:" + s + ", i:" + i;
	}
}

public class Serialization {
	public static void main(String[] args) {
		Demo obj = new Demo("Dial", 100);
		System.out.println("Before Serialization: "+obj); // s:Dial, i:100
		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();

			// De-serialization
			Demo obj2;
			FileInputStream fis = new FileInputStream("serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (Demo) ois.readObject();
			System.out.println("De-serialization: "+obj2);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
