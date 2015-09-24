package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
 * Not working
 */
class Demo {
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
		System.out.println(obj); // s:Dial, i:100
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
			System.out.println(obj2);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
