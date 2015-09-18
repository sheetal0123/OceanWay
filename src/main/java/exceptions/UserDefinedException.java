package exceptions;

class MyOwnException extends Exception {
	public MyOwnException() {
		System.out.println("I am a user defined exception");
	}
}

public class UserDefinedException {

	public void method1(int a) throws MyOwnException {
		if (a > 20) {
			throw new MyOwnException();
		}
		System.out.println("method 1 out");
	}

	public static void main(String[] args) {
		UserDefinedException obj = new UserDefinedException();
		try {
			obj.method1(10);
			obj.method1(100);
		} catch (MyOwnException e) {
			System.out.println("Exception handled");
		}

	}
}

/*
method 1 out
I am a user defined exception
Exception handled
*/