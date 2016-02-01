package exceptions;

import java.io.IOException;

/*
 * Checked CAN BE checked by compiler and hence called checked e.g. SQL, IO
 * Checked exception can't propagates and have to be handled at the point of generation 
 * Checked exception can be throw using 'throw' keyword but have to handle immediately
 */
public class CheckedException1 {

	public void method3() throws IOException{
		System.out.println("method3");
		throw new IOException(); 
	}
	
	public void method2() throws IOException{
		System.out.println("method2");
		method3(); 
		System.out.println("method2 out"); //Will not get executed
	}
	
	public void method1(){
		System.out.println("method1");
		try {
			method2();
		} catch (IOException e) {
			System.out.println("Exception Handled");
		}
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
Exception Handled
method1 out
	
	
*/