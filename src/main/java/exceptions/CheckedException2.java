package exceptions;

import java.io.IOException;

/*
 * As seen when we 'throw' checked exception, we have to handle there and there only unlike unchecked
 * But using 'throws' we can handle checked exception later in code by propagating exception 
 */
public class CheckedException2 {

	public void method3() throws IOException{
		System.out.println("method3");
		throw new IOException(); 
	}
	
	public void method2() throws IOException{
		System.out.println("method2");
		method3();
		System.out.println("method2 out"); // unreachable code
	}
	
	public void method1() throws IOException{
		System.out.println("method1");
		method2();
		System.out.println("method1 out"); // unreachable code
	}
	
	public static void main(String [] args){
		CheckedException2 obj=new CheckedException2();
		try {
			obj.method1();
		} catch (IOException e) {
			System.out.println("Checked exception handled");
		}
	}
}

/*
method1
method2
method3
Checked exception handled
*/