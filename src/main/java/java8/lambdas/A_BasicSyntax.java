package java8.lambdas;

/**
 *  lambda work with functional interface i.e. interface with one method
 *  
 */

public class A_BasicSyntax {

	public static void main(String[] args) {
		Greet g = new Greet();
		System.out.println("Length: "+g.getLength("Hello Lamdas"));;
	}

}

class Greet implements Greeting {

	@Override
	public int getLength(String s) {
		return s.length();
	}

}

interface Greeting {
	public int getLength(String s);
}
