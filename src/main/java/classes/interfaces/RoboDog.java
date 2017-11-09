package classes.interfaces;

// I am a pet, free to implement me if anyone is a pet - machine, birds, animal, fish and even a alien
interface Pet {
	// some methods
}

abstract class Robot {
	// some methods
}

public class RoboDog extends Robot implements Pet {

	@Override
	public String toString() {
		return "I AM A : " + this.getClass();
	}

	
	public static void main(String[] args) {
		// code
	}

}
