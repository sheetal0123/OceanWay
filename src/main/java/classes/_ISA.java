package classes;

/*
 IS-A : Inheritance, used for code reuse
 Expressed using keyword “extends”.
 
 HAS-A : Aggregation, used for code reuse
 */

class Fruits {

	int p1=10;
	final int p2=20;
	
	public void par() {
		System.out.println("parent method");
	}
	
	public static void parStatic(){
		System.out.println("parent static method");
	}
}

class Mango extends Fruits {

	public void chi() {
		System.out.println("child method");
	}
}

public class _ISA {

	public static void main(String[] args) {
		Fruits p = new Fruits();
		p.par();
		// p.chi(); compiler error - parent cannot see child methods
		

		Mango c = new Mango();
		c.par(); // parent methods is visible because Mango IS-A Fruit
		c.chi();
		

		Fruits f = new Mango();
		f.par();
		// f.chi(); compiler error - Parent reference can only see parent
		// methods - IMP!

		// Mango m=new Fruits(); compiler error - parent object cannot fit into
		// child

	}
}
