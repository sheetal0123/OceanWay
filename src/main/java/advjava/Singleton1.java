package advjava;

/**
 * One of the design pattern
 * Ensure only one instance/object of a class can be created
 * Expose a public method through which we can access it
 * 
 * step:
 * constructor shd be private
 * create static object and return using public method
 * 
 * volatile : instance shd be volatile for thread safety
 * java make sure volatile var write to and read from main memory 
 * volatile var will not be cached locally
 * 
 * Ranjith: https://www.youtube.com/watch?v=QsBQnFUx388
 */

public class Singleton1 {
	
	//create a static class level instance
	private static volatile Singleton1 instance = new Singleton1();
	
	//private const make sure no one can create other obj using new keyword
	private Singleton1(){
		
	}
	
	//public method ensure anyone can access it
	public static Singleton1 getInstance(){
		
		//lazily loading object
		if(instance == null){
			instance = new Singleton1();
		}
		
		return instance;
	}

}



