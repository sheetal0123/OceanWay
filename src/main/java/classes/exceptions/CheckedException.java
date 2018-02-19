package classes.exceptions;

import java.io.IOException;

/*
 * Checked CAN BE checked by compiler and hence called checked e.g. SQL, IO
 * Checked exception has to be handle using try-catch or method can declare using 'throws' keyword
 * Unchecked exception not mandatory to handle using try-catch or to declare it using 'throws' keyword
 * In both the case checked/unchecked: catch block try to recover program and resume but not always
 * Both exception can be throw using 'throw' keyword from inside method and 'throws' from method declaration
 *  
 * -- Checked exception can't propagates and have to be handled at the point of generation 
 * -- Checked exception can be throw using 'throw' keyword but have to handle immediately
 */
public class CheckedException {

	//method 3 got an exception, but it throws rather handling it using catch
	public void method3() throws IOException{
		System.out.println("method3");
		throw new IOException(); 
	}
	
	//exception comes to method2 from method3, this method also not handled it
	public void method2() throws IOException{
		System.out.println("method2");
		method3(); 
		System.out.println("method2 out"); //Will not get executed
	}
	
	/**
	 * I am not throwing exception hence I need to catch it
	 */
	public void method1(){
		System.out.println("method1");
		try {
			method2();
		} catch (IOException e) {
			System.out.println("Exception Handled");
		}
		System.out.println("catch recovered from exception sucessfully");
	}
	
	public static void main(String [] args){
		CheckedException obj=new CheckedException();
		obj.method1();
	}
}

/* 
method1
method2
method3
Exception Handled
catch recovered from exception successfully
	
	
*/