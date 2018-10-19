package advjava.copy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Deep clone:
 * - One way is to use serialization 
 *
 */
class Student implements Serializable{
	
	int rollno;
	String name;
	int age;
	
	Student(int r, String n, int a){
		this.rollno = r;
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
}




public class DeepCopyExample2 {

	
	/**
	 * Makes a deep copy of any Java object that is passed.
	 */
	 private static Object deepCopy(Object object) {
	   try {
	     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	     ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
	     outputStrm.writeObject(object);
	     ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
	     ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
	     return objInputStream.readObject();
	   }
	   catch (Exception e) {
	     e.printStackTrace();
	     return null;
	   }
	 }
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "John", 10);
		System.out.println("First Original Copy: "+ s1);
		
		Student s2 = (Student)deepCopy(s1);
		System.out.println("Second Original Copy: "+ s2);
		s2.rollno = 2;
		s2.name = "Dan";
		System.out.println("Second Updated Copy: "+ s2);
		
		System.out.println("First Copy Status: "+ s1);
	}

}
