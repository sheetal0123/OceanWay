package classes;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	Child() {
		// super(); -> added implicitly by compiler
		System.out.println("Child constructor");
	}
}

public class ConstructorFunc extends Child {

	public ConstructorFunc() {
		// super(); // -> added implicitly by compiler
		System.out.println("Grand Child Default constructor");
	}

	public ConstructorFunc(int a) {
		// super(); // Imp: Parameterized const also called default super
		// constructor only rather parameterized super const
		System.out.println("Grand Child Param constructor");
	}

	public static void main(String[] args) {
		new ConstructorFunc();
		new ConstructorFunc(10);
	}
}


/*
Parent constructor
Child constructor
Grand Child Default constructor

Parent constructor
Child constructor
Grand Child Param constructor
*/