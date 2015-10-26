package classes;

/*
 * equals used to compare two objects content
 * incompatible type can be compared will get false, but no compile time error
 * only objects can be compared i.e. primitive cannot be compared, will get compile time error
 * null object cannot be compared, will get null pointer exception
 */
public class TestEquals {

	public void objectContent() {
		String obj1 = new String("xyz");
		String obj2 = new String("xyz");

		if (obj1.equals(obj2))
			System.out.println("TRUE"); // TRUE
		else
			System.out.println("FALSE");
	}

	public void incompatibleType() {
		String obj1 = new String("xyz");
		Integer obj2 = new Integer(10);

		if (obj1.equals(obj2))
			System.out.println("TRUE");
		else
			System.out.println("FALSE"); // FALSE
	}

	public void primitive() {
		int a = 10;
		int b = 10;

		// if (a.equals(b))
		// System.out.println("TRUE");
		// else
		// System.out.println("FALSE");
	}

	public void nulls() {
		String obj1 = null;
		String obj2 = null;

		if (obj1.equals(obj2)) // NullPointerException
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

	public static void main(String[] args) {
		TestEquals obj = new TestEquals();
		obj.objectContent();
		obj.incompatibleType();
//		obj.primitive();
//		obj.nulls();

	}
}
