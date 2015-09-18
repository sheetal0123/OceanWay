package classes;

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
}

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


