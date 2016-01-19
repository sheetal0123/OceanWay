package classes;

/*
 IS-A : Inheritance, used for code reuse
 Expressed using keyword extends
 
 HAS-A : Aggregation/Composition, used for code reuse
 */

class Fruits {
	public void parentMethod() {
		System.out.println("I am parent method");
	}
}

class Mango extends Fruits {

	public void parentMethod() {
		System.out.println("override: child parent method");
	}

	public void childMethod() {
		System.out.println("I am child method");
	}
}

public class _ISA {

	public static void main(String[] args) {
		Fruits parent = new Fruits();
		parent.parentMethod();// parent method as parent cant see child's method
		// parent.child(); compiler error - parent cannot see child methods
		
		Mango child = new Mango();

		// parent method called as only single method exist
		// if override then child method will be called
		child.parentMethod();
		child.childMethod();
		
		Fruits obj = new Mango(); // Parent Reference but Child Object
		// parent method called
		// if override then child method will be called, preference always to
		// Child as this is more specific
		obj.parentMethod();
		// obj.child(); compiler error - Parent reference can only see parent methods - IMP!

		// Mango m=new Fruits(); compiler error - parent object cannot fit into child

	}
}
