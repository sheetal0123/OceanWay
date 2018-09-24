package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * As we can see obj3 has different hashcode and hence cannot pass equals test. So using reflection we can break simple singleton logic
 */

public class Singleton1_BreakUsingSerialization {

	public static void printme(String name, Singleton1 obj) {
		System.out.println(name + ": " + obj.hashCode());
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton1 obj1 = Singleton1.getInstance();
		printme("obj1", obj1);

		// Breaking singleton code using reflection:
		Class cls = Class.forName("advjava.Singleton1");
		Constructor<Singleton1> constr = cls.getDeclaredConstructor();
		constr.setAccessible(true); // class constructor become accessible

		Singleton1 obj3 = constr.newInstance(); // new object created
		printme("obj3", obj3); // obj3, 1311053135

		System.out.println(obj1.equals(obj3)); // false

	}

}
