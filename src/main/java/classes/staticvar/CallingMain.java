package classes.staticvar;

/**
 * This is just to show that object can call a static method
 * But Ideally its of no use to call a static method from object we should call using class name
 * static method will not behave differently based on object value hence use class name
 *
 * interview question
 *
 */
public class CallingMain {
	
	public static void callme(CallingMain obj){
		System.out.println("I am in Method");
		String [] arr = {};
		//obj.main(arr);  // also work fine but get into a loop
		obj.iamstatic();
	}
	
	public static void iamstatic(){
		System.out.println("I am in static method");
	}
	
	public static void main(String [] args){
		CallingMain obj = new CallingMain();
		System.out.println("I am in Main");
		obj.callme(obj);	
	}
	
}
