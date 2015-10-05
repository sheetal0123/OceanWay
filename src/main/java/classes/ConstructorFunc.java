package classes;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	Child() {
		//super();   -> added implicitly by compiler
		System.out.println("Child constructor");
	}
}

public class ConstructorFunc extends Child {

	public ConstructorFunc() {
		//super();   -> added implicitly by compiler
		System.out.println("Grand Child constructor");
	}

	public static void main(String[] args) {
		new ConstructorFunc();
	}
}


/*
Parent constructor
Child constructor
Grand Child constructor
*/