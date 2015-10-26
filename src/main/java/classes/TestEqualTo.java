package classes;

/*
 * == compare two references(object or primitive) not object content
 * primitive can also be compared
 * incompatible type cannot be compared, will get compile time error
 * null can be compared
 */
public class TestEqualTo {

	public void objectReferences() {
		String obj1 = new String("xyz");
		String obj2 = obj1;
		String obj3 = new String("xyz");

		if (obj1 == obj2)
			System.out.println("obj1 == obj2"); // obj1 == obj2
		else
			System.out.println("obj1 != obj2");

		if (obj1 == obj3)
			System.out.println("obj1 == obj3");
		else
			System.out.println("obj1 != obj3"); // obj1 != obj3
	}

	public void primitiveReferences() {
		int a = 10;
		int b = a;

		if (a == b)
			System.out.println("a == b"); // a == b
		else
			System.out.println("a != b");
	}

	public void nulls() {
		Integer a = null;
		Integer b = null;

		if (a == b)
			System.out.println("a == b"); // a == b
		else
			System.out.println("a != b");
	}

	public void incompatibleType() {
		int a = 10;
		String b = "hi";

		// if (a == b) //compile time error
		// System.out.println("a == b"); // a == b
		// else
		// System.out.println("a != b");
	}

	public static void main(String[] args) {

		TestEqualTo obj = new TestEqualTo();
		// obj.objectReferences();
		// obj.primitiveReferences();
		obj.nulls();
		// obj.incompatibleType();

	}
}
