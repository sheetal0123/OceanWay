package classes.initialization;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	Child() {
		// super(); -> added implicitly by compiler
		System.out.println("Child default constructor");
	}
	
	//Param parent const never called 
	Child(int a){
		System.out.println("Child Param Const");
	}
}

public class Constructor1 extends Child {

	public Constructor1() {
		// super(); // -> added implicitly by compiler
		System.out.println("Grand Child Default constructor");
	}

	public Constructor1(int a) {
		// super(); // Imp: Parameterized const also called default super constructor rather parameterized super const
		System.out.println("Grand Child Param constructor");
	}

	public static void main(String[] args) {
		//new ConstructorFunc();
		new Constructor1(10);
	}
}


/*
Parent constructor
Child default constructor
Grand Child Default constructor

Parent constructor
Child default constructor
Grand Child Param constructor
*/