package cleancode;

/**
 * Rule: The best place to make local variable is where we have to use them;
 * should have min scope. Here i is defined as class variable but used only in
 * 
 * @author Sheetal_Singh
 */
public class LocalVariable {

	int i = 10; // initialized outside method

	public void invalidUsage() {
		int sum = i + 100;
		System.out.println("Sum is: " + sum);
	}

	public void useOfLocalVariable() {
		int j = 10; // initialized inside method
		int sum = j + 100;
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		LocalVariable localVariable = new LocalVariable();
		localVariable.invalidUsage();
		localVariable.useOfLocalVariable();
	}

}
