package cleancode;

/**
 * Rule: 
 * 1. The best place to make local variable is where we have to use them;
 * 2. Should have min scope. 
 * 
 * @author Sheetal_Singh
 */
public class E_LocalVariableSolution {

	public void correctUsageOfLocalVariable() {
		int j = 10;
		int sum = j + 100;
		System.out.println("Sum is: " + sum);
	}
}
