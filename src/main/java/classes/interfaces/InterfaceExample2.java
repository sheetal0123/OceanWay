package classes.interfaces;

interface Curable {
	void cure(); // abstract
}


interface Durable extends Curable{
	int TON = 100; // static + final
	void size(); // abstract
}


abstract class Games implements Durable{
	abstract void basketball();//abstract
	void football(){
		//non abstract method
	}
	//Abstract class is free to implement or non implementation of interface methods
}

//Non Abstract class has to implement interface methods
public class InterfaceExample2 extends Games{
	public void cure(){
		//implemented - Curable method
	}
	
	public void size(){
		//implemented - Durable method
	}
	
	public void basketball(){
		//implemented - abstract class method
	}
	
	public static void main(String [] args){
		InterfaceExample2 obj=new InterfaceExample2();
		obj.size();
		obj.basketball();
	}
}


