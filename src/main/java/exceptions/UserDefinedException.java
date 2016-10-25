package exceptions;

/**
 * Tp create a custom exception extends Exception class which further extends Throwable class
 */
class MyOwnException extends Exception {
	
	// constructor
	public MyOwnException() {
		System.out.println("I am a user defined exception");
	}
}

public class UserDefinedException {

	/**
	 * I am throwing a custom exception
	 */
	public void customException() throws MyOwnException {
		throw new MyOwnException(); // call constructor
	}

	public void apple() {

		try {
			customException();
		} catch (MyOwnException e) {
			//code
		}
		System.out.println("program recovered");

	}

	public static void main(String[] args) {
		UserDefinedException obj = new UserDefinedException();
		obj.apple();

	}
}

