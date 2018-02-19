package java8.lambdas;

/**
 * Biggest adv: Backward compatibility old code can be run with lambda
 * 
 * Lambda can be used with threads as Runnable is a functional interface
 */
public class D_ThreadWithLambdas {

	public static void main(String[] args) {
		
		//method 1 : old legacy code
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("running in thread mode 1 ...");
			}
		});
		t1.run();
		
		
		//method 2: lambda
		Thread t2 = new Thread(() -> System.out.println("running in thread mode 2 ..."));
		t2.run();
		
	}
}
