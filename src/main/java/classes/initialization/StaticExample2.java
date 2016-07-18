package classes.initialization;

/**
 * 
 * all static member will run eve before content of main() method
 * static member called once for first object not get initialized for second object
 * class variables run before class constructors
 * 
 */

class Bata{
	Bata(int a){
		System.out.println("I am Bata Constructor" + a);
	}
	
}

class Tata{
	
	Tata(){
		System.out.println("I am Tata Construtor \n");
	}
	
	static Bata a = new Bata(1);  // executes only once
	
	Bata b = new Bata(2); // run before constructor
	
}


public class StaticExample2 {

	public static void main(String [] args){
		
		System.out.println("I am MAIN");
		
	}
	
	
	static Tata t1 = new Tata();
	static Tata t2 = new Tata();
	
}

/*

I am Bata Constructor1
I am Bata Constructor2
I am Tata Construtor 

I am Bata Constructor2
I am Tata Construtor 

I am MAIN

*/