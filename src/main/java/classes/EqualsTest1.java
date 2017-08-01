package classes;

/*
 * equals used to compare two objects content
 * incompatible type can be compared, will get false, but no compile time error
 * only objects can be compared i.e. primitive cannot be compared, will get compile time error
 * null object cannot be compared, will get null pointer exception
 */


class NewDuck {
	int weight;
	NewDuck(int w) {
		weight = w;
	}
}


public class EqualsTest1 {

	
	public void primitive() {
		int a = 10;
		int b = 10;

//		if (a.equals(b)) 
//			System.out.println("TRUE"); 
//		else
//			 System.out.println("FALSE");
	}

	
	/**
	 * null can be compared but will get runtime exception
	 */
	public void nulls() {
		String obj1 = null;
		String obj2 = null;

		if (obj1.equals(obj2)) // Runtime Exception: NullPointerException
			System.out.println("TRUE");
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
	
	
	/**
	 * In normal case == and equals showing same behavior
	 */
	public void normalObjectTest() {
		NewDuck d1 = new NewDuck(50);
		NewDuck d2 = d1;
		NewDuck d3 = new NewDuck(50);

		if (d1.equals(d2))
			System.out.println("Duck are same"); // Duck are same
		else
			System.out.println("Duck are diff"); 
		
		
		if (d1.equals(d3))
			System.out.println("Duck are same");
		else
			System.out.println("Duck are diff"); // Duck are diff
	}
	
	
	/**
	 * In case of String object equals works better than ==
	 * here it will check content of object i.e. xyz
	 * Remember both are created in different memory location still o/p will be true
	 */
	public void stringObjectTest() {
		String obj1 = new String("xyz");
		String obj2 = "xyz";

		if (obj1.equals(obj2))
			System.out.println("TRUE"); // TRUE
		else
			System.out.println("FALSE");
	}





	public static void main(String[] args) {
		EqualsTest1 obj = new EqualsTest1();
		//obj.primitive();
		// obj.nulls();
		//obj.incompatibleType();

		//obj.normalObjectTest();
		obj.stringObjectTest();

	}
}
