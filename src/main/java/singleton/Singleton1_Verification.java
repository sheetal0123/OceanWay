package singleton;

public class Singleton1_Verification {

	public static void printme(String name, Singleton1 obj) {
		System.out.println(name + ": " + obj.hashCode());
	}

	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); - compiler error as constr is
		// private and cannot be used from outside class
		Singleton1 obj1 = Singleton1.getInstance();
		Singleton1 obj2 = Singleton1.getInstance();

		printme("obj1", obj1); // obj1: 2018699554
		printme("obj2", obj2); // obj2: 2018699554

		System.out.println(obj1.equals(obj2)); // true

	}

	/**
	 * As we can see both obj 1 and 2 have same hashcode and pass equals test
	 * means both obj are same i.e. singleton has been properly implemented wait
	 * a min.... see nxt eg
	 */

}