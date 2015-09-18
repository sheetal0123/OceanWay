package classes;

/*
 * interface can either be public or default
 * interface methods has to be abstract
 * interface variables has to be static final and has to be initialized
 * interface reference object cannot call implementing class methods 
 */

interface Runnable {
	int TON = 100; // static + final
	void run(); // abstract
}

class InterfaceExamples1 implements Runnable {

	// implementing method has to be public
	public void run() {
		System.out.println("I am run: " + TON);
	}

	public void sports() {
		System.out.println("I am class sports:" + TON);
	}

	public static void main(String[] args) {
		InterfaceExamples1 obj = new InterfaceExamples1();
		Runnable objInterface = new InterfaceExamples1();

		objInterface.run(); // I am run: 100
		// objInterface.sports(); // compiler error
		obj.run(); // I am run: 100
	}
}
