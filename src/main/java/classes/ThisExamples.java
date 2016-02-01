package classes;

/*
 * 'this' keyword always represent the current object accessing it. 
 * if local variable is not same as instance variable then 'this' can be removed
 * static methods cannot use this as static method belong to class not objects/instances
 */
public class ThisExamples {
	int x, y; //instance variables

	public ThisExamples(int x, int y) {
		this.x = x;  // to differentiate between instance var and local variable 'this' is used
		this.y = y;
	}

	public int add() {
		return x + y;
	}

	public static void main(String[] args) {
		ThisExamples obj1 = new ThisExamples(10, 20);
		ThisExamples obj2 = new ThisExamples(100, 200);

		System.out.println("Sum is: " + obj1.add()); // Sum is: 30
		System.out.println("Sum is: " + obj2.add()); // Sum is: 300
	}
}

/*
o/p when 'this' is not used
Sum is: 0
Sum is: 0

*/