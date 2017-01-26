package exceptions;

/*
 * Unchecked cannot be check by compiler hence called unchecked
 * -- Unchecked exception(i.e. Runtime exception) always propagates to the source
 * Runtime excep: Arithmetic,NumberFormat and Null pointer exceptions  
 * 
 */
public class UncheckedException {

	/**
	 * No need to catch or declare. If catched, program would have been saved
	 */
	public void compilerDontBother() {
		int i = 100 / 0;
	}

	/**
	 *  Like checked exception, we can catch if we want to,
	 */
	public void catchRuntimeException() {

		try {
			int i = 100 / 0;
		} catch (ArithmeticException e) {
			// successfully recovered program
		}
		System.out.println("runtime catched and prog resumed");
	}

	/**
	 *  Like checked exception, we can declare using 'throws' if we want to
	 */
	public void freeToDeclareRuntimeException() throws ArithmeticException {
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		UncheckedException obj = new UncheckedException();
		//obj.compilerDontBother();
		obj.catchRuntimeException();
		obj.freeToDeclareRuntimeException();

	}
}
