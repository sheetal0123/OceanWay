package classes.initialization;

/*
 * static var share common copy for all class object
 * static method can directly access only static methods/variables
 * all static member executed in sequence they appear
 * this(), super() cannot be used inside static methods
 */

public class StaticExamples{

	static int a=10;
	int b=20;
	
	static{
		System.out.println("i am a static block:"+a);
	}
	
	public static void method1(){
		System.out.println("I am a static method:"+a);
//		this.a=a;  // compiler error
//		method2(); // compiler error
//		System.out.println("b="+b); // compiler error
	}
	
	public void method2(){
		System.out.println("I am a non static method:"+a);
		System.out.println("I can access non static var:"+b);
	}
	
	public static void main(String [] args){
		method1();
		System.out.println("I can access static var w/o obj:"+a);

		StaticExamples obj1=new StaticExamples();
		StaticExamples obj2=new StaticExamples();
		obj1.method2();
		
		obj1.a=50; // a=50
		obj2.a=a+1; // a=50+1
		System.out.println(obj1.a); //51
		System.out.println(obj2.a); //51
		
		obj1.b=50;   // b=50
		obj2.b=obj2.b+1;  // b=20+1ß
		System.out.println(obj1.b);  // 50
		System.out.println(obj2.b);  // 21
	}
}

/* o/p

i am a static block:10
I am a static method:10
I can access static var w/o obj:10
I am a non static method:10
I can access non static var:20
51
51
50
21

*/