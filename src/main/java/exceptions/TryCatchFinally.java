package exceptions;

public class TryCatchFinally {

	public void method1() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("Handled Runtime Exception");
		} finally {
			System.out.println("method1 finally");
		}
	}

	public int method2() {
		try {
			// System.exit(0); in this case finally will not be executed
			return 10;
		} finally {
			System.out.println("method2 finally");
		}
	}

	public static void main(String[] args) {
		TryCatchFinally obj = new TryCatchFinally();
		obj.method1();
		obj.method2();
	}
}

/*
Handled Runtime Exception
method1 finally
method2 finally
*/