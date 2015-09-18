package exceptions;
/*
 * Unchecked exception can also be throw using 'throw' keyword and no need to handle immediately
 */
public class UncheckedException2 {

	public void method3(int age){
		System.out.println("method3");
		if(age<18){
			throw new ArithmeticException("Can't vote");
		}
	}
	
	public void method2(){
		System.out.println("method2");
		method3(17);
		System.out.println("method2 return");  // unreachable code
	}
	
	public void method1(){
		System.out.println("method1");
		method2();
		System.out.println("method1 return"); // unreachable code
	}
	
	public static void main(String [] args){
		UncheckedException2 obj=new UncheckedException2();
		try{
			obj.method1();
		}catch(ArithmeticException e){
			System.out.println("Unchecked handled");
		}
	}
}

/*
method1
method2
method3
Unchecked handled
*/