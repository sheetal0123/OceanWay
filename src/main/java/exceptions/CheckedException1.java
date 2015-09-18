package exceptions;

import java.io.IOException;

/*
 * Checked exception(i.e. SQL,IO etc) can't propagates and have to be handled at the point of generation 
 * Checked can be checked by compiler and hence called checked 
 * Checked exception can be throw using 'throw' keyword but have to handle immediately
 */
public class CheckedException1 {

	public void method3(){
		System.out.println("method3");
//		throw new IOException(); // compiler error
		try {
			throw new IOException(); 
		} catch (IOException e) {
			System.out.println("Exception handled");
		}
	}
	
	public void method2(){
		System.out.println("method2");
		method3();
		System.out.println("method2 out"); 
	}
	
	public void method1(){
		System.out.println("method1");
		method2();
		System.out.println("method1 out");
	}
	
	public static void main(String [] args){
		CheckedException1 obj=new CheckedException1();
		obj.method1();
	}
}

/* unchecked exception propagates till main method
method1
method2
method3
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptions.ThrowExample1.method3(ThrowExample1.java:7)
	at exceptions.ThrowExample1.method2(ThrowExample1.java:12)
	at exceptions.ThrowExample1.method1(ThrowExample1.java:17)
	at exceptions.ThrowExample1.main(ThrowExample1.java:23)
*/