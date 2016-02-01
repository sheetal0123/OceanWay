package classes;

/*
 * super is used to call parent constructor and other use it to access parent members 
 */
class ParentClass {
	int a, b, c;

	ParentClass() {
		a = 10;
		b = 20;
		c = 100;
	}
}

public class SuperFunc extends ParentClass {
	int c = 50;

	public void sum() {
		// super will always refer to parent member
		int sum = a + b + super.c;
		System.out.println("Sum is: " + sum); // Sum is: 130
	}

	public static void main(String[] args) {

		SuperFunc obj = new SuperFunc();
		obj.sum();
	}
}