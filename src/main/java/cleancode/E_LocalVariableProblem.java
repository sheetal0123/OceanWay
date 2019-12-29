package cleancode;

public class E_LocalVariableProblem {

	int i = 10; // initialized outside method
	int sum;

	public void invalidUsage() {
		sum = i + 100;
		System.out.println("Sum is: " + sum);
	}
}
