package exceptions;

/*
 * Unchecked exception(i.e. Runtime exception) always propagates to the source
 * Runtime excep: Arithmetic,NumberFormat and Null pointer exceptions  
 * Unchecked cannot be check by compiler hence called unchecked
 */
public class UncheckedException1 {

	public void method3(){
		System.out.println("method3");
		int i=100/0; // Arithmetic unchecked exception 
		System.out.println(i);
	}
	
	public void method2(){
		System.out.println("method2");
		method3();
		System.out.println("method2 return");  // unreachable code
	}
	
	public void method1(){
		System.out.println("method1");
		method2();
		System.out.println("method1 return"); // unreachable code
	}
	
	public static void main(String [] args){
		UncheckedException1 obj=new UncheckedException1();
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