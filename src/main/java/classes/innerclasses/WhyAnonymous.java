package classes.innerclasses;

/**
 * Why need anonymous class:  Suppose we have a legacy code and we want to change its method behavior
 * then we have one option to extend it and override method 
 * 
 * Using anonymous class we can save on creating a new class, extending it and overriding a method
 * 
 * Class files : WhyAnonymous.class, Parent.class, Child.class
 */
public class WhyAnonymous {

	public static void main(String [] args){
		Parent p =new Child();
		p.show();  // show videos
	}
}


//legacy code
class Parent {
	public void show(){
		System.out.println("show pictures");
	}
}

//new code
class Child extends Parent{
	@Override
	public void show(){
		System.out.println("show videos");
	}
}
