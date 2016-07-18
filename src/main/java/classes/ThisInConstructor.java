package classes;


/*
 'this' normally used to refer to instance/object of class which is being used
 but in case of constructors, 'this' calls to another constructor in same class 
 */
public class ThisInConstructor {

	public ThisInConstructor() {
		this("Orange"); // Call constructor of same class
		//this("Apple"); // only one 'this' allowed inside constructor
	}

	public ThisInConstructor(String string) {
		System.out.println("Param Const:"+ string);
	}
	
	
	public void normalMethod(){
		//this();   can only be used from inside a constructor
	}

	public static void main(String [] args){
		ThisInConstructor obj1=new ThisInConstructor();
		ThisInConstructor obj2=new ThisInConstructor("Mango");
		
	}
}
/*
	Param Const:Orange
	Param Const:Mango
*/