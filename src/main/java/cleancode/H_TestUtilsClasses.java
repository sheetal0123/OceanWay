package cleancode;

public class H_TestUtilsClasses {

	public static void utils1() {
		H_UtilClassProblem obj1 = new H_UtilClassProblem();

		String concat = obj1.concatenate("Hello", " World ");
		String result = obj1.printMe("Clean Code Exercise");

		System.out.println("Case1: ");
		System.out.println(concat);
		System.out.println(result);
	}

	public static void utils2() {
		// H_UtilClassSolution obj1 = new H_UtilClassSolution();
		String concat = H_UtilClassSolution.concatenate("Hello", " World ");
		String result = H_UtilClassSolution.printMe("Clean Code Exercise");

		System.out.println("\n\nCase2: ");
		System.out.println(concat);
		System.out.println(result);
	}

	public static void main(String[] args) {
		utils1();
		//utils2();
	}

}
